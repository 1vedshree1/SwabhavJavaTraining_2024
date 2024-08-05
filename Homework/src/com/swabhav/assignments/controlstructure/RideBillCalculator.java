package com.swabhav.assignments.controlstructure;

import java.util.Scanner;

public class RideBillCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start the ride");
		System.out.println("Is your height above 120cm? (yes/no)");
		String start = sc.nextLine();
		start = start.toLowerCase();
		int charge = 0;
		int bill = 0;
		if(start.equals("yes")) {
			System.out.println("You can ride");
			System.out.println("Enter your age: ");
			int age = sc.nextInt();
			sc.nextLine();
			if(age<12) {
				charge =5;
				System.out.println("Do you want photos? (yes/no");
				String photo = sc.nextLine();
				if(photo.equals("yes")) {
					bill = charge+3;	
				}
					
				}
			else if(age>=12 && age<= 18) {
				charge=7;
				
			}
			else if(age>=45 && age<=55) {
				charge = 0;
			}
			else {
				charge=12;
			}
			
		System.out.println("Do you want photos? (yes/no): ");
		String photo = sc.nextLine();
		photo = photo.toLowerCase();
			
			
			if(photo.equals("yes")) {
				bill = charge+3;
				System.out.println("your bill is: $"+bill);
			}
			else {
				bill = charge;
				System.out.println("your bill is: $"+bill);
			}
			
			
		
	}
		else {
			System.out.println("Cant ride");
		}

}
}
