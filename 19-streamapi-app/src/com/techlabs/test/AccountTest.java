package com.techlabs.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.techlabs.model.Account;


public class AccountTest {

  public static void main(String[] args) {
  
     Account account1 = new Account(101,"Vedshree",23500);
     Account account2  = new Account(102,"Rishika",3400);
     Account account3 = new Account(103,"Shruti",1200);
     Account account4 = new Account(103,"Vedshree",1800);
     
     List<Account> accounts = Arrays.asList(account1,account2,account3,account4);
     
      Optional<Account> minBalanceAccount = accounts.stream()
          .min((num1,num2) ->(int) (num1.getBalance() - num2.getBalance()));
        if(minBalanceAccount.isPresent())
        System.out.println(minBalanceAccount.get());
        
        Optional<Account> maxBalanceAccount = accounts.stream()
           .max((acc1,acc2) ->(int) (acc1.getBalance() - acc2.getBalance()));
         if(minBalanceAccount.isPresent())
         System.out.println(maxBalanceAccount.get());
        
        List<Account> namesGreaterThenSixCharacters  =  accounts.stream()
                              .filter((account) -> account.getName().length()>6)
                              .collect(Collectors.toList());
        System.out.println(namesGreaterThenSixCharacters);
        
      double totalBalance =  accounts.stream()
                 .map((account)->account.getBalance())
                 .reduce(0.0,(balance1,balance2) ->( balance1+balance2));
      
     System.out.println(totalBalance);
           
           
           
        
 }
}