package com.swabhav.task.operators;

import java.util.Scanner;

public class BitwiseOperator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number1");
		int number1 = sc.nextInt();
		
		System.out.println("Enter Number2");
		int number2 = sc.nextInt();
		
		int andResult = number1&number2;
		int orResult =  number1|number2;
		
		System.out.println("Result using And operator is: "+ andResult);
		System.out.println("Result using Or operator is: "+ orResult);
	}

}
