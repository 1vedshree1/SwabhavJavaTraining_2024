package com.techlabs.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.techlabs.list.model.NameComparator;
import com.techlabs.list.model.PecentageComparator;
import com.techlabs.list.model.RollNumberComparator;
import com.techlabs.list.model.Student;
import com.techlabs.list.model.StudentComparator;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Student> students = new ArrayList<Student>();
		
		readStudent(scanner,students);
		
		System.out.println("using for loop");
		for(int i =0; i<students.size();i++) {
			
			System.out.println(students.get(i));
		}
		
		System.out.println("Sorted according to percentage");
		Collections.sort(students,new StudentComparator.PecentageComparator());
		System.out.println("using advance for loop");
		for(Student student:students) {
			System.out.println(student);
		}
		System.out.println("Sorted order");
		Collections.sort(students,new StudentComparator.RollNumberComparator());
		

		//it has only one option of next
		System.out.println("using itereator");
		Iterator<Student> studentIterator = students.iterator();
		
		while(studentIterator.hasNext()) {
			System.out.println(studentIterator.next());
		}
		//it can go 
		System.out.println("Sorted According to name");
		Collections.sort(students,new StudentComparator.NameComparator());
		System.out.println("using List iterator");
		ListIterator<Student> studentListIterator = students.listIterator();
		while(studentListIterator.hasNext()) {
			System.out.println(studentListIterator.next());
		}
		while(studentListIterator.hasPrevious()) {
			System.out.println(studentListIterator.previous());
		}
		
	}
	
	private static void readStudent(Scanner scanner, List<Student> students) {
		System.out.println("Enter number of students:");
		int number = scanner.nextInt();
		
		for(int i=0;i<number;i++) {
			System.out.println("Enter Roll Number:");
			int rollNumber = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Name:");
			String name = scanner.nextLine();
			System.out.println("Enter Percentage:");
			double percentage = scanner.nextDouble();
		students.add(new Student(rollNumber,name,percentage));
		}
		
	}

}
