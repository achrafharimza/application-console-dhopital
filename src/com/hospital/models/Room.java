package com.hospital.models;

public class Room {

	private int number;
	private int étage;
	
	public Room(int number,int étage) {
		this.number = number;
		this.étage = étage;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getétage() {
		return étage;
	}

	public void setétage(int étage) {
		this.étage = étage;
	}

	@Override
	public String toString() {
		return "Room [number=" + number + ", étage=" + étage + "]";
	}
}
