package com.techlabs.dip.violation.test;

import com.techlabs.dip.violation.model.TaxCalculator;

public class TaxTest {
	public static void main(String[] args) {
		TaxCalculator tax = new TaxCalculator(15000, 0);
		tax.calculateTax();
	}

}
