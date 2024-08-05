package com.techlabs.list.model;

import java.util.Comparator;

public class EmployeeComparator  {

	public static class IdComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee employee1,Employee employee2) {
			
			
			return employee1.getEmployeeId()-employee2.getEmployeeId();
		}

	}
	public static class SalaryComparator implements Comparator<Employee> {

		
		public int compare(Employee employee1,Employee employee2) {
			if(employee1.getSalary()>employee2.getSalary())
				return 1;
			if(employee1.getSalary()<employee2.getSalary())
				return -1;	
			return 0;
		}

		

	}
	public static class NameComparator implements Comparator<Employee> {

		@Override
		 public int compare(Employee employee1,Employee employee2)
		 {

			return employee1.getName().compareTo(employee2.getName());
		}

	}


}
