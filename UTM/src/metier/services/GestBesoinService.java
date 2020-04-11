//package metier.services;
//
//import java.util.Date;
//
//import javax.ejb.EJB;
//import javax.ejb.Stateless;
//import javax.jws.WebParam;
//import javax.jws.WebService;
//
//import metier.entities.Besoin;
//import metier.session.GestBesoinRemote;
//
//@Stateless
//@WebService
//public class GestBesoinService 
//{
//	@EJB
//	private GestBesoinRemote metier;
//	public void addBesoin(Date date, String etat,
//			int quantiteInitiale, int quantiteRestante,
//			String priorite, boolean annule, String motif) {
//		Besoin B=new Besoin(date, etat, quantiteInitiale, quantiteRestante, priorite, annule, motif);
//		metier.ajoutBesoin(B);
//		
//	}
//
//}
