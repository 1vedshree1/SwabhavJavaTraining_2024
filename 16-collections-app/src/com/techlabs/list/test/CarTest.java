package com.techlabs.list.test;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import com.techlabs.list.model.Car;

public class CarTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Car> cars = new ArrayList<Car>();
		
		readCar(scanner,cars);
		printCars(cars);
		maxMileageCar(cars);
	}

	private static void maxMileageCar(List<Car> cars) {
		 Car maxMileageCar = cars.get(0);  
		    double maxMileage = maxMileageCar.getMileage(); 
		for (Car car : cars) {
	        if (car.getMileage() > maxMileage) {
	            maxMileage = car.getMileage();
	            maxMileageCar = car;
	        }
	    }
	    
	    System.out.println("Car with maximum mileage:");
	    System.out.println(maxMileageCar);
		
	}

	private static void printCars(List<Car> cars) {
		for(Car car:cars) {
			System.out.println(car);
		}
		
	}

	private static void readCar(Scanner scanner, List<Car> cars) {
		System.out.println("Enter number of Cars:");
		int numberofCars = scanner.nextInt();
		for(int i=0;i<numberofCars;i++) {
		System.out.println("Enter Id of Car:");
		int carId = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Company name:");
		String name = scanner.nextLine();
		System.out.println("Entr price:");
		double price = scanner.nextDouble();
		System.out.println("Enter mileage:");
		double mileage = scanner.nextDouble();
		
		cars.add(new Car(carId,name,price,mileage));
		
		}
		
	}

}
