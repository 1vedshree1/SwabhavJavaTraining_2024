package com.techlabs.model;

public enum Wood {
	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD,MABOGANY,MAPLE,COCOBOLO,CEDAR,ADIRONDACK,ALDER,SIDKA;
	
	public String toString() {
		switch(this){
		case INDIAN_ROSEWOOD: return "Indian Rosewood";
		case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood";
		case MABOGANY:return "Mabogany";
		case MAPLE: return "Maple";
		case COCOBOLO:return "Cocobolo";
		case CEDAR: return "Cedar";
		case ADIRONDACK: return "Adirondack";
		case ALDER: return "alder";
		case SIDKA:return "Sidka";
		default:System.out.println("enter valid choice");
		}
		return null;
		
		
	}

}
