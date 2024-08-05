package com.aurionpro.conditionalstatements;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter temperature: ");
        double temperature = scanner.nextDouble();
        double result = 0;
        
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        
        int choice = scanner.nextInt();
        
        switch(choice) {
        
        case 1: 
        	result = (temperature*1.8)+32;
        	System.out.println(result+" Fahrenheit");
        	break;
        case 2:
        	result=(temperature-32)*(5/9);
        	System.out.println(result+" Celsius");
        	break;
        case 3:
        	result= temperature+273.15;
        	System.out.println(result+" Kelvin");
        	break;
        case 4:
        	result= temperature-273.15;
        	System.out.println(result+ " Celsius");
        	break;
        case 5:
        	result= (temperature-32)*(5/9)+273.15;
        	System.out.println(result+" Kelvin");
        	break;
        case 6:
        	result=(temperature-273.15)*(9/5)+32;
        	System.out.println(result+" Fahrenheit");
        }
	}

}
