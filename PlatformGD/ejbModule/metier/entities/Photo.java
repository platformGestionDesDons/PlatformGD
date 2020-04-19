package metier.entities;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Photo 
{
	@Id 
	private String idP;

//	@ManyToOne
//	private PhotoBesoin photoBesoin;
	
	public String getIdP() {
		return idP;
	}

	public void setIdP(String idP) {
		this.idP = idP;
	}

	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public PhotoBesoin getPhotoBesoin() {
//		return photoBesoin;
//	}
//
//	public void setPhotoBesoin(PhotoBesoin photoBesoin) {
//		this.photoBesoin = photoBesoin;
//	}

	
	
	
	
}
