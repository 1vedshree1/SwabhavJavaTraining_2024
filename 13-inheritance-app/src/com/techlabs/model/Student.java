package com.techlabs.model;

public class Student extends Person {
	
	private int rollnumber;
	private double percentage;
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", percentage=" + percentage + ", Name: " + getName()
				+ ", Age: " + getAge() + ", Address: " + getAddress() ;
	}
	

}
