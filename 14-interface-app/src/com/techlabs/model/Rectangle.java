package com.techlabs.model;

public class Rectangle implements Shape{

	private int length;
	private int breadth;
	
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	


	@Override
	public void area() {
		
		System.out.println("Area of Rectangel is:"+(length*breadth));
		
	}
}
