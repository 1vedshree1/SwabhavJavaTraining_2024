package com.techlabs.test;

import com.techlabs.model.Box;

public class BoxTest { 
	public static void main(String[] args) {
		
		Box box1=new Box(10,20);
		
		box1.display();
		
		box1.display();
		System.out.println("Area of box is: "+ box1.calculatearea());
		Box box2 = new Box(30,40);
		box2.display();
//		box2.initialize(30,40,50);
		box2.display();
		System.out.println("Area of box is: "+ box2.calculatearea());
		

}
}
