package com.techlabs.model;

public class PayPalPayment implements Payment {
	@Override
	public void payBill() {
		System.out.println("Paying bill through PayPal payment.");
		
	}

	@Override
	public void redeem() {
		System.out.println("redeem through Payapal Payment");
		// TODO Auto-generated method stub
		
	}


}
