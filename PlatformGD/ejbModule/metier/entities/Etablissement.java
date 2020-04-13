package metier.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Etablissement implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long IdEtablissement;
	private String NomEtablissement;
	private Boolean Intermediaire;
	private Boolean ministraire;
	private Boolean drs;
	private String libelle;
	//@ManyToMany
	//private Collection<Don> donE;
	
	public Etablissement() {
		super();
	}
	public Etablissement(String nomEtablissement, Boolean intermediaire, Boolean ministraire,
			Boolean drs, String libelle) {
		super();
		NomEtablissement = nomEtablissement;
		Intermediaire = intermediaire;
		this.ministraire = ministraire;
		this.drs = drs;
		this.libelle = libelle;
	}
	public long getIdEtablissement() {
		return IdEtablissement;
	}
	public void setIdEtablissement(long idEtablissement) {
		IdEtablissement = idEtablissement;
	}
	public String getNomEtablissement() {
		return NomEtablissement;
	}
	public void setNomEtablissement(String nomEtablissement) {
		NomEtablissement = nomEtablissement;
	}
	public Boolean getIntermediaire() {
		return Intermediaire;
	}
	public void setIntermediaire(Boolean intermediaire) {
		Intermediaire = intermediaire;
	}
	public Boolean getMinistraire() {
		return ministraire;
	}
	public void setMinistraire(Boolean ministraire) {
		this.ministraire = ministraire;
	}
	public Boolean getDrs() {
		return drs;
	}
	public void setDrs(Boolean drs) {
		this.drs = drs;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	//public Collection<Don> getDonE() {
	//	return donE;
	//}
	//public void setDonE(Collection<Don> donE) {
	//	this.donE = donE;
	//}
	
}
