package com.techlabs.structural.adapter.model;

public class Hat {

	private String shortName;
	private String longName;
	private double price;
	private double tax;
	public Hat(String shortName, String longName, double price, double tax) {
		super();
		this.shortName = shortName;
		this.longName = longName;
		this.price = price;
		this.tax = tax;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
}
