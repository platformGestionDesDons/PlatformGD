package web;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.entities.Besoin;
import metier.entities.DonEnNature;
import metier.session.PlatformGDLocal;

@WebServlet(urlPatterns = { "/ajouter_besoin" })
public class AjouterBesoinServlet extends HttpServlet{
	@EJB
	private PlatformGDLocal metier;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/ajouterBesoin.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		if (action.equals("ajouter un besoin")) {
			String nom_besoin = req.getParameter("nom_besoin");
			String etat = req.getParameter("etat");
			int quantite = Integer.parseInt(req.getParameter("quantite"));

			Besoin besoin = new Besoin(nom_besoin, etat, quantite);

			metier.ajouterBesoin(besoin);
			req.getRequestDispatcher("/ajouterBesoin.jsp").forward(req, resp);
		}
	}
}
