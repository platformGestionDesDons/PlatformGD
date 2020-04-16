package metier.session;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Besoin;
import metier.entities.Don;
import metier.entities.DonEnNature;
import metier.entities.Etablissement;
import metier.entities.PhotoDon;
import metier.entities.Reglement;
import metier.entities.Utilisateur;

@Local
public interface PlatformGDLocal {

	public void Faire_Un_Don(Don don, PhotoDon photo, Utilisateur donnateur, Etablissement beneficiaire);

	public List<Don> getAllDonsEnNature();
	public List<Don> getAllDonsReglement();
	public Don getDonById(String id_don);
	public List<Don> getDonByEtablissement(String nom_etabliessement);
	public List<Don> getDonByDonnateur(String mail_donnateur);
	public List<Don> getDonEnNatureNotAcceptedByMinistere();
	public List<Don> getDonReglementNotAcceptedByMinistere();
	public List<Don> getDonEnNatureDeletedByMinistere();
	public List<Don> getDonReglementDeletedByMinistere();
	
	public void ajouterDonEnNature(DonEnNature don_en_nature);
	public void ajouterDonReglement(Reglement reglement);
	public void updateDonEnNature(DonEnNature don_en_nature);
	public void updateReglement(Reglement reglement);
	public void accepterDon(long id_don);
	public void deleteDon(long id_don);
	
	public void ajouterPhotoDon(String url_photo, String id_don);
	public void deletePhotoDon(long id_photo);
	public void updatePhotoDon(PhotoDon photo_don);
	
	
	public List<PhotoDon> getAllPhotoDon();
	public List<PhotoDon> getAllPhotoDonById(String id_don);
	
	public void ajouteUtilisateur(Utilisateur utilisateur);
	public void ajouteEtablissement(Etablissement etablissement);
	public void updateUtilisateur(Utilisateur utilisateur);
	public void updateEtablissement(Etablissement etablissement);
	public void deleteUtilisateur(long idut);
	public void deleteEtablissement(long idEtablissement);
	
	public Utilisateur findUtilisateur(long idut);
	public Etablissement findetablissement(long idetablisement);
	public List<Utilisateur> getUtilisateur();
	public List<Etablissement> getEtablissement();
	
	//Besoin
	public void ajouterBesoin(Besoin besoin);
	public void updateBesoin(Besoin besoin);
	public List<Besoin> getAllBesoin();

}
