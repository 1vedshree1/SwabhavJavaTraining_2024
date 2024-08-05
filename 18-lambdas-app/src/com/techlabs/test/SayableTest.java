package com.techlabs.test;

import com.techlabs.model.ISayable;


public class SayableTest {
	
	public static void main(String[] args) {
		//1.No need to create another class to define method.
		//2.No need to create object of interface.
		ISayable say = name -> System.out.println("Hello "+ name);
		say.say("world");
		

}
}
