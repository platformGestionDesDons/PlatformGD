package metier.session;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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

	@Override
	public List<Etablissement> getAllEtablissement(){
		Query req = em.createQuery("select e from Etablissement e");
		return req.getResultList();	
	}
	@Override
	public List<Etablissement> getAllDonnateur(){
		Query req = em.createQuery("select u from Utilisateur u");
		return req.getResultList();	
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public String getNomEtablissementById(String id_etablissement) {
		Etablissement a = em.find(Etablissement.class, id_etablissement);
		if (a == null)
			throw new RuntimeException("Don est introuvable");
		return a.getNometablissement();
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
	public List<Produit> getProduitByCategorie(int idc) {
		
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
	public Categorie getCategorieById(int idC) 
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


//	@Override
//	public List<Besoins> getBesoinByEtablissement(String idE) {
//		
//		TypedQuery<Besoin> q = (TypedQuery<Besoin>) 
//				entityManager.createNamedQuery("Besoin.findAll",Besoin.class);
//		
//		List<Besoin> besoins = (List<Besoin>) q.getResultList().
//				stream().filter(b->b.getEtablissement().getIdE()==idE).collect(Collectors.toList());
//		
//		return besoins;
//	}
}
