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
	private long idetablissement;
	private String nometablissement;
	//@ManyToMany
	//private Collection<Don> donE;
	
	public Etablissement() {
		super();
	}
	public Etablissement(String nometablissement) {
		super();
		this.nometablissement = nometablissement;
	}
	public long getIdEtablissement() {
		return idetablissement;
	}
	public void setIdEtablissement(long idetablissement) {
		this.idetablissement = idetablissement;
	}
	public String getNomEtablissement() {
		return nometablissement;
	}
	public void setNomEtablissement(String nometablissement) {
		this.nometablissement = nometablissement;
	}
	//public Collection<Don> getDonE() {
	//	return donE;
	//}
	//public void setDonE(Collection<Don> donE) {
	//	this.donE = donE;
	//}
	
}
