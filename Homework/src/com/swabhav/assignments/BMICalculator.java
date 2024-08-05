package com.swabhav.assignments;
import java.util.Scanner;

//Write a program that calculates the Body Mass Index (BMI) based on user input for weight (in kilograms) and height (in meters).

public class BMICalculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Weight in kilogram: ");
		float weight = sc.nextFloat();
		System.out.println("Enter height in meter: ");
		float height = sc.nextFloat();
		
		float BMI = weight/(height*height);
		
		System.out.println("BMI ratio is: "+ BMI);
		
		
	}

}
