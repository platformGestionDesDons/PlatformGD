package metier.session;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import metier.entities.*;

@Stateless
public class GestBesoinGDImpl implements GestBesoinLocal, GestBesoinRemote{
	@PersistenceContext(unitName = "PlatformGD")
	private EntityManager entityManager;

	@Override
	public void ajoutBesoin(Besoin b) 
	{

			
		if(!b.equals(null))
		{
			entityManager.persist(b);

		}
		
	}

	@Override
	public void ajoutProduit(Produit p) 
	{
		if(!p.equals(null))
		{
			entityManager.persist(p);
		}
			
		
	}

	@Override
	public void ajoutCategorie(Categorie c) {
		if(!c.equals(null))
			entityManager.persist(c);
		
	}

	@Override
	public void ajoutPhotoBesoin(PhotoBesoin pB) 
	{
		if(!pB.equals(null))
			entityManager.persist(pB);
		
	}

	@Override
	public void ajoutUniteDeMesure(UniteDeMesure uM) 
	{
		if(!uM.equals(null))
			entityManager.persist(uM);
		
	}

	@Override
	public void ajoutFournisseur(Fournisseur f) 
	{
		if(!f.equals(null))
			entityManager.persist(f);
		
	}
	@Override
	public void ajoutPhoto(Photo ph)
	{
		if(!ph.equals(null))
			entityManager.persist(ph);
	}
	
	@Override
	public void deleteBesoin(Besoin b) 
	{
		
		entityManager.remove(entityManager.find(Besoin.class, b.getIdBesoin()));
	}

	@Override
	public void deleteProduit(Produit p)
	{
		entityManager.remove(entityManager.find(Produit.class, p.getIdProduit()));		
	}

	@Override
	public void deleteCategorie(Categorie c) 
	{
		entityManager.remove(entityManager.find(Categorie.class, c.getIdC()));
		
	}

	@Override
	public void deletePhotoBesoin(PhotoBesoin pB) 
	{
		entityManager.remove(entityManager.find(PhotoBesoin.class, pB.getIdPB()));		
	}

	@Override
	public void deleteUniteDeMesure(UniteDeMesure uM) 
	{
		entityManager.remove(entityManager.find(UniteDeMesure.class, uM.getIdUnite()));		
		
	}

	@Override
	public void deleteFournisseur(Fournisseur f) 
	{
		entityManager.remove(entityManager.find(Fournisseur.class, f.getIdF()));		
		
	}

	@Override
	public void deletePhoto(Photo ph)
	{
		entityManager.remove(entityManager.find(Photo.class, ph.getIdP()));
	}
	
	@Override
	public void updateBesoin(Besoin b) 
	{
		if(!b.equals(null))
			entityManager.merge(b);
		
	}

	@Override
	public void updateProduit(Produit p) 
	{
		if(!p.equals(null))
			entityManager.merge(p);
		
	}

	@Override
	public void updateCategorie(Categorie c) {
		if(!c.equals(null))
			entityManager.merge(c);
		
	}

	@Override
	public void updatePhotoBesoin(PhotoBesoin pB) 
	{
		if(!pB.equals(null))
			entityManager.merge(pB);
		
	}

	@Override
	public void updateUniteDeMesure(UniteDeMesure uM) 
	{
		if(!uM.equals(null))
			entityManager.merge(uM);
		
	}

	@Override
	public void updateFournisseur(Fournisseur f) 
	{
		if(!f.equals(null))
			entityManager.merge(f);
		
	}

	@Override
	public List<Besoin> getAllBesoin() {
		return entityManager.createNamedQuery("Besoin.findAll",Besoin.class).getResultList();

	}

	@Override
	public List<Produit> getAllProduit() {
		return entityManager.createNamedQuery("Produit.findAll",Produit.class).getResultList();
	}

	@Override
	public List<Categorie> getAllCategorie() {
		return entityManager.createNamedQuery("Categorie.findAll",Categorie.class).getResultList();
	}

	@Override
	public List<PhotoBesoin> getAllPhotoBesoin() {
		return entityManager.createNamedQuery("PhotoBesoin.findAll",PhotoBesoin.class).getResultList();

	}

	@Override
	public List<UniteDeMesure> getAllUniteDeMesure() {
		return entityManager.createNamedQuery("UniteDeMesure.findAll",UniteDeMesure.class).getResultList();
	}

	@Override
	public List<Fournisseur> getAllFournisseur() 
	{
		return entityManager.createNamedQuery("Fournisseur.findAll",Fournisseur.class).getResultList();

	}

	@Override
	public List<Produit> getProduitByCategorie(int idc) {
		
		TypedQuery<Produit> q = (TypedQuery<Produit>) 
				entityManager.createNamedQuery("Produit.findAll",Produit.class);
		
		List<Produit> produits = (List<Produit>) q.getResultList().
				stream().filter(p->p.getCategorie().getIdC()==idc).collect(Collectors.toList());
		
		return produits;
	}
	
	

	

	@Override
	public List<Produit> getProduitByFounisseur(String idF)
	{
	    	Query req= entityManager.createQuery("select p from produit p where p.fournisseurs.idF=:x");
	    	req.setParameter("x", idF);
	    	return req.getResultList();
	}	
	

	
	@Override
	public List<Fournisseur> getFournisseurByProduit(String idP) 
	{
    	Query req= entityManager.createQuery("select f from Fournisseur f join fetch f.produits ps where ps.idProduit=: x");
    	//Query req= entityManager.createQuery("select f from Fournisseur f where  f.produits.idProduit=:x");
    	req.setParameter("x", idP);
    	return req.getResultList();
	}

	@Override
	public Produit getProduitById(String idP) 
	{
		Produit produit = entityManager.find(Produit.class, idP);
		return produit;
	}
	@Override
	public UniteDeMesure getUniteDeMesureById(String idU) {
		UniteDeMesure uniteDeMesure = entityManager.find(UniteDeMesure.class,idU);
		return uniteDeMesure;
	}

	@Override
	public Categorie getCategorieById(int idC) 
	{
		Categorie categorie = entityManager.find(Categorie.class, idC);
		return categorie;
	}

	@Override
	public Besoin getBesoinById(String idB) {
		Besoin besoin =entityManager.find(Besoin.class, idB);
		return besoin;
	}

	@Override
	public Fournisseur getFournisseurById(String idF) 
	{
		Fournisseur fournisseur =entityManager.find(Fournisseur.class, idF);
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
