package com.techlabs.structural.decorator.model;

public class StandardHat implements IHat{

	@Override
	public String getName() {
		return "Standard Hat";
		
		
	}

	@Override
	public double getPrice() {
		return 100;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDescription() {
		return "It is a simple Hat";
		// TODO Auto-generated method stub
		
	}

}
