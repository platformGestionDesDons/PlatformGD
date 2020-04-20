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
import metier.session.PlatformGDLocal;

@WebServlet("/categorie")
public class ServletCategorie extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private PlatformGDLocal dao;
	
	
	public ServletCategorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		List<Categorie> categories = dao.getAllCategorie();

		// affichage des categories sur categorie.jsp
		request.setAttribute("ListCategories", categories);
		request.setAttribute("nombreCategorie", categories.size());
		request.getRequestDispatcher("categories.jsp").forward(request,response);
	}
	

}
