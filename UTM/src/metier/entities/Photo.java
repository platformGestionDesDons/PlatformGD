package metier.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Photo 
{
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int idP;

	public int getIdP() {
		return idP;
	}

	public void setIdP(int idP) {
		this.idP = idP;
	}

	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
