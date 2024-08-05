package com.techlabs.model;

public class Circle {
	
	public Circle(){
		
	}
	public int radius;
	public Circle(int radius){
		
		this.radius =radius;
	}
//	public void initialize(int h) {
//		 radius =h;	
//	}
	
	public void display() {
		System.out.println("Radius is:"+ radius);
	}
	
	public double areacalculator() {
		return 3.14*radius*radius;
		
	}

}
