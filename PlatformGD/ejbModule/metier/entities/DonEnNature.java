package metier.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("D_enNature")
public class DonEnNature extends Don implements Serializable{
	
	private double prix_totale;
	private int quantite;
	private String nom_produit;
	
	
	public DonEnNature() {
		super();
	}

	public DonEnNature(double prix_totale, int quantite, String nom_produit) {
		super();
		this.prix_totale = prix_totale;
		this.quantite = quantite;
		this.nom_produit = nom_produit;
	}

	public double getPrix_totale() {
		return prix_totale;
	}

	public void setPrix_totale(double prix_totale) {
		this.prix_totale = prix_totale;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public String getNom_produit() {
		return nom_produit;
	}

	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}
	
}
