package com.techlabs.structural.decorator.model;

public abstract class CarServiceDecorator implements ICarService{
	public CarServiceDecorator(ICarService car) {
		super();
		this.car = car;
	}

	protected ICarService car;
	

}
