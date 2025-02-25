package com.techlabs.srp.solution.model;

public class InvoicePrinter {

	private Invoice invoice;
	private TaxCalculator tax;

	public InvoicePrinter(Invoice invoice,TaxCalculator tax) {
		super();
		this.invoice = invoice;
		this.tax =tax;
	}
	public void printInvoice() {
		System.out.println("Id: "+invoice.getId());
		System.out.println("Description: "+invoice.getDescription());
		System.out.println("Amount: "+invoice.getAmount());
		System.out.println("Tax: "+invoice.getTax());
		System.out.println("Calculate Tax: "+tax.calculateTax());
		System.out.println("Total Amount :"+ (invoice.getAmount()+tax.calculateTax()));
		
		
	}

}
