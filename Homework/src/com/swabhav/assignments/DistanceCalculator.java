package com.swabhav.assignments;

import java.util.Scanner;

//Write a program that calculates the distance between two points (x1, y1) and (x2, y2) using the distance formula.

public class DistanceCalculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("point1");
		System.out.println("Enter x1: ");
		double x1 = sc.nextDouble();
		System.out.println("Enter y1: ");
		double y1 = sc.nextDouble();
		
		
		System.out.println("point2");
		System.out.println("Enter x2: ");
		double x2 = sc.nextDouble();
		System.out.println("Enter y2: ");
		double y2 = sc.nextDouble();
		
		double distance = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1, 2));
		
		System.out.println("Calculated Distance between two points is: "+ distance);
		}
}
