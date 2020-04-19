package service;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.entities.Besoin;
import metier.entities.Categorie;
import metier.entities.Fournisseur;
import metier.entities.Photo;
import metier.entities.PhotoBesoin;
import metier.entities.Produit;
import metier.entities.UniteDeMesure;
import metier.session.GestBesoinRemote;

@Stateless
@WebService
public class GestBesoinService 
{
	@EJB
	private GestBesoinRemote metier;

	public void ajoutBesoin(Besoin b) {
		metier.ajoutBesoin(b);
	}

	public void ajoutProduit(Produit p) {
		metier.ajoutProduit(p);
	}

	public void ajoutCategorie(Categorie c) {
		metier.ajoutCategorie(c);
	}

	public void ajoutPhotoBesoin(PhotoBesoin pB) {
		metier.ajoutPhotoBesoin(pB);
	}

	public void ajoutUniteDeMesure(UniteDeMesure uM) {
		metier.ajoutUniteDeMesure(uM);
	}

	public void ajoutFournisseur(Fournisseur f) {
		metier.ajoutFournisseur(f);
	}

	public void ajoutPhoto(Photo ph) {
		metier.ajoutPhoto(ph);
	}

	public void deleteBesoin(Besoin b) {
		metier.deleteBesoin(b);
	}

	public void deleteProduit(Produit p) {
		metier.deleteProduit(p);
	}

	public void deleteCategorie(Categorie c) {
		metier.deleteCategorie(c);
	}

	public void deletePhotoBesoin(PhotoBesoin pB) {
		metier.deletePhotoBesoin(pB);
	}

	public void deleteUniteDeMesure(UniteDeMesure uM) {
		metier.deleteUniteDeMesure(uM);
	}

	public void deleteFournisseur(Fournisseur f) {
		metier.deleteFournisseur(f);
	}

	public void deletePhoto(Photo ph) {
		metier.deletePhoto(ph);
	}

	public void updateBesoin(Besoin b) {
		metier.updateBesoin(b);
	}

	public void updateProduit(Produit p) {
		metier.updateProduit(p);
	}

	public void updateCategorie(Categorie c) {
		metier.updateCategorie(c);
	}

	public void updatePhotoBesoin(PhotoBesoin pB) {
		metier.updatePhotoBesoin(pB);
	}

	public void updateUniteDeMesure(UniteDeMesure uM) {
		metier.updateUniteDeMesure(uM);
	}

	public void updateFournisseur(Fournisseur f) {
		metier.updateFournisseur(f);
	}

	public Produit getProduitById(String idP) {
		return metier.getProduitById(idP);
	}

	public UniteDeMesure getUniteDeMesureById(String idU) {
		return metier.getUniteDeMesureById(idU);
	}

	public Categorie getCategorieById(int idC) {
		return metier.getCategorieById(idC);
	}

	public Besoin getBesoinById(String idB) {
		return metier.getBesoinById(idB);
	}

	public Fournisseur getFournisseurById(String idF) {
		return metier.getFournisseurById(idF);
	}

	public List<Besoin> getAllBesoin() {
		return metier.getAllBesoin();
	}

	public List<Produit> getAllProduit() {
		return metier.getAllProduit();
	}

	public List<Categorie> getAllCategorie() {
		return metier.getAllCategorie();
	}

	public List<PhotoBesoin> getAllPhotoBesoin() {
		return metier.getAllPhotoBesoin();
	}

	public List<UniteDeMesure> getAllUniteDeMesure() {
		return metier.getAllUniteDeMesure();
	}

	public List<Fournisseur> getAllFournisseur() {
		return metier.getAllFournisseur();
	}

	public List<Produit> getProduitByCategorie(int idc) {
		return metier.getProduitByCategorie(idc);
	}

	public List<Produit> getProduitByFounisseur(String idF) {
		return metier.getProduitByFounisseur(idF);
	}

	public List<Fournisseur> getFournisseurByProduit(String idP) {
		return metier.getFournisseurByProduit(idP);
	}
	

}
