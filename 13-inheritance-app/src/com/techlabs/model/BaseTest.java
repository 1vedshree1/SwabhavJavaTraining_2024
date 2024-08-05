package com.techlabs.model;
import com.techlabs.model.BaseClass;

public class BaseTest {
	public static void main(String[] args) {
		BaseClass base = new BaseClass();
		base.display();
		Derived1 derived1 = new Derived1();
		base = derived1;
		base.display();
		
	} 

}
