package metier.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Etablisement implements Serializable {
	@Id
	//UUID uuid = UUID.randomUUID();
	//private String IdEtablissement=uuid.toString();
	private String IdEtablissement=UUID.randomUUID().toString();
	private String NomEtablissement;
	private Boolean Intermediaire;
	private Boolean ministraire;
	private Boolean hospital;
	private Boolean drs;
	
	
	
	
	public Boolean getHospital() {
		return hospital;
	}

	public void setHospital(Boolean hospital) {
		this.hospital = hospital;
	}

	public String getIdEtablissement() {
		return IdEtablissement;
	}



	private String libelle;

	public Collection<Telephone> getTelephones() {
		return telephones;
	}

	public void setTelephones(Collection<Telephone> telephones) {
		this.telephones = telephones;
	}

	public void setIdEtablissement(String idEtablissement) {
		IdEtablissement = idEtablissement;
	}

	public Etablisement(String nomEtablissement, Boolean intermediaire, Boolean ministraire, Boolean drs,
			String libelle) {
		super();
		IdEtablissement = UUID.randomUUID().toString();
		NomEtablissement = nomEtablissement;
		Intermediaire = intermediaire;
		this.ministraire = ministraire;
		this.drs = drs;
		this.libelle = libelle;
	}

	public Etablisement() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@OneToMany
	//@JoinTable(name = "T_ETABLISSEMENT_ADRESSE", joinColumns = @JoinColumn(name = "IdEtablissement"), inverseJoinColumns = @JoinColumn(name = "idAdresse"))
	private Collection<Adresse> adresses;

	@OneToMany
	//@JoinTable(name = "T_TELEPHONE_ETABLISSEMENT", joinColumns = @JoinColumn(name = "IdEtablissement"), inverseJoinColumns = @JoinColumn(name = "IdTel"))
	private Collection<Telephone> telephones;

	@ManyToOne
	//@JoinTable(name = "T_ETABLISSEMENT_UTILISATEUR", joinColumns = @JoinColumn(name = "idut"), inverseJoinColumns = @JoinColumn(name = "IdEtablissement"))
	private Utilisateur utilisateur;

	public String getNomEtablissement() {
		return NomEtablissement;
	}

	@OneToMany(mappedBy="etablissement", fetch = FetchType.EAGER)
	private List<Don> dons;
	
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

	public Collection<Adresse> getAdresses() {
		return adresses;
	}

	public void setAdresses(Collection<Adresse> adresses) {
		this.adresses = adresses;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<Don> getDons() {
		return dons;
	}

	public void setDons(List<Don> dons) {
		this.dons = dons;
	}
	
}
