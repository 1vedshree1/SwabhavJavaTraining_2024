package com.techlabs.model;

public class Car extends Fourwheeler {
	
	private double price ;
	
	
	
	

	public Car(String companyName, double mileage, double price) {
		super(companyName,mileage);
		
		this.price = price;
		
	}

	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "Car [price=" + price + ", Mileage: " + getMileage() + ", CompanyName :" + getCompanyName()
				;
	}

}
