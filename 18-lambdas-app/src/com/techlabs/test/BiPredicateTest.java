package com.techlabs.test;

import java.util.function.BiPredicate;

public class BiPredicateTest {
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> compare = (Integer number1, Integer number2)->(number1>number2);
		if(compare.test(2, 3)) {
			System.out.println("number1 is greater");
			return;
		}
		System.out.println("number2 is greater.");
		
		
	}

}
