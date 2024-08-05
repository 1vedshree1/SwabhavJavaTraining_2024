package com.techlabs.model;

import com.techlabs.exception.AgeNotValidException;

public class Voter {
	
	private int voterId;
	private String firstname;
	private String lastname;
	private int age;
	public Voter(int voterId, String firstname, String lastname, int age) {
		super();
		this.voterId = voterId;
		this.firstname = firstname;
		this.lastname = lastname;
		
			if(age<18)
				throw new AgeNotValidException();
			this.age = age;		
		
	}
	public int getVoterId() {
		return voterId;
	}
	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		try {
			if(age<18)
				throw new AgeNotValidException();
			this.age = age;		
		}
		catch(AgeNotValidException exception){
			System.out.println(exception.getMessage());
			
		}
		
	}
	@Override
	public String toString() {
		return "Voter: voterId=" + voterId + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age
				;
	}
	
	

}
