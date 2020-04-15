package metier.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Besoin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_besoin;
	private String nom_besoin;
	private String etat;
	private int quantite_initiale;
	private int quantite_restante;
	public Besoin() {
		
	}
	public Besoin(String nom_besoin, String etat, int quantite_initiale) {
		super();
		this.nom_besoin = nom_besoin;
		this.etat = etat;
		this.quantite_initiale = quantite_initiale;
		this.quantite_restante = 0;
	}
	public long getId_besoin() {
		return id_besoin;
	}
	public void setId_besoin(long id_besoin) {
		this.id_besoin = id_besoin;
	}
	
	public String getNom_besoin() {
		return nom_besoin;
	}
	public void setNom_besoin(String nom_besoin) {
		this.nom_besoin = nom_besoin;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public int getQuantite_initiale() {
		return quantite_initiale;
	}
	public void setQuantite_initiale(int quantite_initiale) {
		this.quantite_initiale = quantite_initiale;
	}
	public int getQuantite_restante() {
		return quantite_restante;
	}
	public void setQuantite_restante(int quantite_restante) {
		this.quantite_restante = quantite_restante;
	}
	
}
