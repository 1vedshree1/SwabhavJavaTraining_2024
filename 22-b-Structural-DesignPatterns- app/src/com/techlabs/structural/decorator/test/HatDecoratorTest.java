package com.techlabs.structural.decorator.test;

import java.util.Scanner;
import com.techlabs.structural.decorator.model.*;
public class HatDecoratorTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		IHat selectedHat = choiceHat(scanner);
		
		System.out.println("Do you want following Decorator on it?");
		System.out.println("1.Golden Hat\n2.Ribboned Hat\n3.No");
		int decoratorChoice = scanner.nextInt();
		switch (decoratorChoice) {
		case 1:
			GoldenHat goldhat = new GoldenHat(selectedHat );
			System.out.println("Name: "+selectedHat .getName()+
							   "\nTotal Price: "+goldhat.getPrice()+
							   "\nDescription: "+goldhat.getDescription());
			break;
		case 2:
			RibbonedHat ribbonhat = new RibbonedHat(selectedHat );
			System.out.println("Name: "+selectedHat .getName()+
					   "\nTotal Price: "+ribbonhat.getPrice()+
					   "\nDescription: "+ribbonhat.getDescription());
			break;
		case 3:
			System.out.println("Name: "+selectedHat .getName()+
					   "\nTotal Price: "+selectedHat .getPrice()+
					   "\nDescription: "+selectedHat .getDescription());
			System.exit(0);
			break;
		default:System.out.println("enter valid choice");

		}
		
	}

	private static IHat choiceHat(Scanner scanner) {
		System.out.println("Which Hat do you want?");
		System.out.println("1.Standard Hat\n2.Premium Hat\n3.exit");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1: IHat hat = new StandardHat();
		        return hat;
		case 2: IHat hat1 = new PremiumHat(); 
				return hat1;
		case 3: System.exit(0);break;
		default:System.out.println("invalid option");
		}
		return null;
		
	}
	
	
	
}
