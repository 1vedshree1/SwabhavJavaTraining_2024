package com.aurionpro.test1;

public class SumCalculator {
	
	public static void main(String[] args) {
		
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		
		int sum = number1+number2;
		System.out.println("Sum of two numbers is :"+ sum);
		
		
	}

}
