package com.techlabs.dip.solution.model;

public class Filelogger implements ILogger {

	@Override
	public void log(String error) {
		// TODO Auto-generated method stub
		System.out.println("Error in file blogger: "+error);
	}

}
