package com.techlabs.srp.violation.model;

public class Invoice {
	
	private String id;
	private String description;
	private double amount;
	private double tax;
	public Invoice(String id, String description, double amount, double tax) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double calculateTax() {
		double calculateTax = (amount*tax)/100;
		return calculateTax;
	}
	public void printInvoice() {
		System.out.println("Id: "+getId());
		System.out.println("Description: "+getDescription());
		System.out.println("Amount: "+getAmount());
		System.out.println("Tax: "+getTax());
		System.out.println("Calculate Tax: "+calculateTax());
		System.out.println("Total Amount :"+ (getAmount()+calculateTax()));
		
		
	}

}
