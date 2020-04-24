package web;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.entities.Etablisement;
import metier.session.PlatformGDLocal;

@WebServlet(urlPatterns = { "/faire_un_don" })
public class FaireUnDonServlet extends HttpServlet {

	@EJB
	private PlatformGDLocal metier;
	
	//@EJB
	//private GestBesoinLocal dao;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String code_etablissement = (String) req.getParameter("id_etablissement");
		req.setAttribute("etablissement", metier.findetablissement(code_etablissement));
		req.setAttribute("besoin_etab", metier.getBesoinsByEtablissement(code_etablissement));//getBesoinByEtablissement(long id_etablissement)
		//req.setAttribute("donnateur", metier.getAllDonnateur());//getDonnateurByEtablissement(long id_etablissement)
		req.setAttribute("fournisseur",metier.getAllFournisseur());
		req.getRequestDispatcher("/etablissement_hopitale.jsp").forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String code_etablissement = (String) req.getParameter("id_etablissement");
		String action = req.getParameter("action");
		if (action.equals("Faire un don en nature")) {	
			req.setAttribute("besoin_etab", metier.getAllBesoin());//getBesoinByEtablissement(String id_etablissement)
			req.setAttribute("beneficiaire", metier.getAllEtablissement());
			req.setAttribute("fournisseur",metier.getAllFournisseur());
			req.getRequestDispatcher("/faireUnDonEnNature.jsp").forward(req, resp);
		} else if (action.equals("faire un don reglement")){
			req.setAttribute("beneficiaire", metier.getAllEtablissement());
			req.setAttribute("fournisseur",metier.getAllFournisseur());
			req.getRequestDispatcher("/faireUnReglement.jsp").forward(req, resp);
		}
	}
}
