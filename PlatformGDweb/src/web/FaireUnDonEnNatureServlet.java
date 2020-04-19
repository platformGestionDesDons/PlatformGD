package web;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.List;

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
import metier.session.PlatformGDLocal;

@WebServlet(urlPatterns = { "/don_en_nature" })
@MultipartConfig
public class FaireUnDonEnNatureServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private final static String serverPath = "images";

	@EJB
	private PlatformGDLocal metier;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    List<Besoin> besoins = metier.getAllBesoin();
		req.setAttribute("besoins", besoins);
		req.getRequestDispatcher("/faireUnDonEnNature.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		if (action.equals("Faire un don en nature")) {
			String date_planifiee = req.getParameter("date_planifiee");
			String visibilite = req.getParameter("visibilite");
			String nom_produit = req.getParameter("nom_produit");
			double prix_totale = Double.parseDouble(req.getParameter("prix_totale"));
			int quantite = Integer.parseInt(req.getParameter("quantite"));

			/*final Part filePart = req.getPart("file");
			String fileName = getFileName(filePart);

			OutputStream out = null;
			InputStream filecontent = null;
			final PrintWriter writer = resp.getWriter();

			try {
				out = new FileOutputStream(new File(serverPath + File.separator + fileName));
				filecontent = filePart.getInputStream();

				int read = 0;
				final byte[] bytes = new byte[1024];

				while ((read = filecontent.read(bytes)) != -1) {
					out.write(bytes, 0, read);
				}
				writer.println("New file " + fileName + " created at " + serverPath);

			} catch (FileNotFoundException fne) {
				writer.println("Missing file or no insufficient permissions.");
				writer.println(" ERROR: " + fne.getMessage());
			} finally {
				if (out != null) {
					out.close();
				}
				if (filecontent != null) {
					filecontent.close();
				}
				if (writer != null) {
					writer.close();
				}
			}

			
			 * Part filePart = req.getPart("file"); // Retrieves <input type="file"
			 * name="file"> String fileName =
			 * Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE
			 * fix. InputStream fileContent = filePart.getInputStream();
			 * 
			 * 
			 * try {
			 * 
			 * OutputStream os = new FileOutputStream("/webContent/images/"+fileName);
			 * 
			 * byte[] buffer = new byte[1024]; int bytesRead; //read from is to buffer
			 * while((bytesRead = fileContent.read(buffer)) !=-1){ os.write(buffer, 0,
			 * bytesRead); } fileContent.close(); //flush OutputStream to write any buffered
			 * data to file os.flush(); os.close(); } catch (IOException e) {
			 * e.printStackTrace(); }
			 */

			// ***************************************

			DonEnNature don_en_nature = new DonEnNature(date_planifiee, visibilite, prix_totale, quantite, nom_produit);

			metier.ajouterDonEnNature(don_en_nature);
			req.getRequestDispatcher("/faireUnDonEnNature.jsp").forward(req, resp);
		}
	}

	/*private String getFileName(Part filePart) {
		String header = filePart.getHeader("content-disposition");
		String name = header.substring(header.indexOf("filename=\"") + 10);
		return name.substring(0, name.indexOf("\""));
	}*/
}
