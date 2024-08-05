package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter Roll Number: ");
		int rollno = sc.nextInt();
		sc.nextLine();
//		student1.setRollno(rollno);
		System.out.println("Enter Name:");
		String name = sc.nextLine();
//		student1.setName(name);
		System.out.println("Enter age:");
		int age = sc.nextInt();
//		student1.setAge(age);
		System.out.println("Enter Percentage");
		double percentage = sc.nextDouble();
//		student1.setPercentage(percentage);
		
		Student student1 = new Student(rollno,name,age,percentage);
		
		System.out.println("Information of Student 1");
		System.out.println("Roll No:"+student1.getRollno());
		System.out.println("Name: "+student1.getName());
		System.out.println("Age:"+student1.getAge());
		System.out.println("Percentage:"+student1.getPercentage());
		student1.Grade(percentage);
		
		System.out.println("Enter Information of student 2");
		System.out.println("Enter Roll Number: ");
		int rollno1 = sc.nextInt();
		sc.nextLine();
//		student2.setRollno(rollno1);
		System.out.println("Enter Name:");
		String name1 = sc.nextLine();
//		student2.setName(name1);
		System.out.println("Enter age:");
		int age1 = sc.nextInt();
//		student2.setAge(age1);
		System.out.println("Enter Percentage");
		double percentage1 = sc.nextDouble();
//		student2.setPercentage(percentage1);
		Student student2 = new Student(rollno1, name1, age1, percentage1);
		System.out.println("Information of Student 2");
		System.out.println("Roll No:"+student1.getRollno());
		System.out.println("Name: "+student1.getName());
		System.out.println("Age:"+student1.getAge());
		System.out.println("Percentage:"+student1.getPercentage());
		student2.Grade(percentage);
	
		
	}

}
