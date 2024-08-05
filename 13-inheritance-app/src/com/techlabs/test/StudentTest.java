package com.techlabs.test;

import com.techlabs.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Vedshree");
		student.setAge(21);
		student.setAddress("Nerul");
		student.setRollnumber(7);
		student.setPercentage(91);
		
		System.out.println(student);
		
	}

}
