package metier.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class PhotoBesoin 
{
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int idPB; 
	
	@OneToMany
	private Collection<Photo> photos;
	
	@ManyToOne
	private Besoin besoin;

	public PhotoBesoin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdPB() {
		return idPB;
	}

	public void setIdPB(int idPB) {
		this.idPB = idPB;
	}

	public Collection<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(Collection<Photo> photos) {
		this.photos = photos;
	}

	public Besoin getBesoin() {
		return besoin;
	}

	public void setBesoin(Besoin besoin) {
		this.besoin = besoin;
	}
	
	
	
}
