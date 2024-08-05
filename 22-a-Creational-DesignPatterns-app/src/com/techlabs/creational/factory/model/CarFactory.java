package com.techlabs.creational.factory.model;

public class CarFactory {
	
	
	
	public static ICar makeCar(CarType car) {
		
		if(car==CarType.MARUTI)
		    return new Maruti();
		
		if(car==CarType.MAHINDRA)
		    return new Mahindra();
		
		if(car==CarType.TATA)
		    return new Tata();
		
		return null;
		
	}
	
	
	
	

}
