package com.techlabs.model;

public class Rectangle extends Shape {

	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void areaCalculator() {
		System.out.println("Area of Rectangle is :"+(length*breadth));
		
		
	}
	
	
		
	

}
