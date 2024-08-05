package com.techlabs.model;

public class AreaCalculator {
	
	public double areaOfCircle(double radius) {
		return (3.14*radius*radius);
		
	}
	public double areaOfTriangle(double base, double height) {
		double area = (base*height)/2;
		return area;
		
	}
	public double areaOfRectangle(double length, double breadth) {
		return (length*breadth);
		
	}

}
