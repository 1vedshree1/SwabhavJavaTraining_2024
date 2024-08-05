package com.techlabs.dip.solution.model;



public class TaxCalculator {
	
	private int amount;
	private int rate;
	private ILogger logger;
	public TaxCalculator(int amount, int rate,ILogger logger) {
		super();
		this.amount = amount;
		this.rate = rate;
		this.logger = logger;
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
	public ILogger getLogger() {
		return logger;
	}
	public void setLogger(ILogger logger) {
		this.logger = logger;
	}
	public void calculateTax() {
		int tax= 0;
		try {
		tax= amount/rate;
		System.out.println("Total amount is: "+(amount+tax));
		}
		catch(Exception e) {
			getLogger().log("divide by zero");		
			
		}
		
		
	
	}
	
	

}
