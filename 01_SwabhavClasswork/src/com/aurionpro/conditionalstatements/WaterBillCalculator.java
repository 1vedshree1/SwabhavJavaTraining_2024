package com.aurionpro.conditionalstatements;

import java.util.Scanner;

public class WaterBillCalculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int meterCharge = 75;
		int charge = 0;
		int totalWaterBill;
		System.out.println("Enter number of unit consumed: ");
		int numberOfUnits = sc.nextInt();
		
		if(numberOfUnits>100) {
			
			if(numberOfUnits<=250) {
				
				charge = numberOfUnits*10;
			}
			else {
				
				charge = numberOfUnits*20;
			}
		}
		
		else if(numberOfUnits<=100) {
			
			charge = numberOfUnits*5;
}
		totalWaterBill = charge +meterCharge;
		
		System.out.println("Your Water Bill is: "+ totalWaterBill);
		
		
	}

}
