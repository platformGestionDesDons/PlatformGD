package metier.entities;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Telephone implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	//UUID uuid = UUID.randomUUID();
	//private String IdTel=uuid.toString();
	private String IdTel=UUID.randomUUID().toString();
	private String numero;
	
	
	
	
	@OneToMany  
    @JoinTable( name = "T_UTILISATEUR_TELEPHONE",
                joinColumns = @JoinColumn( name = "IdTel" ),
                inverseJoinColumns = @JoinColumn( name = "idut" ) )
 
	private Collection<Utilisateur> utilisateurs;
	
	@ManyToOne  
    @JoinTable( name = "T_TELEPHONE_ETABLISSEMENT",
                joinColumns = @JoinColumn( name = "IdTel" ),
                inverseJoinColumns = @JoinColumn( name = "IdEtablissement" ) ) 
	private Telephone telephone;
	
	public String getIdTel() {
		return IdTel;
	}
	public void setIdTel(String idTel) {
		IdTel = idTel;
	}
	public Telephone(String numero, Telephone telephone) {
		super();
		IdTel = UUID.randomUUID().toString();
		this.numero = numero;
		this.telephone = telephone;
	}
	public Telephone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Collection<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(Collection<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	public Telephone getTelephone() {
		return telephone;
	}
	public void setTelephone(Telephone telephone) {
		this.telephone = telephone;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
