package com.swabhav.assignments;

import java.util.Scanner;

public class CompoundInterestCalculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principal Amount:");
		int principal = sc.nextInt();

		System.out.println("Enter Rate of Interest:");
		float rateOfinterest = sc.nextFloat();
		
		System.out.println("Enter Compounding Periods per year");
		float compoundingPeriodsPerYear = sc.nextFloat();

		System.out.println("Enter number of years:");
		float years = sc.nextFloat();
		

		double interestRatePerPeriod = rateOfinterest / compoundingPeriodsPerYear;
        double totalCompoundingPeriods = compoundingPeriodsPerYear * years;
        
        double CompoundInterest = principal * Math.pow(1 + interestRatePerPeriod, totalCompoundingPeriods);
        
		System.out.println("Compound Interest is :" + CompoundInterest);
		}
}
