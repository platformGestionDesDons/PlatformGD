package metier.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.UUID;


import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Adresse implements Serializable {
	@Id
	//UUID uuid = UUID.randomUUID();
	//private String idAdresse=uuid.toString();
	private String idAdresse=UUID.randomUUID().toString();
	private String gouvernorat;
	private String adresse;
	private int codePostale;

	@OneToMany
	//@JoinTable(name = "T_UTILISATEU_ADRESSE", joinColumns = @JoinColumn(name = "idAdresse"), inverseJoinColumns = @JoinColumn(name = "idut"))
	private Collection<Utilisateur> utilisateurs;

	@ManyToOne
	//@JoinTable(name = "T_ETABLISSEMENT_ADRESSE", joinColumns = @JoinColumn(name = "idAdresse"), inverseJoinColumns = @JoinColumn(name = "IdEtablissement"))
	private Etablisement etablisement;

	public String getIdAdresse() {
		return idAdresse;
	}

	public void setIdAdresse(String idAdresse) {
		this.idAdresse = idAdresse;
	}

	public Collection<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(Collection<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	public Etablisement getEtablisement() {
		return etablisement;
	}

	public void setEtablisement(Etablisement etablisement) {
		this.etablisement = etablisement;
	}

	public Adresse(String gouvernorat, String adresse, int codePostale) {
		super();
		this.idAdresse = UUID.randomUUID().toString();
		this.gouvernorat = gouvernorat;
		this.adresse = adresse;
		this.codePostale = codePostale;
	}

	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getGouvernorat() {
		return gouvernorat;
	}

	public void setGouvernorat(String gouvernorat) {
		this.gouvernorat = gouvernorat;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}

	public Collection<Utilisateur> getCommands() {
		return utilisateurs;
	}

	public void setCommands(Collection<Utilisateur> commands) {
		this.utilisateurs = commands;
	}

}
