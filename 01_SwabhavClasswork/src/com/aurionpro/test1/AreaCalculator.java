package com.aurionpro.test1;

public class AreaCalculator {
	
	public static void main(String[] args) {
		
		float radius = Float.parseFloat(args[0]);
		double area = 3.14*radius*radius;
		
		System.out.println("Area of circle is: "+ area);
		
	}

}
