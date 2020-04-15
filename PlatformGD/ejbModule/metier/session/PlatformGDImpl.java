package metier.session;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import metier.entities.Besoin;
import metier.entities.Don;
import metier.entities.DonEnNature;
import metier.entities.Etablissement;
import metier.entities.PhotoDon;
import metier.entities.Reglement;
import metier.entities.Utilisateur;

@Stateless
public class PlatformGDImpl implements PlatformGDLocal, PlatformGDRemote {
	@javax.persistence.PersistenceContext(unitName = "PlatformGD")
	private EntityManager em;

	@Override
	public void Faire_Un_Don(Don don, PhotoDon photo, Utilisateur donnateur, Etablissement beneficiaire) {
		// TODO Auto-generated method stub

	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////Get Dons
	@Override
	public List<Don> getAllDonsEnNature() {
		Query req = em.createQuery("select d from DonEnNature d");
		return req.getResultList();
	}
	@Override
	public List<Don> getAllDonsReglement() {
		Query req = em.createQuery("select r from Reglement r");
		return req.getResultList();
	}
	@Override
	public Don getDonById(String id_don) {
		Don a = em.find(Don.class, id_don);
		if (a == null)
			throw new RuntimeException("Don est introuvable");
		return a;
	}
	@Override
	public List<Don> getDonByEtablissement(String nom_etabliessement) {
		Query req = em.createQuery("select d from don d where d.etablissement.NomEtabliessement=:x");
		req.setParameter("x", nom_etabliessement);
		return req.getResultList();
	}
	@Override
	public List<Don> getDonByDonnateur(String mail_donnateur) {
		Query req = em.createQuery("select d from don d where d.utilisateur.email=:x");
		req.setParameter("x", mail_donnateur);
		return req.getResultList();
	}
	@Override
	public List<Don> getDonEnNatureNotAcceptedByMinistere(){
		Query req = em.createQuery("select d from DonEnNature d where estAcceptee = false");
		return req.getResultList();
	}
	@Override
	public List<Don> getDonReglementNotAcceptedByMinistere(){
		Query req = em.createQuery("select r from Reglement r where estAcceptee = false");
		return req.getResultList();		
	}
	@Override
	public List<Don> getDonEnNatureDeletedByMinistere(){
		Query req = em.createQuery("select d from DonEnNature d where estSupprimee = true");
		return req.getResultList();	
	}
	public List<Don> getDonReglementDeletedByMinistere(){
		Query req = em.createQuery("select r from Reglement r where estSupprimee = true");
		return req.getResultList();	
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////Photo dons
	@Override
	public List<PhotoDon> getAllPhotoDon() {
		return em.createNamedQuery("PhotoBesoin.findAll", PhotoDon.class).getResultList();
	}

	@Override
	public List<PhotoDon> getAllPhotoDonById(String id_don) {
		Query req = em.createQuery("select ph from PhotoDon ph where ph.idDon=:x");
		req.setParameter("x", id_don);
		return req.getResultList();
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public void ajouterDonEnNature(DonEnNature don_en_nature, long id_besoin) {
		if (!don_en_nature.equals(null))
			em.persist(don_en_nature);
		Query req = em.createQuery("UPDATE besoin SET quantite_restante = quantite_initiale - "
				+ don_en_nature.getQuantite() + ", etat = 'en cours' WHERE id_besoin =" + id_besoin);
		req.executeUpdate();
	}

	@Override
	public void ajouterDonReglement(Reglement reglement) {
		if (!reglement.equals(null))
			em.persist(reglement);
	}

	@Override
	public void updateDonEnNature(DonEnNature don_en_nature) {
		// TODO Auto-generated method stub
		if (!don_en_nature.equals(null))
			em.merge(don_en_nature);
	}

	@Override
	public void updateReglement(Reglement reglement) {
		// TODO Auto-generated method stub
		if (!reglement.equals(null))
			em.merge(reglement);
	}

	@Override
	public void accepterDon(long id_don) {
		// TODO Auto-generated method stub
		Query req = em.createQuery("UPDATE don SET estAccepte = true WHERE id_don=" + id_don);
		req.executeUpdate();
	}

	@Override
	public void deleteDon(long id_don) {
		// TODO Auto-generated method stub
		Query req = em.createQuery("UPDATE don SET estSupprime = true WHERE id_don=" + id_don);
		req.executeUpdate();
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public void ajouterPhotoDon(String url_photo, String id_don) {
		// TODO Auto-generated method stub
		Query req = em
				.createQuery("INSERT INTO photodon (urlPhoto, codeDon) VALUES ( " + url_photo + " , " + id_don + " )");
		req.executeUpdate();
	}

	@Override
	public void deletePhotoDon(long id_photo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePhotoDon(PhotoDon photo_don) {
		// TODO Auto-generated method stub
		if (!photo_don.equals(null))
			em.merge(photo_don);
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public void ajouteUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		if (!utilisateur.equals(null))
			em.persist(utilisateur);
	}

	@Override
	public void ajouteEtablissement(Etablissement etablissement) {
		// TODO Auto-generated method stub
		if (!etablissement.equals(null))
			em.persist(etablissement);
	}

	@Override
	public void updateUtilisateur(Utilisateur utilisateur) {
		if (!utilisateur.equals(null))
			em.merge(utilisateur);
	}

	@Override
	public void updateEtablissement(Etablissement etablissement) {
		if (!etablissement.equals(null))
			em.merge(etablissement);
	}

	@Override
	public void deleteUtilisateur(long idut) {
		// TODO Auto-generated method stub
		em.remove(em.find(Utilisateur.class, idut));
	}

	@Override
	public void deleteEtablissement(long idEtablissement) {
		// TODO Auto-generated method stub
		em.remove(em.find(Etablissement.class, idEtablissement));
	}

	@Override
	public Utilisateur findUtilisateur(long idut) {
		// TODO Auto-generated method stub
		Utilisateur a = em.find(Utilisateur.class, idut);
		if (a == null)
			throw new RuntimeException("Utilisateur est introuvable");
		return a;
	}

	@Override
	public Etablissement findetablissement(long idetablisement) {
		// TODO Auto-generated method stub
		Etablissement a = em.find(Etablissement.class, idetablisement);
		if (a == null)
			throw new RuntimeException("Etablissement est introuvable");
		return a;
	}

	@Override
	public List<Utilisateur> getUtilisateur() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("Utilisateur.findAll", Utilisateur.class).getResultList();
	}

	@Override
	public List<Etablissement> getEtablissement() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("Etablissement.findAll", Etablissement.class).getResultList();
	}

	@Override
	public void ajouterBesoin(Besoin besoin) {
		if (!besoin.equals(null))
			em.persist(besoin);
	}

	@Override
	public void updateBesoin(Besoin besoin) {
		if (!besoin.equals(null))
			em.merge(besoin);
	}
	@Override
	public List<Besoin> getAllBesoin(){
		Query req = em.createQuery("select b from Besoin b");
		return req.getResultList();	
	}
}
