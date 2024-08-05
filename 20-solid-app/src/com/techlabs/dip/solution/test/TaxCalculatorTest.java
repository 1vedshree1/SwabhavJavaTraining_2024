package com.techlabs.dip.solution.test;

import com.techlabs.dip.solution.model.Dblogger;
import com.techlabs.dip.solution.model.Filelogger;
import com.techlabs.dip.solution.model.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		TaxCalculator tax = new TaxCalculator(15000, 0,new Dblogger());
		tax.calculateTax();
		
		tax.setLogger(new Filelogger());
		tax.calculateTax();
		
	}

}
