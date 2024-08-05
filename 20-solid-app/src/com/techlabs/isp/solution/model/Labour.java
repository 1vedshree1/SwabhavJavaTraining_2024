package com.techlabs.isp.solution.model;

public class Labour implements IWorkable,ILunchInterval {

	@Override
	public void eat() {
		System.out.println("Labour is eating");
		
		
	}

	@Override
	public void drink() {
		System.out.println("Labour is drinking");
		
	}

	@Override
	public void start() {
		System.out.println("Labour starts work.");
		
	}

	@Override
	public void stop() {
		System.out.println("Labour stops work");// TODO Auto-generated method stub
		
	}

}
