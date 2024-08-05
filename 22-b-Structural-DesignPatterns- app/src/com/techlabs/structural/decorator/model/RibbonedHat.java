package com.techlabs.structural.decorator.model;

public class RibbonedHat extends HatDecorator{

	public RibbonedHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Ribboned Hat";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return hat.getPrice()+50;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return hat.getName()+" with beautiful ribbon.";
	}

}
