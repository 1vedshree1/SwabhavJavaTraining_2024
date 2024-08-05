package com.techlabs.test;

import com.techlabs.model.IFactorial;

public class FactorialTest {
	public static void main(String[] args) {
		IFactorial factorial = number->{
			int fact = 1;
			for(int i=1;i<=number;i++) {
				fact *=i;
				
			}
			return fact;
		};
		
		System.out.println(factorial.factorial(5));
	}

}
