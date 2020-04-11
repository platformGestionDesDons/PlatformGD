package web.view;
import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.entities.Besoin;
import metier.entities.Produit;
import metier.session.GestBesoinLocal;


@WebServlet("/besoin")
public class ServletBesoin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private GestBesoinLocal dao;
	
	public ServletBesoin() {
		super();
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		List<Besoin> besoins = dao.getAllBesoin();

		if(besoins.size()!=0)
		{
			request.setAttribute("ListBesoins", besoins);
			request.setAttribute("NombreBesoin", besoins.size());
			request.getRequestDispatcher("besoin.jsp").forward(request,response);

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
