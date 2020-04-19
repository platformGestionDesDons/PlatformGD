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

@WebServlet(urlPatterns = { "/supprimer_don" })
public class SupprimerDonServlet extends HttpServlet{

	@EJB
	private PlatformGDLocal metier;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String code_suppression_don_nature = (String) req.getParameter("code_don_en_nature");
        String code_suppression_don_reglement = (String) req.getParameter("code_reglement");
        
        if(!code_suppression_don_nature.equals(null)) {
        	DonEnNature don = metier.getDonEnNatureById(code_suppression_don_nature);
        	don.setEstSupprime(true);
        	metier.updateDonEnNature(don);
        	req.getRequestDispatcher("/VueMinistere.jsp").forward(req, resp);
        } else if (!code_suppression_don_reglement.equals(null)) {
        	Reglement reglement = metier.getDonEnReglementById(code_suppression_don_reglement);
        	reglement.setEstSupprime(true);
        	metier.updateReglement(reglement);
        }
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
