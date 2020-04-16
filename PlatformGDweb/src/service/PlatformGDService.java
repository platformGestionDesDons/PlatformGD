package service;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.entities.Besoin;
import metier.entities.Don;
import metier.entities.DonEnNature;
import metier.entities.Etablissement;
import metier.entities.PhotoDon;
import metier.entities.Reglement;
import metier.entities.Utilisateur;
import java.util.List;
import metier.session.PlatformGDLocal;

@Stateless
@WebService
public class PlatformGDService {
	
	@EJB
	private PlatformGDLocal metier;
	public List<Don> getAllDonsReglement() {
		return metier.getAllDonsReglement();
	}
	public List<Don> getDonEnNatureNotAcceptedByMinistere() {
		return metier.getDonEnNatureNotAcceptedByMinistere();
	}
	public List<Don> getDonReglementNotAcceptedByMinistere() {
		return metier.getDonReglementNotAcceptedByMinistere();
	}
	public List<Don> getDonEnNatureDeletedByMinistere() {
		return metier.getDonEnNatureDeletedByMinistere();
	}
	public List<Don> getDonReglementDeletedByMinistere() {
		return metier.getDonReglementDeletedByMinistere();
	}
	public void ajouterBesoin(Besoin besoin) {
		metier.ajouterBesoin(besoin);
	}
	public void updateBesoin(Besoin besoin) {
		metier.updateBesoin(besoin);
	}
	public List<Besoin> getAllBesoin() {
		return metier.getAllBesoin();
	}
	public void updateDonEnNature(DonEnNature don_en_nature) {
		metier.updateDonEnNature(don_en_nature);
	}
	public void updateReglement(Reglement reglement) {
		metier.updateReglement(reglement);
	}
	public void deletePhotoDon(long id_photo) {
		metier.deletePhotoDon(id_photo);
	}
	public void updatePhotoDon(PhotoDon photo_don) {
		metier.updatePhotoDon(photo_don);
	}
	public void ajouterDonEnNature(DonEnNature don_en_nature) {
		metier.ajouterDonEnNature(don_en_nature);
	}
	public void ajouterDonReglement(Reglement reglement) {
		metier.ajouterDonReglement(reglement);
	}
	@WebMethod
	public void Faire_Un_Don(Don don, PhotoDon photo, Utilisateur donnateur, Etablissement beneficiaire) {
		metier.Faire_Un_Don(don, photo, donnateur, beneficiaire);
	}
	@WebMethod
	public List<Don> getAllDonsEnNature() {
		return metier.getAllDonsEnNature();
	}
	@WebMethod
	public Don getDonById(String id_don) {
		return metier.getDonById(id_don);
	}
	@WebMethod
	public List<Don> getDonByEtablissement(String nom_etabliessement) {
		return metier.getDonByEtablissement(nom_etabliessement);
	}
	@WebMethod
	public List<Don> getDonByDonnateur(String mail_donnateur) {
		return metier.getDonByDonnateur(mail_donnateur);
	}
	@WebMethod
	public List<PhotoDon> getAllPhotoDon() {
		return metier.getAllPhotoDon();
	}
	@WebMethod
	public List<PhotoDon> getAllPhotoDonById(String id_don) {
		return metier.getAllPhotoDonById(id_don);
	}
	@WebMethod
	public void ajouterPhotoDon(String url_photo, String id_don) {
		metier.ajouterPhotoDon(url_photo, id_don);
	}
	@WebMethod
	public void accepterDon(long id_don) {
		metier.accepterDon(id_don);
	}
	@WebMethod
	public void deleteDon(long id_don) {
		metier.deleteDon(id_don);
	}
	@WebMethod
	public void ajouteUtilisateur(String nom) {
		Utilisateur utilisateur = new Utilisateur(nom);
		metier.ajouteUtilisateur(utilisateur);
	}
	@WebMethod
	public void ajouteEtablissement(String nomEtablissement) {
		Etablissement etablissement = new Etablissement(nomEtablissement);
		metier.ajouteEtablissement(etablissement);
	}
	@WebMethod
	public void updateUtilisateur(Utilisateur utilisateur) {
		metier.updateUtilisateur(utilisateur);
	}
	@WebMethod
	public void updateEtablissement(Etablissement etablissement) {
		metier.updateEtablissement(etablissement);
	}
	@WebMethod
	public void deleteUtilisateur(long idut) {
		metier.deleteUtilisateur(idut);
	}
	@WebMethod
	public void deleteEtablissement(long idEtablissement) {
		metier.deleteEtablissement(idEtablissement);
	}
	@WebMethod
	public Utilisateur findUtilisateur(long idut) {
		return metier.findUtilisateur(idut);
	}
	@WebMethod
	public Etablissement findetablissement(long idetablisement) {
		return metier.findetablissement(idetablisement);
	}
	@WebMethod
	public List<Utilisateur> getUtilisateur() {
		return metier.getUtilisateur();
	}
	@WebMethod
	public List<Etablissement> getEtablissement() {
		return metier.getEtablissement();
	}
}
