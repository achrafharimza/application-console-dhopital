package com.hospital.models;

public class Room {

	private int number;
	private int �tage;
	
	public Room(int number,int �tage) {
		this.number = number;
		this.�tage = �tage;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int get�tage() {
		return �tage;
	}

	public void set�tage(int �tage) {
		this.�tage = �tage;
	}

	@Override
	public String toString() {
		return "Room [number=" + number + ", �tage=" + �tage + "]";
	}
}
