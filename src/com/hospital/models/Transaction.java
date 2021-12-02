package com.hospital.models;

import java.util.Date;

public class Transaction {
	
	private Patient patien ;
	private Date dateTransaction;
	private double montant;
	private Hospital hopitale;
	
	
	public Transaction(Patient patien, Date dateTransaction, double montant, Hospital hopitale) {
		
		this.patien = patien;
		this.dateTransaction = dateTransaction;
		this.montant = montant;
		this.hopitale = hopitale;
	}

	public Patient getPatien() {
		return patien;
	}
	public void setPatien(Patient patien) {
		this.patien = patien;
	}
	public Date getDateTransaction() {
		return dateTransaction;
	}
	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Hospital getHopitale() {
		return hopitale;
	}
	public void setHopitale(Hospital hopitale) {
		this.hopitale = hopitale;
	}
	@Override
	public String toString() {
		return "Transaction [patien=" + patien + ", dateTransaction=" + dateTransaction + ", montant=" + montant
				+ ", hopitale=" + hopitale + "]";
	}
 	

}
