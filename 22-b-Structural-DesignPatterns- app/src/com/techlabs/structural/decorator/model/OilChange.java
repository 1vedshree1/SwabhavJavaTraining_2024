package com.techlabs.structural.decorator.model;

public class OilChange extends CarServiceDecorator{

	public OilChange(ICarService car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
	 
		return car.getCost()+500;
	}

}
