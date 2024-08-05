package com.techlabs.structural.adapter.model;

public class Buiscuit implements IItems{

	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return "GoodDay";
	}

	@Override
	public double getPice() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public String toString() {
		return "Buiscuit [Name: " + getItemName() + ", Pice: " + getPice() + "]";
	}

}
