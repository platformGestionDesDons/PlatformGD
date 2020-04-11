package metier.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UniteDeMesure 
{
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int idUnite;

	
	@OneToMany
	private Collection<Produit> produits;
	

	public UniteDeMesure() {
		super();
	}

	public int getIdUnite() {
		return idUnite;
	}

	public void setIdUnite(int idUnite) {
		this.idUnite = idUnite;
	}

	public Collection<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
	
	
	
	
}
