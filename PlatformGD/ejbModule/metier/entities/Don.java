package metier.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_DON", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("D")
public class Don implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_don;
	private String DatePlanifiee;
	private boolean estAccepte;
	private boolean estSupprime;
	private String visibilite;
	private boolean vu;
	
	//@ManyToMany
	//private Collection<Utilisateur> utilisateur;
	//@OneToMany(targetEntity=PhotoDon.class, mappedBy="don" )
	//private Collection<PhotoDon> liste_photos_don;
	//@ManyToMany(targetEntity=Etablissement.class, mappedBy="donE" )
	//private Collection<Etablissement> etablissement;
	
	
	public Don() {
		super();
	}
	public Don(String datePlanifiee, boolean estAccepte, boolean estSupprime, String visibilite,
			boolean vu) {
		DatePlanifiee = datePlanifiee;
		this.estAccepte = estAccepte;
		this.estSupprime = estSupprime;
		this.visibilite = visibilite;
		this.vu = vu;
	}
	
	public Don(String datePlanifiee, String visibilite, boolean vu) {
		DatePlanifiee = datePlanifiee;
		this.visibilite = visibilite;
		this.vu = vu;
	}
	//public Collection<Utilisateur> getUtilisateur() {
	//	return utilisateur;
	//}
	//public void setUtilisateur(Collection<Utilisateur> utilisateur) {
	//	this.utilisateur = utilisateur;
	//}
	//public Collection<PhotoDon> getListe_photos_don() {
	//	return liste_photos_don;
	//}
	//public void setListe_photos_don(Collection<PhotoDon> liste_photos_don) {
	//	this.liste_photos_don = liste_photos_don;
	//}
	public long getId_don() {
		return this.id_don;
	}
	public void setId_don(long id_don) {
		this.id_don = id_don;
	}
	public String getDatePlanifiee() {
		return DatePlanifiee;
	}
	public void setDatePlanifiee(String datePlanifiee) {
		DatePlanifiee = datePlanifiee;
	}
	public boolean isEstAccepte() {
		return estAccepte;
	}
	public void setEstAccepte(boolean estAccepte) {
		this.estAccepte = estAccepte;
	}
	public boolean isEstSupprime() {
		return estSupprime;
	}
	public void setEstSupprime(boolean estSupprime) {
		this.estSupprime = estSupprime;
	}
	public String getVisibilite() {
		return visibilite;
	}
	public void setVisibilite(String visibilite) {
		this.visibilite = visibilite;
	}
	public boolean isVu() {
		return vu;
	}
	public void setVu(boolean vu) {
		this.vu = vu;
	}
	//public Collection<Etablissement> getEtablissement() {
	//	return etablissement;
	//}
	//public void setEtablissement(Collection<Etablissement> etablissement) {
	//	this.etablissement = etablissement;
	//}
	
}
