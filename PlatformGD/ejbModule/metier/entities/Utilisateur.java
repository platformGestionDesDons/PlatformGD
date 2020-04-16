package metier.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Utilisateur implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idut;
	private String Nom;
	
	//@ManyToMany(targetEntity = Don.class, mappedBy = "utilisateur")
	//private Collection<Don> don;
	
	public Utilisateur() {
		super();
	}
	public Utilisateur(String nom) {
		super();
		Nom = nom;
	}
	@Override
	public String toString() {
		return "Utilisateur [idut=" + idut + ",Nom=" + Nom + "]";
	}
	
	//public Collection<Don> getDon() {
	//	return don;
	//}
	//public void setDon(Collection<Don> don) {
	//	this.don = don;
	//}
	public long getIdut() {
		return idut;
	}
	public void setIdut(String nom) {
		this.Nom = nom;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	
}
