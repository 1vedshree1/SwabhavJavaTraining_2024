package com.techlabs.structural.decorator.model;

public class WheelAlign extends CarServiceDecorator{

	public WheelAlign(ICarService car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
    
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return car.getCost()+400;
	}

}
