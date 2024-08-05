package com.techlabs.model;

public class Student {
	
	IStudentService studentService;
	
	
	public Student(IStudentService studentService) {
		super();
		this.studentService = studentService;
	}


	public double calculatePercentage() 
	{
		
		return studentService.getToatalMarks() / studentService.getTotalNumberOfSubject();	
		
	}

}
