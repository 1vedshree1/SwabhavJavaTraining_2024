package com.techlabs.isp.violation.model;

public class Labour implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Labour starts working");
		
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour stop working");
	}

	@Override
	public void drink() {
		System.out.println("Labour is drinking");
		
	}

	@Override
	public void eat() {
		System.out.println("Labour is eating");
		
	}

}
