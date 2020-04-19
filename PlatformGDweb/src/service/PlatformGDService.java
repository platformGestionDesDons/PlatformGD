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
	public DonEnNature getDonEnNatureById(String id_don) {
		return metier.getDonEnNatureById(id_don);
	}
	public Reglement getDonEnReglementById(String id_don) {
		return metier.getDonEnReglementById(id_don);
	}
	public String getNomEtablissementById(String id_etablissement) {
		return metier.getNomEtablissementById(id_etablissement);
	}
	public List<Etablissement> getAllDonnateur() {
		return metier.getAllDonnateur();
	}
	public List<Etablissement> getAllEtablissement() {
		return metier.getAllEtablissement();
	}
	public List<Reglement> getAllDonsReglement() {
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
	public List<Besoin> getAllBesoin() {
		return metier.getAllBesoin();
	}
	public void updateDonEnNature(DonEnNature don_en_nature) {
		metier.updateDonEnNature(don_en_nature);
	}
	public void updateReglement(Reglement reglement) {
		metier.updateReglement(reglement);
	}
	public void deletePhotoDon(String id_photo) {
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
	public List<DonEnNature> getAllDonsEnNature() {
		return metier.getAllDonsEnNature();
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
}
