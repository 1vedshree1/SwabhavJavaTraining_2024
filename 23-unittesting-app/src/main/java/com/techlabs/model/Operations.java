package com.techlabs.model;

public class Operations {
	
	public int addition(int a, int b) {
		return a+b;
		
	}
	public int substraction(int a, int b) {
		return a-b;
	}
	public int division(int number1, int number2) {
		if(number2==0)
			throw new ArithmeticException();
		return number1/number2;
	}
	public int[] squareOfElements(int[] numbers) {
		for(int i =0;i<numbers.length;i++) {
			numbers[i]= numbers[i]*numbers[i];
			
			
		}
		return numbers;
	}
	public boolean isEven(int number) {
		if(number%2==0)
			return true;
		return false;
		
	}
	

}
