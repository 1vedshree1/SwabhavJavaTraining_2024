package com.techlabs.creational.abstractfactory.test;
import com.techlabs.creational.abstractfactory.model.ICarFactory;
import com.techlabs.creational.abstractfactory.model.MarutiFactory;
import com.techlabs.creational.abstractfactory.model.ICar;

public class CarTest {
	
	public static void main(String[] args) {
		
		ICarFactory marutiFactory = new MarutiFactory();
		ICar maruti = marutiFactory.makeCar();
		maruti.start();
		maruti.stop();
		
	}

}
