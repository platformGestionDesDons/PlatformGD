package metier.entities;

import java.util.Collection;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Fournisseur 
{
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int idF;
	private String emailF;
	private String adresseF;
	private long numTelF;
	
	@ManyToMany(mappedBy = "fournisseurs",cascade = CascadeType.ALL)
	private Collection<Produit> produits;
	
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fournisseur(String emailF, String adresseF, long numTelF) {
		super();
		this.emailF = emailF;
		this.adresseF = adresseF;
		this.numTelF = numTelF;
	}
	public int getIdF() {
		return idF;
	}
	public void setIdF(int idF) {
		this.idF = idF;
	}
	public String getEmailF() {
		return emailF;
	}
	public void setEmailF(String emailF) {
		this.emailF = emailF;
	}
	public String getAdresseF() {
		return adresseF;
	}
	public void setAdresseF(String adresseF) {
		this.adresseF = adresseF;
	}
	public long getNumTelF() {
		return numTelF;
	}
	public void setNumTelF(long numTelF) {
		this.numTelF = numTelF;
	}
	public Collection<Produit> getProduits() {
		return produits;
	}
	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
	
	
	
	

}
