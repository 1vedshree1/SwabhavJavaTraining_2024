package com.techlabs.creational.singleton.model;

public class Login {
	
	private Login(){
		System.out.println("Login");
	}
	
	private static Login login;
	
	public void status() {
		System.out.println("Logged in Successfully");
	}
	
	public static Login getLogin() {
		if(login == null)
		login = new Login();
		return login;
		
		
	}
	

}
