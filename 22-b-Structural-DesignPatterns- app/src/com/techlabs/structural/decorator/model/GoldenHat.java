package com.techlabs.structural.decorator.model;

public class GoldenHat extends HatDecorator{

	public GoldenHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Golden Hat";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return hat.getPrice()+100;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return hat.getName()+" with golder colour";
	}

}
