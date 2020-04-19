package metier.entities;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class PhotoDon {
	
	@Id
	private String idPD;
	
	@OneToMany(fetch = FetchType.EAGER)
	private List<Photo> photos;
	
	@ManyToOne
	private Don don;

	public PhotoDon() {
		
	}
	public PhotoDon(String url) {
		super();
		this.idPD = UUID.randomUUID().toString();
	}
	public String getIdPhoto() {
		return idPD;
	}


	public void setIdPhoto(String idPhoto) {
		this.idPD = idPhoto;
	}


	public Don getDon() {
		return don;
	}


	public void setDon(Don don) {
		this.don = don;
	}
	
	
}