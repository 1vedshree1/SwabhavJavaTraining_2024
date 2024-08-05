package com.techlabs.creational.factory.model;

public class AccountFactory {
	
	public static IAccount createAccount(String accountType) {
		IAccount account = null;
				if(accountType == "SavingAccount")
					return account = new SavingAccount(1, "Vedshree", 15000,500);
				   
				    
		        if(accountType == "SavingAccount")
			        return account = new CurrentAccount(1, "Vedshree", 15000,500);
		            
		return null;
		
		
		
	}
	
	

}
