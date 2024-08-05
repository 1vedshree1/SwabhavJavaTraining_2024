package com.swabhav.assignments.controlstructure;

import java.util.Scanner;

public class PrimePattern {

	public static void main(String[] args) 
	 
	   { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter range: ");
		int range = sc.nextInt();
	 
	       int primenumber = 2;          	        
	 
	       for(int i=0;i<range;i++)        
	 
	       { 
	    	   for(int j=0;j<=i;j++)   
	           { 
	 
	               while(!isPrime(primenumber))  
	 
	               { 
	 
	                   primenumber++; 
	 
	               } 
	 
	               System.out.print(primenumber+" ");    
	 
	               primenumber++;        
	 
	           } 
	 
	           System.out.println("");    
	 
	       } 
	   }
	    
	   static boolean isPrime(int n)       
	 
	   { 
	 
	       for(int i=2;i<=(int)Math.sqrt(n);i++)   
	 
	       { 
	 
	           if(n%i==0)      
	 
	               return false;      
	       } 
	 
	        
	 
	       return true;        
	 
	   }

}



