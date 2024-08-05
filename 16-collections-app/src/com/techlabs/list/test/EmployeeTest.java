package com.techlabs.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.techlabs.list.model.Employee;
import com.techlabs.list.model.EmployeeComparator;
import com.techlabs.list.model.Student;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Employee> employees = new ArrayList<Employee>();
		readEmployee(scanner,employees);
		printEmployee(employees);
		Collections.sort(employees, new EmployeeComparator.IdComparator());
		printEmployee(employees);
		Collections.sort(employees,new EmployeeComparator.NameComparator());
		printEmployee(employees);
		Collections.sort(employees,new EmployeeComparator.SalaryComparator());
		printEmployee(employees);
			
		}
		

	

	private static void printEmployee(List<Employee> employees) {
		
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		
	}



	private static void readEmployee(Scanner scanner, List<Employee> employees) {
		System.out.println("Enter number of employees:");
		int numberOfEmployee = scanner.nextInt();
		for(int i=0;i<numberOfEmployee;i++) {
			System.out.println("Enter Id:");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Name:");
			String name = scanner.nextLine();
			System.out.println("Enter Salary:");
			double salary = scanner.nextDouble();
			employees.add(new Employee(id,name,salary));
		}
			
		
	}

}
