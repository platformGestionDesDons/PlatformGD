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
public class Etablissement implements Serializable{
	@Id
	private String idetablissement;
	private String nometablissement;
	
	@OneToMany(mappedBy="etablissement", fetch = FetchType.EAGER)
	private List<Don> dons;
	
	public Etablissement() {
		super();
	}
	public Etablissement(String nometablissement) {
		super();
		this.idetablissement = UUID.randomUUID().toString();
		this.nometablissement = nometablissement;
	}
	public String getIdetablissement() {
		return idetablissement;
	}
	public void setIdetablissement(String idetablissement) {
		this.idetablissement = idetablissement;
	}
	public String getNometablissement() {
		return nometablissement;
	}
	public void setNometablissement(String nometablissement) {
		this.nometablissement = nometablissement;
	}
	public List<Don> getDons() {
		return dons;
	}
	public void setDons(List<Don> dons) {
		this.dons = dons;
	}
	
}
