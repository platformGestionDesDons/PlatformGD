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
	//@ManyToMany
	//private Collection<Don> donE;
	
	public Etablissement() {
		super();
	}
	public Etablissement(String nomEtablissement) {
		super();
		NomEtablissement = nomEtablissement;
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
	//public Collection<Don> getDonE() {
	//	return donE;
	//}
	//public void setDonE(Collection<Don> donE) {
	//	this.donE = donE;
	//}
	
}
