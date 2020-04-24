package web;
import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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
import metier.entities.Etablisement;
import metier.entities.Photo;
import metier.entities.PhotoBesoin;
import metier.entities.Produit;
import metier.session.PlatformGDLocal;


@WebServlet("/besoins")
@MultipartConfig
public class ServletBesoins extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String UPLOAD_DIRECTORY = "uploads\\images\\besoins";

	@EJB
	private PlatformGDLocal dao;
	
	public ServletBesoins() {
		super();
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		List<Besoin> besoins = dao.getAllBesoin();


			request.setAttribute("ListBesoins", besoins);
			request.setAttribute("NombreBesoin", besoins.size());
			request.getRequestDispatcher("besoins.jsp").forward(request,response);



	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{

			String idProduit = request.getParameter("produit");
			int quantite = Integer.parseInt(request.getParameter("quantite"));
			String priorite =  request.getParameter("Priorite");		
			String motif =  request.getParameter("motif");
			
			Besoin b = new Besoin(new Date(), "Non servi", quantite, quantite, priorite, false, motif);
			Produit produit = dao.getProduitById(idProduit);
			b.setProduit(produit);
			

			
			 PhotoBesoin photoBesoin = new PhotoBesoin();
			 
			 List<Photo> photos = new ArrayList<Photo>();
			 
			// Handle photos
			String uploadPath = getServletContext().getRealPath("") + File.separator + UPLOAD_DIRECTORY;
			File uploadDir = new File(uploadPath);
			if (!uploadDir.exists()) uploadDir.mkdir();
			String fileName;
			String extension; 
			int photoIndex=1;
			List<Part> fileParts = request.getParts().stream().
					 filter(part->"file".equals(part.getName())).collect(Collectors.
					         toList());
			 
			 if(fileParts.get(0).getSubmittedFileName().length()>0)
			 {				 
				 for (Part part : fileParts) 
				{

						

					 if(!(part.getContentType().equalsIgnoreCase("image/jpeg"))&&!(part.getContentType().equalsIgnoreCase("image/png")))
					 {
							request.setAttribute("errMsg", "Format de photo non supporté");
							request.getRequestDispatcher("404.jsp").forward(request, response);
					 }
						fileName = part.getSubmittedFileName();
						extension = fileName.substring(fileName.lastIndexOf(".") + 1);
					    fileName = b.getIdBesoin();
					    fileName = fileName + "__" + Integer.toString(photoIndex) + "." +extension;
					    photoIndex++;
					    Photo photo = new Photo();
					    photo.setIdP(fileName);    // Id photo = filename in directory
					    dao.ajoutPhoto(photo);
					    photos.add(photo);
					    part.write(uploadPath + File.separator + fileName);
					 
				}
				 photoBesoin.setPhotos(photos);
				 b.setPhotoBesoin(photoBesoin);
			 }
			 dao.ajoutBesoin(b);
			 
				// test ********************************************************
//				List<Etablisement> etablisements = new ArrayList<Etablisement>();
//				etablisements = dao.getAllEtablissement();
//				etablisements.get(0).addBesoin(b);
//				dao.updateEtablisement(etablisements.get(0));
//				dao.updateBesoin(b);
				// test *********************************************************
			 
			List<Besoin> besoins = dao.getAllBesoin();
			request.setAttribute("ListBesoins", besoins);
			request.getRequestDispatcher("besoins.jsp").forward(request, response);
	}
	
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{

		String idBesoin = request.getParameter("id");
		Besoin besoin = dao.getBesoinById(idBesoin);
		dao.deleteBesoin(besoin);
		response.getWriter().println(true);
	}

}
