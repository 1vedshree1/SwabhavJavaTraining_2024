package com.techlabs.dip.solution.model;

public class Dblogger implements ILogger {

	@Override
	public void log(String error) {
		System.out.println("Error in dblogger: "+error);
		
	}

}
