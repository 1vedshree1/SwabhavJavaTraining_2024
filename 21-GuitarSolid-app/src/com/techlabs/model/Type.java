package com.techlabs.model;

public enum Type {
	
	ACOUSTIC,ELECTRIC;
	
	public String toString() {
		
		switch(this) {
		case ACOUSTIC:return "Acoustic";
		case ELECTRIC:return "Electric";
		default:System.out.println("Enter valid choice");
		}
		return null;
	}

}
