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


@WebServlet("/Produit")
public class ServletProduit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private GestBesoinLocal dao;
	
	public ServletProduit() {
		super();
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idCategorie = Integer.parseInt(request.getParameter("idCategorie"));
		
		
		List<Produit> produits = dao.getProduitByCategorie(idCategorie);
		//response.getWriter().append("Catégorie"+idCategorie+ "Produits récupérés = "+produits.size()).append(request.getContextPath());

		if(produits.size()!=0)
		{
			request.setAttribute("categorie",produits.get(0).getCategorie().getLibelle() ); //nom de la catégorie
			request.setAttribute("ListProduits", produits);
			request.setAttribute("NombreProduit", produits.size());
			request.getRequestDispatcher("produits.jsp").forward(request,response);

		}
		else
		{
			request.getRequestDispatcher("404.jsp").forward(request,response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
