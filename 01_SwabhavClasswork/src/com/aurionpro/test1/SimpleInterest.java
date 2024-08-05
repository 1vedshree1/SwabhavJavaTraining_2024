package com.aurionpro.test1;

public class SimpleInterest {
	
	public static void main(String[] args) {
		
		float Principal= Float.parseFloat(args[0]);
		float rateOfinterest = Float.parseFloat(args[1]);
		float years = Float.parseFloat(args[2]);
		
		double SI = (Principal*rateOfinterest*years)/100;
		
		System.out.println("Simple Interest is: "+ SI);
		
		
	}

}
