package com.swabhav.task.operators;

import com.swabhav.poc.AccessSpecifier;

public class ArithematicOperator extends AccessSpecifier {

	
	public static void main(String[] args) {
		
		ArithematicOperator operator = new ArithematicOperator();
		System.out.println(operator.name);
		System.out.println(operator.address);
     	System.out.println(operator.getId());
		//System.out.println(operator.age);
	int num1 = 20;
	int num2 = 7;
arithmeticOperations(num1, num2);
}

public static void arithmeticOperations(int a, int b) {


	
	int addition = a + b;
	System.out.println("Addition: " + addition);

	
	int subtraction = a - b;
	System.out.println("Subtraction: " + subtraction);

	
	int multiplication = a * b;
	System.out.println("Multiplication: " + multiplication);

	
	
	int division = a / b; 
	System.out.println("division: " + division);

	
	int modulus = a % b;
	System.out.println("Modulus: " + modulus);

	
}



}
