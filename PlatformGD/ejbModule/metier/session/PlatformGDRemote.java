package metier.session;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.Besoin;
import metier.entities.Categorie;
import metier.entities.Don;
import metier.entities.DonEnNature;
import metier.entities.Etablissement;
import metier.entities.Fournisseur;
import metier.entities.Photo;
import metier.entities.PhotoBesoin;
import metier.entities.PhotoDon;
import metier.entities.Produit;
import metier.entities.Reglement;
import metier.entities.UniteDeMesure;
import metier.entities.Utilisateur;

@Remote
public interface PlatformGDRemote {
	public void Faire_Un_Don(Don don, PhotoDon photo, Utilisateur donnateur, Etablissement beneficiaire);
	
	public List<DonEnNature> getAllDonsEnNature();
	public List<Reglement> getAllDonsReglement();
	public List<Don> getDonByEtablissement(String nom_etabliessement);
	public List<Don> getDonByDonnateur(String mail_donnateur);
	public List<Don> getDonEnNatureNotAcceptedByMinistere();
	public List<Don> getDonReglementNotAcceptedByMinistere();
	public List<Don> getDonEnNatureDeletedByMinistere();
	public List<Don> getDonReglementDeletedByMinistere();
	
	public DonEnNature getDonEnNatureById(String id_don);
	public Reglement getDonEnReglementById(String id_don);
	public void ajouterDonEnNature(DonEnNature don_en_nature);
	public void ajouterDonReglement(Reglement reglement);
	public void updateDonEnNature(DonEnNature don_en_nature);
	public void updateReglement(Reglement reglement);
	public void ajouterPhotoDon(String url_photo, String id_don);
	public void deletePhotoDon(String id_photo);
	public void updatePhotoDon(PhotoDon photo_don);
	
	
	public List<PhotoDon> getAllPhotoDon();
	public List<PhotoDon> getAllPhotoDonById(String id_don);


	public List<Etablissement> getAllEtablissement();
	public String getNomEtablissementById(String id_etablissement);
	public List<Etablissement> getAllDonnateur();
	

	
	// create
		public void ajoutBesoin(Besoin
				b);
		public void ajoutProduit(Produit p);
		public void ajoutCategorie(Categorie c);
		public void ajoutPhotoBesoin(PhotoBesoin pB);
		public void ajoutUniteDeMesure(UniteDeMesure uM);
		public void ajoutFournisseur(Fournisseur f);
		public void ajoutPhoto(Photo ph);
		
		
		//delete
		
		public void deleteBesoin(Besoin b);
		public void deleteProduit(Produit p);
		public void deleteCategorie(Categorie c);
		public void deletePhotoBesoin(PhotoBesoin pB);
		public void deleteUniteDeMesure(UniteDeMesure uM);
		public void deleteFournisseur(Fournisseur f);
		public void deletePhoto(Photo ph);
		
		//update
		
		public void updateBesoin(Besoin b);
		public void updateProduit(Produit p);
		public void updateCategorie(Categorie c);
		public void updatePhotoBesoin(PhotoBesoin pB);
		public void updateUniteDeMesure(UniteDeMesure uM);
		public void updateFournisseur(Fournisseur f);
		
		
		//read
		
		public Produit getProduitById(String idP);
		public UniteDeMesure getUniteDeMesureById(String idU);
		public Categorie getCategorieById(int idC);
		public Besoin getBesoinById(String idB);
		public Fournisseur getFournisseurById(String idF);

		
		public List<Besoin> getAllBesoin();
		public List<Produit> getAllProduit();
		public List<Categorie> getAllCategorie();
		public List<PhotoBesoin> getAllPhotoBesoin();
		public List<UniteDeMesure> getAllUniteDeMesure();
		public List<Fournisseur> getAllFournisseur();
		
		public List<Produit> getProduitByCategorie(int idc);
		public List<Produit> getProduitByFounisseur(String idF);
		public List<Fournisseur> getFournisseurByProduit(String idP);
}
