package web;

import java.util.regex.*;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.entities.Utilisateur;
import metier.session.PlatformGDImpl;
import metier.session.PlatformGDLocal;
import service.DaoManagement;

@WebServlet("/LoginPage")

public class ServletManagement extends HttpServlet {

	/**
	*
	*/
	private static final long serialVersionUID = 1L;
	@EJB
	private PlatformGDLocal metier;

	public ServletManagement() {
		metier = new PlatformGDImpl();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		if ((Boolean) (session.getAttribute("logged") != null)
				&& (Boolean) (session.getAttribute("logged").equals(true))) {
			request.getRequestDispatcher("ajoutBesoin.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("LoginPage.jsp").forward(request, response);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		boolean auth = false;
		if ((Boolean) (session.getAttribute("logged") != null)
				&& (Boolean) (session.getAttribute("logged").equals(true))) {
			
			request.getRequestDispatcher("ajoutBesoin.jsp").forward(request, response);
		} else {
			String username = request.getParameter("username");
			String clearPassword = request.getParameter("password");
			DaoManagement daoManagement = new DaoManagement();
			auth = daoManagement.authentification(username, clearPassword);
			session.setAttribute("logged", auth);
			if (auth == true) {

				Utilisateur utilisateur = new Utilisateur();
				utilisateur = (Utilisateur) metier.authentification_Utilisateur(username);
				if(utilisateur.equals(null)) {
					System.out.println("++++++++++++++++++");
				}
				request.setAttribute("ID", utilisateur.getIdut());
				request.setAttribute("e-mail", username);
				request.setAttribute("Nom", utilisateur.getNom());
				request.setAttribute("prenom", utilisateur.getPrenom());
				request.setAttribute("role", utilisateur.getRole());
				session.setAttribute("utilisateur", utilisateur);
				
				request.getRequestDispatcher("ajoutBesoin.jsp").forward(request, response);
				
			} else {
				request.setAttribute("errur1", "check your password or e-mail");
				request.getRequestDispatcher("LoginPage.jsp").forward(request, response);
			}
		}
	}
}