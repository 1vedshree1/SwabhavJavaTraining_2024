package com.techlabs.creational.factory.test;
import com.techlabs.creational.factory.model.CarFactory;
import com.techlabs.creational.factory.model.CarType;
import com.techlabs.creational.factory.model.ICar;
import com.techlabs.creational.factory.model.Mahindra;
import com.techlabs.creational.factory.model.Maruti;
import com.techlabs.creational.factory.model.Tata;
public class CarTest {
	public static void main(String[] args) {
		CarFactory factory = new CarFactory();
		ICar maruti = factory.makeCar(CarType.MARUTI);
		maruti.start();
		maruti.stop();
//		ICar car = new Mahindra();
//		car.start();
//		car.stop();
//		car= new Tata();
//		car.start();
//		car.stop();
//		car  = new Maruti();
//		car.start();
//		car.stop();
	}

}
