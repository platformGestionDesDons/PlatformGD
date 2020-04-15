package metier.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PhotoDon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPhoto;
	private String urlPhoto;
	@ManyToOne 
	@JoinColumn( name="codeDon", nullable=false  )
	private Don don;

	public PhotoDon() {
		super();
	}

	public PhotoDon(long idPhoto, String urlPhoto) {
		super();
		this.idPhoto = idPhoto;
		this.urlPhoto = urlPhoto;
	}

	public long getCodePhoto() {
		return idPhoto;
	}

	public void setCodePhoto(long idPhoto) {
		this.idPhoto = idPhoto;
	}

	public String getUrlPhoto() {
		return this.urlPhoto;
	}

	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}
	
}
