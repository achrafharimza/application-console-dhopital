package com.hospital.models;

import java.util.Date;

import com.hospital.enumerations.InsuranceType;

public class Patient extends Person{

	private Date hospitalEntryDate;
	private String affiliationNumber;
	private InsuranceType insuranceType;
	private double portfeuille;
	
	 

	public Patient(String firstname, String lastname, String phone, String address,Date hospitalEntryDate,String affiliationNumber,InsuranceType insuranceType,double portfeuille) {
		super(firstname, lastname, phone, address);
		this.hospitalEntryDate = hospitalEntryDate;
		this.affiliationNumber = affiliationNumber;
		this.insuranceType = insuranceType;
		this.portfeuille = portfeuille;
	 
	}


	public double getPortfeuille() {
		return portfeuille;
	}


	public void setPortfeuille(double portfeuille) {
		this.portfeuille += portfeuille;
	}

	public void payerPortfeuille(double payer) {
		this.portfeuille -= payer;
	}

	public Date getHospitalEntryDate() {
		return hospitalEntryDate;
	}

	public void setHospitalEntryDate(Date hospitalEntryDate) {
		this.hospitalEntryDate = hospitalEntryDate;
	}

	public String getAffiliationNumber() {
		return affiliationNumber;
	}

	public void setAffiliationNumber(String affiliationNumber) {
		this.affiliationNumber = affiliationNumber;
	}

	public InsuranceType getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(InsuranceType insuranceType) {
		this.insuranceType = insuranceType;
	}
	
	
	
	@Override
	public String toString() {
		return "Patient [Name=" + firstname+"-"+lastname + ", affiliationNum=" + affiliationNumber
				+ ", insurance:" + insuranceType +" ,solde: "+portfeuille+ "]";
	}	
}
