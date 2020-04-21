package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

import javax.ejb.EJB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.entities.Adresse;
import metier.entities.Etablisement;
import metier.entities.Telephone;
import metier.entities.Utilisateur;
import metier.session.PlatformGDImpl;
import metier.session.PlatformGDLocal;
import service.DaoManagement;

/**
 * Servlet implementation class AjoutEtudiant
 */
@WebServlet("/InscriptionEtablissement")
public class InscriptionEtablissement extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private PlatformGDLocal metier;

	public InscriptionEtablissement() {
		metier = new PlatformGDImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("InscriptionEtablissement.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String nom = request.getParameter("input1");
			String prenom = request.getParameter("input2");
			String email = request.getParameter("input3");
			String password = request.getParameter("input4");
			String role = request.getParameter("input5");

			Utilisateur utilisateur = new Utilisateur();

			utilisateur.setNom(nom);
			utilisateur.setPrenom(prenom);
			utilisateur.setEmail(email);
			utilisateur.setMdp(password);
			utilisateur.setRole(role);
			utilisateur.setEtatDecompte(true);

			DaoManagement daoManagement = new DaoManagement();
			
//////////////////////////////////////////////////////////////////////////
			List<Telephone> collection_tel = new ArrayList<Telephone>();
			
			String Tel = request.getParameter("input6");
			Telephone telephone = new Telephone();
			telephone.setNumero(Tel);
			collection_tel.add(telephone);
			//String id_tel = telephone.getIdTel();

			String FAX = request.getParameter("input10");
			Telephone fax = new Telephone();
			fax.setNumero("Fax:" + FAX);
			collection_tel.add(fax);
			//String id_tel_fax = fax.getIdTel();
////////////////////////////////////////////////////////////////////////
			List<Adresse> collection_adresse = new ArrayList<Adresse>();
			
			String c1 = request.getParameter("input7");
			String c2 = request.getParameter("input8");
			String c3 = request.getParameter("input9");

			Adresse adresse = new Adresse();
			adresse.setGouvernorat(c1);
			adresse.setCodePostale(Integer.parseInt(c3));
			adresse.setAdresse(c2);
			
			collection_adresse.add(adresse);
//////////////////////////////////////////////////////////////////////
			String NomEtab = request.getParameter("input11");
			String type = request.getParameter("input12");
			String labellee = request.getParameter("input13");

			Etablisement etablisement = new Etablisement();
			etablisement.setNomEtablissement(NomEtab);
			etablisement.setIntermediaire(type.equals("intermediaire"));
			etablisement.setHospital(type.equals("Hospital"));
			etablisement.setMinistraire(type.equals("ministere"));
			etablisement.setDrs(type.equals("drs"));
			etablisement.setLibelle(labellee);

			System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++++");
//			if (Pattern.matches("[7]{1}[0-9]{7}", Tel) && Pattern.matches("[7]{1}[0-9]{7}", FAX)
//					&& Pattern.matches("[a-zA-Z] ", role) && Pattern.matches("[0-9] ", c3)
//					&& Pattern.matches("[a-zA-Z] ", c2) && Pattern.matches("[a-zA-Z] ", labellee)
//					&& Pattern.matches("[a-zA-Z]{2} ", type) && Pattern.matches("[a-zA-Z] ", NomEtab)
//					&& Pattern.matches("[a-zA-Z] ", nom) && Pattern.matches("[a-zA-Z]", prenom)
//					&& Pattern.matches("[a-zA-Z 0-9]", password)
//					&& email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
				if (metier.veriff(email) == false) {
					metier.ajouteadresse(adresse);
					metier.ajoutetelephone(telephone);
					metier.ajoutetelephone(fax);
					daoManagement.ajouteUtilisateur(utilisateur);
					etablisement.setAdresses(collection_adresse);
					etablisement.setTelephones(collection_tel);
					etablisement.setUtilisateur(utilisateur);
					
					metier.ajouteetablissement(etablisement);
//					String l1 = daoManagement.ajouteUtilisateur(utilisateur);
//					String l2 = metier.ajoutetelephone(telephone);
//					String l3 = metier.ajoutetelephone(fax);
//					String l4 = metier.ajouteadresse(adresse);
//					String l5 = metier.ajouteetablissement(etablisement);
//					metier.ajouteadresseEtablissement(l1, l2, l3, l4, l5);
				} else {
					request.setAttribute("erreur", "adresse email existe");
//				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		request.getRequestDispatcher("InscriptionEtablissement.jsp").forward(request, response);
	}

}
