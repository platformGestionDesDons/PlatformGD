package metier.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Categorie")
@NamedQuery(name="Categorie.findAll", query="SELECT p FROM Categorie p")

public class Categorie 
{
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int idC;
	private String libelle;
	
	@OneToMany(mappedBy="categorie", fetch = FetchType.EAGER)
	private List<Produit> produits;
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie(String libelle) {
		super();
		this.libelle = libelle;
	}
	public int getIdC() {
		return idC;
	}
	public void setIdC(int idC) {
		this.idC = idC;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
}
