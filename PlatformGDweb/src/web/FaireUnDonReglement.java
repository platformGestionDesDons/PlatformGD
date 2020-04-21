package web;

import java.io.File;
import java.io.IOException;
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

import metier.entities.DonEnNature;
import metier.entities.Etablisement;
import metier.entities.Photo;
import metier.entities.PhotoDon;
import metier.entities.Reglement;
import metier.entities.Utilisateur;
import metier.session.PlatformGDLocal;



@WebServlet(urlPatterns = { "/don_reglement" })
@MultipartConfig
public class FaireUnDonReglement extends HttpServlet{
	@EJB
	private PlatformGDLocal metier;
	
	private static final String UPLOAD_DIRECTORY = "uploads\\images\\Reglement";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/faireUnReglement.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		if (action.equals("Faire un don reglement")) {
			String date_planifiee = req.getParameter("date_planifiee");
			String id_beneficiaire = req.getParameter("bene");
			String visibilite = req.getParameter("visibilite");
			String date_reglement = req.getParameter("date_reglement");
			String mode_reglement = req.getParameter("mode_reglement");
			double montant = Double.parseDouble((req.getParameter("montant")));

			Reglement reglement = new Reglement(date_planifiee, false, false, visibilite, montant, 
					date_reglement, mode_reglement, false);
			
			Etablisement beneficiaire = metier.findetablissement(id_beneficiaire);
			reglement.setEtablissement(beneficiaire);
			
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
				    fileName = reglement.getId_don();
				    fileName = fileName + "__" + Integer.toString(photoIndex) + "." +extension;
				    photoIndex++;
				    Photo photo = new Photo();
				    photo.setIdP(fileName);    // Id photo = filename in directory
				    metier.ajoutPhoto(photo);
				    photos.add(photo);
				    part.write(uploadPath + File.separator + fileName);
				}
				 photoDon.setPhotos(photos);
				 reglement.setPhotoDon(photoDon);
			 }

			metier.ajouterDonReglement(reglement);
			req.getRequestDispatcher("/faireUnReglement.jsp").forward(req, resp);
		}
	}
}
