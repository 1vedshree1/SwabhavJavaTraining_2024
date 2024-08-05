package com.techlabs.model;

public class Student {
	private int rollno;
	private String name;
	private int age;
	private double percentage;
	public double getPercentage() {
		return percentage;
	}
	
	public Student(int rollno, String name, int age, double percentage) {
		
		this.rollno =rollno;
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void Grade(double percentage) {
		if(percentage>75) {
			System.out.println("Grade: A");
		}
		else if(percentage>=60 && percentage<75) {
			System.out.println("Grade:B");
		}
		else if(percentage>=50 && percentage<60) {
			System.out.println("Grade:C");
		}
		else if(percentage>=40 && percentage<50) {
			System.out.println("Grade:D");
		}
		else {
			System.out.println("Fail");
		}
		
	}

}
