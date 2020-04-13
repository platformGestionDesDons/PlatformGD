package com.faire_un_don.org;

import java.util.Date;

public class Don {
	
	private int numero_don;
	private Date date_planifiée;
	private Date date_reglement;
	private double montant;
	private String mode_reglement;
	private int quantite;
	private boolean estAccepte;
	private boolean estSupprime;
	private String visibilité;
	private boolean vu;
	
	public Don() {
		
	}
	@Override
	public String toString() {
		return "Don [numero_don=" + numero_don + ", date_planifiée=" + date_planifiée + ", montant=" + montant
				+ ", mode_reglement=" + mode_reglement + ", quantite=" + quantite + ", estAccepte=" + estAccepte
				+ ", estSupprime=" + estSupprime + ", visibilité=" + visibilité + ", vu=" + vu + "]";
	}
	
	public int getNumero_don() {
		return numero_don;
	}
	public void setNumero_don(int numero_don) {
		this.numero_don = numero_don;
	}
	public Date getDate_planifiée() {
		return date_planifiée;
	}
	public void setDate_planifiée(Date date_planifiée) {
		this.date_planifiée = date_planifiée;
	}
	public Date getDate_reglement() {
		return date_reglement;
	}
	public void setDate_reglement(Date date_reglement) {
		this.date_reglement = date_reglement;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getMode_reglement() {
		return mode_reglement;
	}
	public void setMode_reglement(String mode_reglement) {
		this.mode_reglement = mode_reglement;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public boolean isEstAccepte() {
		return estAccepte;
	}
	public void setEstAccepte(boolean estAccepte) {
		this.estAccepte = estAccepte;
	}
	public boolean isEstSupprime() {
		return estSupprime;
	}
	public void setEstSupprime(boolean estSupprime) {
		this.estSupprime = estSupprime;
	}
	public String getVisibilité() {
		return visibilité;
	}
	public void setVisibilité(String visibilité) {
		this.visibilité = visibilité;
	}
	public boolean isVu() {
		return vu;
	}
	public void setVu(boolean vu) {
		this.vu = vu;
	}
}
