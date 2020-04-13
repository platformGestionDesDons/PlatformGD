package metier.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Utilisateur implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long idut;
	
	private String email;

	private String Nom;
	private String Prenom;
	private String mdp;
	private Boolean etatDecompte;
	private String role;
	
	//@ManyToMany(targetEntity = Don.class, mappedBy = "utilisateur")
	//private Collection<Don> don;
	
	public Utilisateur() {
		super();
	}
	public Utilisateur(String email, String nom, String prenom, String mdp,
			String role) {
		super();
		this.email = email;
		Nom = nom;
		Prenom = prenom;
		this.mdp = mdp;
		this.role = role;
	}
	@Override
	public String toString() {
		return "Utilisateur [idut=" + idut + ", email=" + email + ", Nom=" + Nom + ", Prenom=" + Prenom + ", mdp=" + mdp
				+ ", etatDecompte=" + etatDecompte + ", role=" + role + "]";
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
	public void setIdut(long idut) {
		this.idut = idut;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public Boolean getEtatDecompte() {
		return etatDecompte;
	}
	public void setEtatDecompte(Boolean etatDecompte) {
		this.etatDecompte = etatDecompte;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
