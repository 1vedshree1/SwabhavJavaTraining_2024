package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		
		System.out.println("Enter Information of Employee 1");
		System.out.println("Enter Employee ID: ");
		int empoyeeid1 = sc.nextInt();
		sc.nextLine();
		employee1.setEmployeeid(empoyeeid1);
		System.out.println("Enter Name:");
		String name1 = sc.nextLine();
		employee1.setName(name1);
		System.out.println("Enter Salary:");
		int salary1 = sc.nextInt();
		employee1.setSalary(salary1);
		
		System.out.println();
		System.out.println("Enter Information of Employee 2");
		System.out.println("Enter Employee ID: ");
		int empoyeeid2 = sc.nextInt();
		sc.nextLine();
		employee2.setEmployeeid(empoyeeid2);
		System.out.println("Enter Name:");
		String name2 = sc.nextLine();
		employee2.setName(name2);
		System.out.println("Enter Salary:");
		int salary2 = sc.nextInt();
		employee2.setSalary(salary2);
		
		
		System.out.println("Information of Employee 1");
		System.out.println("Employee ID:"+employee1.getEmployeeid());
		System.out.println("Name: "+employee1.getName());
		System.out.println("Salary:"+employee1.getSalary());
		
		System.out.println();
		System.out.println("Information of Employee 2");
		System.out.println("Employee ID:"+employee2.getEmployeeid());
		System.out.println("Name: "+employee2.getName());
		System.out.println("Salary:"+employee2.getSalary());
		
		
		
	}

}
