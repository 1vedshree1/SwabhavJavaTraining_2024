package com.swabhav.assignments.controlstructure;

import java.util.Scanner;

public class ATMmachine {
	
private static double balance = 1000.00; 
    
    public static void main(String[] args) {
    	int balance = 1000, withdraw, deposit;  
        
         
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("ATM Menu");  
            System.out.println("1:Check Balance");  
            System.out.println("2:Deposit Money");  
            System.out.println("3:Withdraw Money");  
            System.out.println("4:EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
            int choice = sc.nextInt();  
            switch(choice)  
            { 
            
	            case 1:  
	                
	                System.out.println("Your Current Balance is $"+balance);  
	                System.out.println("");  
	                break;  
                
   
                case 2:  
                      
			        System.out.print("Enter money to be deposited:");    
			        deposit = sc.nextInt();  
			                        
			        balance = balance + deposit;  
			        System.out.println("You have deposited $"+deposit+". Your new balance is $"+balance);  
			        System.out.println("");  
			        break;  
        
                case 3:  
                    System.out.print("Enter money to be withdrawn:");  
                                    
                    withdraw = sc.nextInt();  
                                  
                    if(balance >= withdraw)  
                    {  
                       
                        balance = balance - withdraw;  
                        System.out.println("You have withdrawn $"+withdraw+". Your new balance is $"+balance);  
                    }  
                    else  
                    {  
                          
                        System.out.println("Insufficient Balance");  
                    }  
                    System.out.println("");  
                    break;               
   
                case 4:  
        
                     System.exit(0);  
            }  
        }  
    }

}
