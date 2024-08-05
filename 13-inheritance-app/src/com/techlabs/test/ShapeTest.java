package com.techlabs.test;

import com.techlabs.model.Rectangle;
import com.techlabs.model.Circle;

public class ShapeTest {
	public static void main(String[] args) {
		Circle circle = new Circle(12);
		Rectangle rectangle = new Rectangle(15,30);
		
		circle.areaCalculator();
		rectangle.areaCalculator();
		
		
	}
	
	

}
