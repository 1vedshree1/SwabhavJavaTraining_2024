package com.techlabs.creational.prototype.test;


import java.util.Scanner;

import com.techlabs.creational.prototype.model.EmployeeRecord;

public class PrototypeTest {
	
	 public static void main(String[] args)  {  
         
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Employee Id: ");  
	        int eid=scanner.nextInt();
	        scanner.nextLine();
	        System.out.print("\n");  
	          
	        System.out.print("Enter Employee Name: ");  
	        String ename=scanner.nextLine();  
	        System.out.print("\n");  
	          
	        System.out.print("Enter Employee Designation: ");  
	        String edesignation=scanner.nextLine(); 
	        System.out.print("\n");  
	          
	        System.out.print("Enter Employee Address: ");  
	        String eaddress=scanner.nextLine(); 
	        System.out.print("\n");  
	          
	        System.out.print("Enter Employee Salary: ");  
	        double esalary= scanner.nextDouble(); 
	        scanner.nextLine();
	        System.out.print("\n");  
	           
	        EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);  
	          
	        e1.showRecord();  
	        System.out.println("\n");  
	        EmployeeRecord e2=(EmployeeRecord) e1.getClone();  
	        e2.showRecord();  
	    }     

}
