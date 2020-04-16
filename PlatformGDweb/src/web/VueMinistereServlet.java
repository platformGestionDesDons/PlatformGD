package web;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.session.PlatformGDLocal;

@WebServlet(urlPatterns = { "/Dashboard_ministere" })
public class VueMinistereServlet extends HttpServlet{
	
	@EJB
	private PlatformGDLocal metier;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/VueMinistere.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		if (action.equals("Voir tous les dons en nature")) {	
			req.setAttribute("don", metier.getAllDonsEnNature());
			req.getRequestDispatcher("/VueMinistere.jsp").forward(req, resp);
		} else if (action.equals("Voir tous les reglements")){
			req.setAttribute("don", metier.getAllDonsReglement());
			req.getRequestDispatcher("/VueMinistere.jsp").forward(req, resp);
		} else if (action.equals("Etablissement")){
			String nom_etablissement = req.getParameter("Etablissement");
			req.setAttribute("don", metier.getDonByEtablissement(nom_etablissement));
			req.getRequestDispatcher("/faireUnReglement.jsp").forward(req, resp);
		} else if (action.equals("Donnateur")) {
			String mail_donnateur = req.getParameter("Donnateur");
			req.setAttribute("don", metier.getDonByDonnateur(mail_donnateur));
			req.getRequestDispatcher("/faireUnReglement.jsp").forward(req, resp);
		}
	}
}
