package com.techlabs.test;

public class Test {

	public static void main(String[] args) {
		try {
		int number1 = Integer.parseInt(args[0]);
		int number2=Integer.parseInt(args[1]);
		
		
		double result = number1/number2;
		System.out.println("Division is:"+result);
		}
		catch(ArithmeticException exception) {
			System.out.println("Wrong input for number2. It cant be zero.");
			
		}
		catch(ArrayIndexOutOfBoundsException excepion) {
			System.out.println("Please provide two numbers. number cannot empty.");
		}
		catch(NumberFormatException exception) {
			System.out.println("Only interger values are allowed.");
		}
		catch(Exception exception) {
			System.out.println("Something went wrong: "+exception);
		}
		finally {
			System.out.println("inside finally. Closing activities");
		}
		System.out.println("exit main");
	}
		
	
}
