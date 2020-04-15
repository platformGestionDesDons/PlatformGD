package web;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.entities.DonEnNature;
import metier.entities.Reglement;
import metier.session.PlatformGDLocal;


@WebServlet(urlPatterns = { "/don_reglement" })
public class FaireUnDonReglement extends HttpServlet{
	@EJB
	private PlatformGDLocal metier;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/faireUnReglement.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		if (action.equals("Faire un don reglement")) {
			String date_planifiee = req.getParameter("date_planifiee");
			boolean estAcceptee = Boolean.parseBoolean(req.getParameter("est_acceptee"));
			boolean estSupprimee = Boolean.parseBoolean(req.getParameter("est_supprimee"));
			String visibilite = req.getParameter("visibilite");
			boolean vu = Boolean.parseBoolean(req.getParameter("vu"));
			String date_reglement = req.getParameter("date_reglement");
			String mode_reglement = req.getParameter("mode_reglement");
			double montant = Double.parseDouble((req.getParameter("montant")));

			Reglement reglement = new Reglement(date_planifiee, estAcceptee, estSupprimee, visibilite, vu, montant, 
					date_reglement, mode_reglement);

			metier.ajouterDonReglement(reglement);
			req.getRequestDispatcher("/faireUnReglement.jsp").forward(req, resp);
		}
	}
}
