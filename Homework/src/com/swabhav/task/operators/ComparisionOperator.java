package com.swabhav.task.operators;

import java.util.Scanner;

public class ComparisionOperator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Percentage:");
		float percentage = sc.nextFloat();
		
		if (percentage<35)
			System.out.println("You are fail, Better luck next time");
		if(percentage>=35)
			System.out.println("Congratulations, You are passed");
			
		
		
		
	}

}
