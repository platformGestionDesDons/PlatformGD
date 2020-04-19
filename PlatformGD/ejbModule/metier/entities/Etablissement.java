package metier.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Etablissement implements Serializable{
	@Id
	private String idetablissement;
	private String nometablissement;
	
	public Etablissement() {
		super();
	}
	public Etablissement(String nometablissement) {
		super();
		this.idetablissement = UUID.randomUUID().toString();
		this.nometablissement = nometablissement;
	}
	public String getIdEtablissement() {
		return idetablissement;
	}
	public void setIdEtablissement(String idetablissement) {
		this.idetablissement = idetablissement;
	}
	public String getNomEtablissement() {
		return nometablissement;
	}
	public void setNomEtablissement(String nometablissement) {
		this.nometablissement = nometablissement;
	}
	
}
