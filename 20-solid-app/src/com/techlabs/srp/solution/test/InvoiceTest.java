package com.techlabs.srp.solution.test;

import com.techlabs.srp.solution.model.Invoice;
import com.techlabs.srp.solution.model.InvoicePrinter;
import com.techlabs.srp.solution.model.TaxCalculator;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice("A","Mobile Phone", 1500,10);
		TaxCalculator tax = new TaxCalculator(invoice, 0);
		InvoicePrinter print = new InvoicePrinter(invoice,tax);
		
		
		tax.calculateTax();
		print.printInvoice();
	}
}
