package metier.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue("D_reglement")
public class Reglement extends Don{
	
	private double montant;
	@Temporal(TemporalType.TIME)
	private Date dateReglement;
	//cheque ou bien virement bancaire
	private String modeReglement;
	
	
	public Reglement() {
		super();
	}

	public Reglement(double montant, Date dateReglement, String modeReglement) {
		super();
		this.montant = montant;
		this.dateReglement = dateReglement;
		this.modeReglement = modeReglement;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Date getDateReglement() {
		return dateReglement;
	}

	public void setDateReglement(Date dateReglement) {
		this.dateReglement = dateReglement;
	}

	public String getModeReglement() {
		return modeReglement;
	}

	public void setModeReglement(String modeReglement) {
		this.modeReglement = modeReglement;
	}
	
	
}
