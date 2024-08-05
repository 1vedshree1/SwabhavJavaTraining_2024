package com.techlabs.test;

import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		
		Predicate<Integer> evenNumber =(Integer number)->(number%2==0);
		
		System.out.println(evenNumber.test(4));
		
	}

}
