package com.techlabs.model;

public class CreditCardPayment implements Payment {
	@Override
	public void payBill() {
		System.out.println("paying through Credit card");
		
	}

	@Override
	public void redeem() {
		System.out.println("Redeem through Credit card");
		// TODO Auto-generated method stub
		
	}
}
