package web.dashboard_ministere;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.entities.Besoin;
import metier.entities.Etablisement;
import metier.entities.Photo;

import metier.session.PlatformGDLocal;



@WebServlet("/besoinMinistere")
public class ServletBesoinMinistere extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private PlatformGDLocal dao;
	
	public ServletBesoinMinistere() {
		super();
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idBesoin = request.getParameter("idBesoin");
		
		
		Besoin besoin = dao.getBesoinById(idBesoin);
		List<Photo> photos = new ArrayList<Photo>();
		
		if(besoin != null) 
		{
		request.setAttribute("besoin",besoin);
		if( besoin.getPhotoBesoin()!=null)
		{
			photos = besoin.getPhotoBesoin().getPhotos();
		}
		request.setAttribute("etablissements", dao.getAllEtablissement());
		request.setAttribute("photos",photos);
		request.getRequestDispatcher("Dashboard_ministere/besoinMinistere.jsp").forward(request,response);
		}
		else {
			request.getRequestDispatcher("Dashboard_etablissement/404Produit.jsp").forward(request,response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
		//doGet(request, response);
		String id_besoin = (String) request.getParameter("id_besoin");
		String id_etab = (String) request.getParameter("nometablissement");
		String motif = (String) request.getParameter("motif");
		Besoin besoin = dao.getBesoinById(id_besoin);
		Etablisement etablissement = dao.findetablissement(id_etab);
		besoin.setReaffected(true);
		besoin.setMotif(motif);
		
		
		
		Besoin nouveau_besoin = new Besoin();
		nouveau_besoin.setDateBesoin(besoin.getDateBesoin());
		nouveau_besoin.setEtat(besoin.getEtat());
		nouveau_besoin.setQuantiteRestante(besoin.getQuantiteRestante());
		nouveau_besoin.setQuantiteInitiale(besoin.getQuantiteInitiale());
		nouveau_besoin.setProduit(besoin.getProduit());
		nouveau_besoin.setPriorite(besoin.getPriorite());
		nouveau_besoin.setPhotoBesoin(besoin.getPhotoBesoin());
		nouveau_besoin.setMotif("r�affecter par le ministere");
		nouveau_besoin.setEtablisement(etablissement);
		nouveau_besoin.setReaffected(false);
		dao.updateBesoin(besoin);
		dao.ajoutBesoin(nouveau_besoin);
		List<Besoin> liste_besoin = new ArrayList<Besoin>();
		liste_besoin = etablissement.getBesoins();
		liste_besoin.add(nouveau_besoin);
		etablissement.setBesoins(liste_besoin);
		dao.updateEtablisement(etablissement);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		request.setAttribute("besoins", dao.getAllBesoin());
		request.getRequestDispatcher("Dashboard_ministere/ListeBesoins.jsp").forward(request,response);
	}
	
	
}
