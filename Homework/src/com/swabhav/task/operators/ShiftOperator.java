package com.swabhav.task.operators;

import java.util.Scanner;

public class ShiftOperator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int number1 = sc.nextInt();
		int leftshift = number1<<1;
		int rightshift = 1<<number1;
		
		System.out.println("Result using Leftshift Operator: "+leftshift);
		System.out.println("Result using Rightshift Operator: "+rightshift);
		
		
		
		
		
		
		
}

}
