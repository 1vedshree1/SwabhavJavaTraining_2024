package com.techlabs.test;

import com.techlabs.model.ITest;
import com.techlabs.model.Reference;

public class ReferenceTest {
	public static void main(String[] args) {
		ITest test1 = Reference :: new;
		display(test1);
		ITest test2 = Reference :: staticPrint;
		display(test2);
		Reference reference = new Reference();
		
		ITest test3 = reference :: print;
		display(test3);
		
		
		
		
	}

	private static void display(ITest test) {
		
		test.test();
	}

}
