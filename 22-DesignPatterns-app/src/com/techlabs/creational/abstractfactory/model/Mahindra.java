package com.techlabs.creational.abstractfactory.model;

import com.techlabs.creational.abstractfactory.model.ICar;

public class Mahindra implements ICar{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Mahindra car start.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Mahindra car stop.");
		
	}

}
