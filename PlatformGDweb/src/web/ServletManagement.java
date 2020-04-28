package web;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.entities.Utilisateur;
import metier.session.PlatformGDLocal;
import service.DaoManagement;

@WebServlet("/LoginPage")

public class ServletManagement extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	@EJB
	private PlatformGDLocal metier;

	public ServletManagement() {}

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		if ((Boolean) (session.getAttribute("user") != null)) 
		{
			System.out.println("**************************** Sesssion ******************************************");
			System.out.println(session);
			System.out.println(session.getAttribute("user"));
			request.getRequestDispatcher("ajoutBesoin.jsp").forward(request, response);
		} 
		else 
		{
			request.getRequestDispatcher("LoginPage.jsp").forward(request, response);
		}
	}
	
	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		//user already logged in
		if ((Boolean) (session.getAttribute("user") != null)) 
		{
			request.getRequestDispatcher("ajoutBesoin.jsp").forward(request, response);
		}
		
		//user not logged in
		else 
		{
			String username = request.getParameter("username");
			String clearPassword = request.getParameter("password");
			DaoManagement daoManagement = new DaoManagement();
			Utilisateur utilisateur = daoManagement.hashPassword(username, clearPassword);
			System.out.println("**************************** before if ******************************************");
			System.out.println(utilisateur);
			System.out.println("**************************** indisde if ******************************************");
			
			// User found
			if (utilisateur!=null) 
			{
				System.out.println("**************************** indisde if ******************************************");
				System.out.println(utilisateur);
				System.out.println("**************************** indisde if ******************************************");
				session.setAttribute("user", utilisateur);
				session.setAttribute("utilisateur", utilisateur);
				
				request.getRequestDispatcher("ajoutBesoin.jsp").forward(request, response);	
			}
			
			else 
			{
				request.setAttribute("errur1", "check your password or e-mail");
				request.getRequestDispatcher("LoginPage.jsp").forward(request, response);
			}
		}
	}
}