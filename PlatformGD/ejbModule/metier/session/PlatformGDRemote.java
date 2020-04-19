package metier.session;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.Besoin;
import metier.entities.Don;
import metier.entities.DonEnNature;
import metier.entities.Etablissement;
import metier.entities.PhotoDon;
import metier.entities.Reglement;
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
	
	//Besoin
	public List<Besoin> getAllBesoin();
}
