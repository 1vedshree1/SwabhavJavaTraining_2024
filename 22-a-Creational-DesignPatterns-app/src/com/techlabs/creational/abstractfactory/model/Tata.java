package com.techlabs.creational.abstractfactory.model;

import com.techlabs.creational.abstractfactory.model.ICar;

public class Tata implements ICar{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Tata car starts.");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Tata car stop.");
	}

}
