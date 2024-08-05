package com.swabhav.assignments;

import java.util.Scanner;

public class AreaOfTrapezoid {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of base1:");
		float base1= sc.nextFloat();
		System.out.println("Enter value of base2:");
		float base2 = sc.nextFloat();
		System.out.println("Enter value of height:");
		float height = sc.nextFloat();
		
		double Area = ((base1+base2)/ 2)*height;
		
		System.out.println("Area of Trapezoid is: "+ Area);
		

		
	}
	
}
