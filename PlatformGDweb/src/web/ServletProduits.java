package web;
import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.entities.Categorie;
import metier.entities.Produit;
import metier.entities.UniteDeMesure;
import metier.session.GestBesoinLocal;


@WebServlet("/produits")
public class ServletProduits extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private GestBesoinLocal dao;
	
	public ServletProduits() {
		super();
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			List<Produit> produits = dao.getAllProduit();
			request.setAttribute("ListProduits", produits);
			request.getRequestDispatcher("produits.jsp").forward(request,response);


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String libelle = request.getParameter("libelle");
		String description =request.getParameter("description");
		double prixMin =Double.parseDouble(request.getParameter("prixMin"));
		double prixMax= Double.parseDouble(request.getParameter("prixMax"));
		String idUnite=request.getParameter("udm");
		int idC = Integer.parseInt(request.getParameter("categorie"));
		
		Produit p = new Produit( libelle, description,  prixMax, prixMin );
				
		UniteDeMesure udm = dao.getUniteDeMesureById(idUnite);
		p.setUniteDeMesure(udm);
		Categorie categorie = dao.getCategorieById(idC);
		p.setCategorie(categorie);
		
		dao.ajoutProduit(p);

	    List<Produit> produits = dao.getAllProduit();
		request.setAttribute("ListProduits", produits);
		request.getRequestDispatcher("produits.jsp").forward(request, response);
			
		
	}
	
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{

		String idProduit = request.getParameter("id");
		Produit produit = dao.getProduitById(idProduit);
		dao.deleteProduit(produit);
		response.getWriter().println(true);
	}

}