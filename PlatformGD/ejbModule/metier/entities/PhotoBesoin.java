package metier.entities;


import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class PhotoBesoin 
{
	@Id 
	private String idPB; 
	
	//	@OneToMany(fetch = FetchType.EAGER)
	@OneToMany
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Photo> photos;
	


	public PhotoBesoin() {
		super();
		this.idPB = UUID.randomUUID().toString();
	}

	public String getIdPB() {
		return idPB;
	}

	public void setIdPB(String idPB) {
		this.idPB = idPB;
	}

	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	@Override
	public String toString() {
		return "PhotoBesoin [idPB=" + idPB + ", photos=" + photos + "]";
	}
}