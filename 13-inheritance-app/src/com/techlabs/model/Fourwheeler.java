package com.techlabs.model;

public class Fourwheeler extends Vehicle{
	
	private double mileage;

	public Fourwheeler(String companyName,double mileage) {
		super(companyName);
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	

}
