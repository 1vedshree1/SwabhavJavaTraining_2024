package com.techlabs.test;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		
		Function<Integer,Integer> squareNumber =(Integer number)-> number*number;
//		System.out.println("Square of number is "+squareNumber.apply(5));
		
		
		method(squareNumber);
	}

	private static void method(Function<Integer, Integer> squareNumber) {
		System.out.println("Square of number is "+squareNumber.apply(5));
		
		
		
		
	}
	
	
}
