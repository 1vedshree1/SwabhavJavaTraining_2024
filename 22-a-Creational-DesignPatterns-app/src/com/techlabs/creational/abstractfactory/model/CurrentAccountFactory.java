package com.techlabs.creational.abstractfactory.model;

public class CurrentAccountFactory implements IAccountFactory{

	@Override
	public IAccount getAccount() {
		// TODO Auto-generated method stub
		return new CurrentAccount(1, "Vedshree", 15000, 500);
	}

}
