package metier.session;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import metier.entities.*;

@Stateless(name = "BK")
public class PlatformGDImpl implements PlatformGDLocal, PlatformGDRemote {
	@javax.persistence.PersistenceContext(unitName = "PlatformGD")
	private EntityManager em;

	@Override
	public void Faire_Un_Don(Don don, PhotoDon photo, Utilisateur donnateur, Etablisement beneficiaire) {
		// TODO Auto-generated method stub

	}
///////////////////////////////////////
	
	//////////////////////////////////////////////////////////////////////////
//////////Get Dons
	@Override
	public List<DonEnNature> getAllDonsEnNature() {
		Query req = em.createQuery("select d from DonEnNature d");
		return req.getResultList();
	}
	@Override
	public List<Reglement> getAllDonsReglement() {
		Query req = em.createQuery("select r from Reglement r");
		return req.getResultList();
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
	public List<PhotoDon> getAllPhotoDonById(String id_don) {
		Query req = em.createQuery("select ph from PhotoDon ph where ph.idDon=:x");
		req.setParameter("x", id_don);
		return req.getResultList();
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public DonEnNature getDonEnNatureById(String id_don) {
		DonEnNature a = em.find(DonEnNature.class, id_don);
		if (a == null)
			throw new RuntimeException("Don est introuvable");
		return a;
	}
	@Override
	public Reglement getDonEnReglementById(String id_don) {
		Reglement a = em.find(Reglement.class, id_don);
		if (a == null)
			throw new RuntimeException("Don est introuvable");
		return a;
	}
	@Override
	public void ajouterDonEnNature(DonEnNature don_en_nature) {
		if (!don_en_nature.equals(null))
			em.persist(don_en_nature);
		//Query req = em.createQuery("UPDATE besoin SET quantite_restante = quantite_initiale - "
		//		+ don_en_nature.getQuantite() + ", etat = 'en cours' WHERE id_besoin =" + id_besoin);
	//	req.executeUpdate();
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

/////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public void ajouterPhotoDon(String url_photo, String id_don) {
		// TODO Auto-generated method stub
		Query req = em
				.createQuery("INSERT INTO photodon (urlPhoto, codeDon) VALUES ( " + url_photo + " , " + id_don + " )");
		req.executeUpdate();
	}

	@Override
	public void deletePhotoDon(String id_photo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePhotoDon(PhotoDon photo_don) {
		// TODO Auto-generated method stub
		if (!photo_don.equals(null))
			em.merge(photo_don);
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////


////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public String getNomEtablissementById(String id_etablissement) {
		Etablisement a = em.find(Etablisement.class, id_etablissement);
		if (a == null)
			throw new RuntimeException("Don est introuvable");
		return a.getNomEtablissement();
	}
	@Override
	public List<PhotoDon> getAllPhotoDon() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void ajoutBesoin(Besoin b) 
	{

			
		if(!b.equals(null))
		{
			em.persist(b);

		}
		
	}

	@Override
	public void ajoutProduit(Produit p) 
	{
		if(!p.equals(null))
		{
			em.persist(p);
		}
			
		
	}

	@Override
	public void ajoutCategorie(Categorie c) {
		if(!c.equals(null))
			em.persist(c);
		
	}

	@Override
	public void ajoutPhotoBesoin(PhotoBesoin pB) 
	{
		if(!pB.equals(null))
			em.persist(pB);
		
	}

	@Override
	public void ajoutUniteDeMesure(UniteDeMesure uM) 
	{
		if(!uM.equals(null))
			em.persist(uM);
		
	}

	@Override
	public void ajoutFournisseur(Fournisseur f) 
	{
		if(!f.equals(null))
			em.persist(f);
		
	}
	@Override
	public void ajoutPhoto(Photo ph)
	{
		if(!ph.equals(null))
			em.persist(ph);
	}
	
	@Override
	public void deleteBesoin(Besoin b) 
	{
		
		em.remove(em.find(Besoin.class, b.getIdBesoin()));
	}

	@Override
	public void deleteProduit(Produit p)
	{
		em.remove(em.find(Produit.class, p.getIdProduit()));		
	}

	@Override
	public void deleteCategorie(Categorie c) 
	{
		em.remove(em.find(Categorie.class, c.getIdC()));
		
	}

	@Override
	public void deletePhotoBesoin(PhotoBesoin pB) 
	{
		em.remove(em.find(PhotoBesoin.class, pB.getIdPB()));		
	}

	@Override
	public void deleteUniteDeMesure(UniteDeMesure uM) 
	{
		em.remove(em.find(UniteDeMesure.class, uM.getIdUnite()));		
		
	}

	@Override
	public void deleteFournisseur(Fournisseur f) 
	{
		em.remove(em.find(Fournisseur.class, f.getIdF()));		
		
	}

	@Override
	public void deletePhoto(Photo ph)
	{
		em.remove(em.find(Photo.class, ph.getIdP()));
	}
	
	@Override
	public void updateBesoin(Besoin b) 
	{
		if(!b.equals(null))
			em.merge(b);
		
	}

	@Override
	public void updateProduit(Produit p) 
	{
		if(!p.equals(null))
			em.merge(p);
		
	}

	@Override
	public void updateCategorie(Categorie c) {
		if(!c.equals(null))
			em.merge(c);
		
	}

	@Override
	public void updatePhotoBesoin(PhotoBesoin pB) 
	{
		if(!pB.equals(null))
			em.merge(pB);
		
	}

	@Override
	public void updateUniteDeMesure(UniteDeMesure uM) 
	{
		if(!uM.equals(null))
			em.merge(uM);
		
	}

	@Override
	public void updateFournisseur(Fournisseur f) 
	{
		if(!f.equals(null))
			em.merge(f);
		
	}

	@Override
	public List<Besoin> getAllBesoin() {
		return em.createNamedQuery("Besoin.findAll",Besoin.class).getResultList();

	}

	@Override
	public List<Produit> getAllProduit() {
		return em.createNamedQuery("Produit.findAll",Produit.class).getResultList();
	}

	@Override
	public List<Categorie> getAllCategorie() {
		return em.createNamedQuery("Categorie.findAll",Categorie.class).getResultList();
	}

	@Override
	public List<PhotoBesoin> getAllPhotoBesoin() {
		return em.createNamedQuery("PhotoBesoin.findAll",PhotoBesoin.class).getResultList();

	}

	@Override
	public List<UniteDeMesure> getAllUniteDeMesure() {
		return em.createNamedQuery("UniteDeMesure.findAll",UniteDeMesure.class).getResultList();
	}

	@Override
	public List<Fournisseur> getAllFournisseur() 
	{
		return em.createNamedQuery("Fournisseur.findAll",Fournisseur.class).getResultList();

	}

	@Override
	public List<Produit> getProduitByCategorie(String idc) {
		
		TypedQuery<Produit> q = (TypedQuery<Produit>) 
				em.createNamedQuery("Produit.findAll",Produit.class);
		
		List<Produit> produits = (List<Produit>) q.getResultList().
				stream().filter(p->p.getCategorie().getIdC()==idc).collect(Collectors.toList());
		
		return produits;
	}
	
	

	

	@Override
	public List<Produit> getProduitByFounisseur(String idF)
	{
	    	Query req= em.createQuery("select p from produit p where p.fournisseurs.idF=:x");
	    	req.setParameter("x", idF);
	    	return req.getResultList();
	}	
	

	
	@Override
	public List<Fournisseur> getFournisseurByProduit(String idP) 
	{
    	Query req= em.createQuery("select f from Fournisseur f join fetch f.produits ps where ps.idProduit=: x");
    	//Query req= entityManager.createQuery("select f from Fournisseur f where  f.produits.idProduit=:x");
    	req.setParameter("x", idP);
    	return req.getResultList();
	}

	@Override
	public Produit getProduitById(String idP) 
	{
		Produit produit = em.find(Produit.class, idP);
		return produit;
	}
	@Override
	public UniteDeMesure getUniteDeMesureById(String idU) {
		UniteDeMesure uniteDeMesure = em.find(UniteDeMesure.class,idU);
		return uniteDeMesure;
	}

	@Override
	public Categorie getCategorieById(String idC) 
	{
		Categorie categorie = em.find(Categorie.class, idC);
		return categorie;
	}

	@Override
	public Besoin getBesoinById(String idB) {
		Besoin besoin =em.find(Besoin.class, idB);
		return besoin;
	}

	@Override
	public Fournisseur getFournisseurById(String idF) 
	{
		Fournisseur fournisseur =em.find(Fournisseur.class, idF);
		return fournisseur;
	}



	
	
	
	@Override
	public void ajouteUtilisateur(Utilisateur utilisateur)
	{
		if(!utilisateur.equals(null))
			em.persist(utilisateur);
	}
	/*@Override
	public String ajouteUtilisateur(Utilisateur utilisateur) {
		em.persist(utilisateur);
		em.flush();
		return utilisateur.getIdut();
	}*/
	@Override
	public void ajouteadresse(Adresse adresse)
	{
		if(!adresse.equals(null))
			em.persist(adresse);
	}
	/*@Override
	public String ajouteadresse(Adresse adresse) {
		em.persist(adresse);
		em.flush();
		return adresse.getIdAdresse();
	}*/

	@Override
	public String ajoutereclamation(Reclamation reclamation) {
		em.persist(reclamation);
		em.flush();
		return reclamation.getCodeReclamation();
	}
	@Override
	public void ajoutetelephone(Telephone telephone)
	{
		if(!telephone.equals(null))
			em.persist(telephone);
	}
	/*@Override
	public String ajoutetelephone(Telephone telephone) {
		em.persist(telephone);
		em.flush();
		return telephone.getIdTel();
	}*/

	@Override
	public void deleteUtilisateur(Utilisateur utilisateur) {
		utilisateur = em.merge(utilisateur);
		em.remove(utilisateur);
	}

	@Override
	public void deleteadresse(Adresse adresse) {
		adresse = em.merge(adresse);
		em.remove(adresse);
	}

	@Override
	public void deleteetablissement(Etablisement etablisement) {
		etablisement = em.merge(etablisement);
		em.remove(etablisement);
	}

	@Override
	public void deletereclamation(Reclamation reclamation) {
		reclamation = em.merge(reclamation);
		em.remove(reclamation);
	}

	@Override
	public void deletetelephone(Telephone telephone) {
		telephone = em.merge(telephone);
		em.remove(telephone);
	}

	@Override
	public Adresse findadresse(String idAdresse) {
		Adresse a = em.find(Adresse.class, idAdresse);
		return a;
	}

	@Override
	public Etablisement findetablissement(String idetablisement) {
		Etablisement a = em.find(Etablisement.class, idetablisement);
		return a;
	}

	@Override
	public Reclamation findreclamation(String codeReclamation) {
		Reclamation a = em.find(Reclamation.class, codeReclamation);
		return a;
	}

	@Override
	public Telephone findtelephone(String idTel) {
		Telephone a = em.find(Telephone.class, idTel);
		return a;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Utilisateur> getUtilisateur() {

		Query req = em.createNativeQuery("SELECT * FROM Utilisateur", Utilisateur.class);
		return req.getResultList();
	}



	@SuppressWarnings("unchecked")
	@Override
	public List<Reclamation> getreclamation() {

		Query req = em.createNativeQuery("SELECT * FROM Reclamation", Reclamation.class);
		return req.getResultList();
	}

	@Override
	public void updateReclamatiom(boolean estTr, Reclamation reclamation) {

		Query req = em.createQuery("UPDATE Reclamation SET estTraitee=" + estTr + "WHERE codeReclamation="
				+ reclamation.getCodeReclamation());
		req.executeUpdate();
	}

	@Override
	public void updateetatDecompte(Boolean etatDecompte, Utilisateur utilisateur) {
		Query req = em.createQuery(
				"UPDATE Reclamation SET etatDecompte=" + etatDecompte + "WHERE idut=" + utilisateur.getIdut());
		req.executeUpdate();

	}

	@Override
	public void ajout_ut_tel(String l1, String l2, String l3) {

		em.createNativeQuery("INSERT INTO t_utilisateur_telephone (idut, IdTel) VALUES (?,?)")
				.setParameter(1, l3).setParameter(2, l1).executeUpdate();
		em.createNativeQuery("INSERT INTO t_utilisateu_adresse( idAdresse, idut) VALUES (?,?)")
				.setParameter(1, l2).setParameter(2, l3).executeUpdate();
	
	}
	@Override
	public void ajouteetablissement(Etablisement etablisement)
	{
		if(!etablisement.equals(null))
			em.persist(etablisement);
	}
	/*@Override
	public String ajouteetablissement(Etablisement etablisement) {
		em.persist(etablisement);
		em.flush();
		return etablisement.getIdEtablissement();
	}*/
	
	/*@Override
	public void ajouteadresseEtablissement(String l1, String l2, String l3, String l4, String l5) {
		em.createNativeQuery("INSERT INTO t_etablissement_utilisateur(IdEtablissement, idut) VALUES (?,?)")
				.setParameter(1, l5).setParameter(2, l1).executeUpdate();
		em.createNativeQuery("INSERT INTO t_telephone_etablissement(IdEtablissement, IdTel) VALUES (?,?)")
				.setParameter(1, l5).setParameter(2, l2).executeUpdate();
		em.createNativeQuery("INSERT INTO t_telephone_etablissement(IdEtablissement, IdTel) VALUES (?,?)")
				.setParameter(1, l5).setParameter(2, l3).executeUpdate();
		em.createNativeQuery("INSERT INTO t_etablissement_adresse(IdEtablissement, idAdresse) VALUES (?,?)")
				.setParameter(1, l5).setParameter(2, l4).executeUpdate();
//		Query req = em.createQuery("INSERT INTO t_etablissement_utilisateur(IdEtablissement, idut) VALUES ( '" + l5 + "' , '" + l1 + "' )");
//		req.executeUpdate();
//		Query req1 = em.createQuery("INSERT INTO t_telephone_etablissement(IdEtablissement, IdTel) VALUES ( '" + l5 + "' , '" + l2 + "' )");
//		req1.executeUpdate();
//		Query req2 = em.createQuery("INSERT INTO t_telephone_etablissement(IdEtablissement, IdTel) VALUES ( '" + l5 + "' , '" + l3 + "' )");
//		req2.executeUpdate();
//		Query req3 = em.createQuery("INSERT INTO t_etablissement_adresse(IdEtablissement, idAdresse) VALUES ( '" + l5 + "' , '" + l4 + "' )");
//		req3.executeUpdate();
		
		
	}*/

	public Utilisateur authentification_Utilisateur(String email) {
		try {
			Query tq = em.createQuery("select u from Utilisateur u WHERE email=? ", Utilisateur.class);
			tq.setParameter(1, email);
			Utilisateur utilisateur = (Utilisateur) tq.getSingleResult();
			em.merge(utilisateur);
			return utilisateur;
		} catch (Exception noresult) {
			return null;
		}
	}

	@Override
	public Etablisement verification_du_compte(Utilisateur utilisateur) {
		Query query1 = em.createQuery("SELECT E.IdEtablissement FROM t_etablissement_utilisateur E WHERE E.idut  = '"
						+ utilisateur.getIdut() + "'");
		if (query1.getSingleResult().equals(null) == false) {
			long l = (long) query1.getSingleResult();

			Query query = em.createQuery("SELECT E FROM Etablisement E WHERE E.IdEtablissement = '" + l + "'");
			return (Etablisement) query.getSingleResult();
		}
		return null;
	}

	@Override
	public Utilisateur findUtilisateurById(String idut) {
		Utilisateur a = em.find(Utilisateur.class, idut);
		return a;
	}

	@Override
	public Utilisateur getDonnateurByEtablissement(String id_Etablissemment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Etablisement> getAllBeneficiaire() {
		Query req = em.createNativeQuery(
				"SELECT * FROM Etablisement where drs=0 and Intermediaire=0 and Intermediaire=0", Etablisement.class);
		return req.getResultList();
	}

	@Override
	public boolean authentification(String mail, String hashedPassword) {
		try {
			Query tq = em.createQuery("select u from Utilisateur u WHERE u.email =:x and u.mdp =:y ",Utilisateur.class);
			System.out.println("5555");
			tq.setParameter("x", mail);
			tq.setParameter("y", hashedPassword);
			Utilisateur utilisateur = (Utilisateur) tq.getSingleResult();
			em.merge(utilisateur);
			return true;
		} catch (Exception noresult) {
			System.out.println(noresult);
			return false;
		}
	}

	@Override
	public boolean veriff(String mail) {
		try {
			Query tq = em.createQuery("select u from Utilisateur u WHERE email=?", Utilisateur.class);
			tq.setParameter(1, mail);
			Utilisateur utilisateur = (Utilisateur) tq.getSingleResult();
			em.merge(utilisateur);
			return true;
		} catch (Exception noresult) {
			return false;
		}
	}
	@Override
	public List<Besoin> getBesoinsByEtablissement(String idE) {
		
//		TypedQuery<Besoin> q = (TypedQuery<Besoin>) 
//				em.createNamedQuery("Besoin.findAll",Besoin.class);
//		
//		List<Besoin> besoins = (List<Besoin>) q.getResultList().
//				stream().filter(b->b.getEtablisement().getIdEtablissement()==idE).collect(Collectors.toList());
//		
//		return besoins;
		
    	Query req= em.createQuery("select b from Besoin b where b.etablisement.IdEtablissement =:x");
    	req.setParameter("x", idE);
    	return req.getResultList();
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Etablisement> getAllEtablissement() {

		Query req = em.createNativeQuery("SELECT * FROM Etablisement", Etablisement.class);
		return req.getResultList();
	}

	@Override
	public PhotoBesoin getPhotoBesoinById(String idPb) {
		PhotoBesoin photoBesoin =em.find(PhotoBesoin.class, idPb);
		return photoBesoin;
	}

	@Override
	public void updateEtablisement(Etablisement e) 
	{
		if(!e.equals(null))
			em.merge(e);
	}


}