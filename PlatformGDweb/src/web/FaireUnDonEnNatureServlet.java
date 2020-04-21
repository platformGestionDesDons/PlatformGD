package web;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import metier.entities.Besoin;
import metier.entities.Categorie;
import metier.entities.DonEnNature;
import metier.entities.Etablisement;
import metier.entities.Photo;
import metier.entities.PhotoBesoin;
import metier.entities.PhotoDon;
import metier.entities.Utilisateur;
import metier.session.PlatformGDLocal;

@WebServlet(urlPatterns = { "/don_en_nature" })
@MultipartConfig
public class FaireUnDonEnNatureServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final String UPLOAD_DIRECTORY = "uploads\\images\\Don_en_nature";

	@EJB
	private PlatformGDLocal metier;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/faireUnDonEnNature.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		if (action.equals("Faire un don en nature")) {
			String id_besoin = req.getParameter("b");
			String date_planifiee = req.getParameter("date_planifiee");
			String visibilite = req.getParameter("visibilite");
			String id_beneficiaie = req.getParameter("bene");
			double prix_totale = Double.parseDouble(req.getParameter("prix_totale"));
			int quantite = Integer.parseInt(req.getParameter("quantite"));
			//String id_fournisseur = req.getParameter("c");
			
			DonEnNature don_en_nature = new DonEnNature(date_planifiee, false, false, visibilite, prix_totale, quantite, false);
			
			Besoin besoin = metier.getBesoinById(id_besoin);
			Etablisement beneficiaire = metier.findetablissement(id_beneficiaie);
			//Utilisateur donnateur = metier.findUtilisateurById(idut);
			//don_en_nature.setUtilisateur(donnateur);
			don_en_nature.setBesoin(besoin);
			don_en_nature.setEtablissement(beneficiaire);
			
			PhotoDon photoDon = new PhotoDon();
			 
			 List<Photo> photos = new ArrayList<Photo>();
			
			//handle photo
			String uploadPath = getServletContext().getRealPath("") + File.separator + UPLOAD_DIRECTORY;
			File uploadDir = new File(uploadPath);
			if (!uploadDir.exists()) uploadDir.mkdir();
			String fileName;
			String extension; 
			int photoIndex=1;
			List<Part> fileParts = req.getParts().stream().
					 filter(part->"file".equals(part.getName())).collect(Collectors.
					         toList());
			 
			 if(fileParts.get(0).getSubmittedFileName().length()>0)
			 {				 
				 for (Part part : fileParts) 
				{
					fileName = part.getSubmittedFileName();
					extension = fileName.substring(fileName.lastIndexOf(".") + 1);
				    fileName = don_en_nature.getId_don();
				    fileName = fileName + "__" + Integer.toString(photoIndex) + "." +extension;
				    photoIndex++;
				    Photo photo = new Photo();
				    photo.setIdP(fileName);    // Id photo = filename in directory
				    metier.ajoutPhoto(photo);
				    photos.add(photo);
				    part.write(uploadPath + File.separator + fileName);
				}
				 photoDon.setPhotos(photos);
				 don_en_nature.setPhotoDon(photoDon);
			 }


			metier.ajouterDonEnNature(don_en_nature);
			req.getRequestDispatcher("/faireUnDonEnNature.jsp").forward(req, resp);
		}
	}

}
