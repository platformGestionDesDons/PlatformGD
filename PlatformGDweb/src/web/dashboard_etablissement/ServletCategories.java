package web.dashboard_etablissement;
import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.entities.Categorie;
import metier.session.PlatformGDLocal;


@WebServlet("/categories")
public class ServletCategories extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private PlatformGDLocal dao;
	
	public ServletCategories() {
		super();
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			List<Categorie> categories = dao.getAllCategorie();
			request.setAttribute("categories", categories);
			request.getRequestDispatcher("Dashboard_etablissement/categories.jsp").forward(request,response);


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String libelle = request.getParameter("libelle");

		if(libelle!=null) 
		{
			Categorie c = new Categorie(libelle);
			dao.ajoutCategorie(c);
			
		}

		List<Categorie> categories = dao.getAllCategorie();
		request.setAttribute("categories", categories);
		request.getRequestDispatcher("Dashboard_etablissement/categories.jsp").forward(request,response);
	}
	
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{

		String idCategorie = request.getParameter("id");
		Categorie categorie = dao.getCategorieById(idCategorie);
		dao.deleteCategorie(categorie);
		response.getWriter().println(true);
	}

}
