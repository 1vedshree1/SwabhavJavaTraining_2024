package com.techlabs.model;

public class BankTransferPayment extends Payment {

	@Override
	public void payBill() {
		System.out.println("paying bill through Bank Transfer Payment");
		
	}

	@Override
	public void redeem() {
		System.out.println("Redeem through Bank Transfer Payment");
		// TODO Auto-generated method stub
		
	}

}
