package com.aurionpro.conditionalstatements;

import java.util.Scanner;

public class WaterBillCaluclator1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int meterCharge = 75;
		int charge = 0;
		int totalWaterBill;
		System.out.println("Enter number of unit consumed: ");
		int numberOfUnits = sc.nextInt();
		
		if(numberOfUnits>=100) {
			
			
			
			charge = 100*5;
			numberOfUnits = numberOfUnits-100;
					
		}
		
		
		if(numberOfUnits<=250) {
			
			charge = numberOfUnits*10;
			numberOfUnits = numberOfUnits-250;
}
		totalWaterBill = charge +meterCharge;
		
		System.out.println("Your Water Bill is: "+ totalWaterBill);
		
		
	}


}
