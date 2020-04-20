package metier.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private String idut;
	private String nom;
	
	@OneToMany(mappedBy="donnateur", fetch = FetchType.EAGER)
	private List<Don> dons;
	
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
	public List<Don> getDons() {
		return dons;
	}
	public void setDons(List<Don> dons) {
		this.dons = dons;
	}
	
}
