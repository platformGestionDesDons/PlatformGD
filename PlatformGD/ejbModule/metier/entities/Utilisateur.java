package metier.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Utilisateur implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private String idut;
	private String nom;
	
	
	public Utilisateur() {
		super();
		this.idut = UUID.randomUUID().toString();
	}
	public Utilisateur(String nom) {
		this.idut = UUID.randomUUID().toString();
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Utilisateur [idut=" + idut + ",Nom=" + nom + "]";
	}
	
	public String getIdut() {
		return idut;
	}
	public void setIdut(String idut) {
		this.idut = idut;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
