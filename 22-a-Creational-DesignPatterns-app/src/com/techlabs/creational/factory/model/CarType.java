package com.techlabs.creational.factory.model;

public enum CarType {
	
	MARUTI,TATA,MAHINDRA;
	
	public String toSting() {
		switch(this){
		case MARUTI: return "Maruti";
		case TATA : return "Tata";
		case MAHINDRA: return "Mahindra";
		default:return "do valid choice";
	
		}
	}

}
