package com.techlabs.srp.violation.test;

import com.techlabs.srp.violation.model.Invoice;

public class InvoiceTest {
	
	public static void main(String[] args) {
		
		Invoice invoice = new Invoice("A","Mobile Phone",1500,10);
		invoice.printInvoice();
	}

}
