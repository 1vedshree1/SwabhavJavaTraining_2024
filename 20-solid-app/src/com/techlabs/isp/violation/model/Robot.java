package com.techlabs.isp.violation.model;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Robot starts working");
		
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot stop working");
	}

	@Override
	public void drink() {
		System.out.println("Robot is drinking");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Robot is eating");
	}

	
}
