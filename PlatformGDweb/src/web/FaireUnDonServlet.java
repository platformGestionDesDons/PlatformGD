package web;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.EJB;
import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.entities.DonEnNature;
import metier.session.PlatformGDLocal;

@WebServlet(urlPatterns = { "/faire_un_don" })
public class FaireUnDonServlet extends HttpServlet {

	@EJB
	private PlatformGDLocal metier;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("besoin", metier.getAllBesoin());
		req.getRequestDispatcher("/etablissement_hopitale.jsp").forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		if (action.equals("Faire un don en nature")) {	
			req.setAttribute("besoin", metier.getAllBesoin());
			req.getRequestDispatcher("/faireUnDonEnNature.jsp").forward(req, resp);
		} else if (action.equals("faire un don reglement")){
			req.getRequestDispatcher("/faireUnReglement.jsp").forward(req, resp);
		}
	}
}
