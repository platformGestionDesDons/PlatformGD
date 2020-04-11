package web.view;
import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.entities.Produit;
import metier.session.GestBesoinLocal;



@WebServlet("/Produits")
public class ServletProduits extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private GestBesoinLocal dao;
	
	public ServletProduits() {
		super();
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idProduit = Integer.parseInt(request.getParameter("idProduit"));
		
		
		Produit produit = dao.getProduitById(idProduit);
		
		if(produit != null) 
		{
		request.setAttribute("produit",produit);
		request.getRequestDispatcher("produits.jsp").forward(request,response);
		}
		else {
			request.getRequestDispatcher("404.jsp").forward(request,response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
