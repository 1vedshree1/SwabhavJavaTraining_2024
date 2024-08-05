package com.techlabs.structural.decorator.test;
import com.techlabs.structural.decorator.model.*;
public class CarDecoratorTest {
	public static void main(String[] args) {
		ICarService car = new CarInspection();
		OilChange oil = new OilChange(car);
		WheelAlign wheel = new WheelAlign(oil);
		System.out.println(wheel.getCost());
	}

}
