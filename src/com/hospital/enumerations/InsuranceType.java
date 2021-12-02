package com.hospital.enumerations;

public enum InsuranceType {

	CNSS("CNSS",0.3),
	RAMED("RAMED",0.2),
	CNOPS("CNOPS",0);
	
	
	private String value;
	private double red ;
	
	InsuranceType(String value, double red ) {
		this.value = value;
		this.red = red;
		
	}
	
	
	
	public String getValue() {
		return value;
	}
	public double getRed() {
		return red;
	}

	
}
