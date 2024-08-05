package com.techlabs.list.model;

public class Car {
	private int carId;
	private String company;
	private double price;
	private double mileage;
	public Car(int carId, String company, double price, double mileage) {
		super();
		this.carId = carId;
		this.company = company;
		this.price = price;
		this.mileage = mileage;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", company=" + company + ", price=" + price + ", mileage=" + mileage + "]";
	}
	

}
