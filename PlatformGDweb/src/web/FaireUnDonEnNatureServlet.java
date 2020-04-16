package web;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.entities.DonEnNature;
import metier.session.PlatformGDLocal;

@WebServlet(urlPatterns = { "/don_en_nature" })
public class FaireUnDonEnNatureServlet extends HttpServlet {
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
			String date_planifiee = req.getParameter("date_planifiee");
			String visibilite = req.getParameter("visibilite");
			boolean vu = Boolean.parseBoolean(req.getParameter("vu"));
			String nom_produit = req.getParameter("nom_produit");
			double prix_totale = Double.parseDouble(req.getParameter("prix_totale"));
			int quantite = Integer.parseInt(req.getParameter("quantite"));

			DonEnNature don_en_nature = new DonEnNature(date_planifiee, visibilite, vu,
					prix_totale, quantite, nom_produit);

			metier.ajouterDonEnNature(don_en_nature);
			req.getRequestDispatcher("/faireUnDonEnNature.jsp").forward(req, resp);
		}
	}
}
