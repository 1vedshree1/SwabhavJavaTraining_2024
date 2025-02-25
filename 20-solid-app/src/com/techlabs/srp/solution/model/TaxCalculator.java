package com.techlabs.srp.solution.model;

public class TaxCalculator {
	private Invoice invoice;
	private double calculateTax;
	public TaxCalculator(Invoice invoice, double calculateTax) {
		super();
		this.invoice = invoice;
		this.calculateTax = calculateTax;
	}
	
	public double calculateTax() {
		double calculateTax = (invoice.getAmount()*invoice.getTax())/100;
		return calculateTax;
	}

}
