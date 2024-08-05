package com.swabhav.assignments;

import java.util.Scanner;

//Write a program that converts minutes into hours and minutes (e.g., 130 minutes is 2 hours and 10 minutes).

public class MinutesConverter {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Minutes: ");
		int minutes = sc.nextInt();
		
		int hours = minutes/60;
		int restminutes = minutes%60;
		
		System.out.println("Time: "+hours+" hours "+restminutes+" min");
		
		
	}	

}
