package metier.session;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.Don;
import metier.entities.DonEnNature;
import metier.entities.Etablissement;
import metier.entities.PhotoDon;
import metier.entities.Reglement;
import metier.entities.Utilisateur;

@Remote
public interface PlatformGDRemote {
	public void Faire_Un_Don(Don don, PhotoDon photo, Utilisateur donnateur, Etablissement beneficiaire);
	
	public List<Don> getAllDons();
	public Don getDonById(String id_don);
	public List<Don> getDonByEtablissement(String nom_etabliessement);
	public List<Don> getDonByDonnateur(String mail_donnateur);
	
	public void ajouterDonEnNature(DonEnNature don_en_nature);
	public void ajouterDonReglement(Reglement reglement);
	public void updateDonEnNature(DonEnNature don_en_nature);
	public void updateReglement(Reglement reglement);
	public void accepterDon(String code_don, boolean estAcceptee);
	public void deleteDon(String code_don, boolean estSupprimee);
	
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
	
}
