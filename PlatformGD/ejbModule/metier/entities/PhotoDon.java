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
	
	public PhotoDon() {
		super();
		this.idPD = UUID.randomUUID().toString();
	}

	public String getIdPD() {
		return idPD;
	}
	public void setIdPD(String idPD) {
		this.idPD = idPD;
	}
	public List<Photo> getPhotos() {
		return photos;
	}
	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
	
	
}