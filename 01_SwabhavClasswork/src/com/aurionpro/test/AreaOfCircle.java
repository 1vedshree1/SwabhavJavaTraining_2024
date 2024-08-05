package com.aurionpro.test;

import java.util.Scanner;

public class AreaOfCircle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius of Circle:");
		int radius = sc.nextInt();
		double area = 3.14*radius*radius;
		
		System.out.println("Area of Circle is: "+ area);
		
	}
	
	

	
	


}
