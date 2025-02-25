package com.techlabs.dip.violation.model;

import com.techlabs.dip.solution.model.ILogger;
import com.techlabs.dip.violation.exception.DBloggerException;

public class TaxCalculator {
	private int amount;
	private int rate;
	private ILogger logger;
	public TaxCalculator(int amount, int rate) {
		super();
		this.amount = amount;
		this.rate = rate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public void calculateTax() {
		int tax= 0;
		try {
		tax= amount/rate;
		System.out.println("Total amount is: "+(amount+tax));
		}
		catch(Exception e) {
			new DBloggerException().log("divide by zero");		
			
		}
		
	
	}
	public ILogger getLogger() {
		return logger;
	}
	public void setLogger(ILogger logger) {
		this.logger = logger;
	}

}
