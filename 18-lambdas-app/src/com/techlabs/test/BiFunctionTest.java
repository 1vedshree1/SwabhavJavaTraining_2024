package com.techlabs.test;

import java.util.function.BiFunction;


public class BiFunctionTest {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> squareNumber =(Integer number1, Integer number2)-> number1+number2;
		System.out.println("Addition of number is "+squareNumber.apply(5,6));
	}

}
