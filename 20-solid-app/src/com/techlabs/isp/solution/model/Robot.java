package com.techlabs.isp.solution.model;

public class Robot implements IWorkable{

	@Override
	public void start() {
		System.out.println("Robot starts work");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Robot stops work");
	}

}
