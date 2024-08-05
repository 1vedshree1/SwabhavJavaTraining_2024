package com.techlabs.creational.abstractfactory.model;
import com.techlabs.creational.abstractfactory.model.Maruti;
public class MarutiFactory implements ICarFactory{

	@Override
	public ICar makeCar() {
		// TODO Auto-generated method stub
		return (ICar) new Maruti();
	}

}
