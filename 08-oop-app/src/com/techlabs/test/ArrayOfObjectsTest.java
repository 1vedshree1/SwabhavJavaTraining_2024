package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.ArrayOfObjects;
import com.techlabs.model.Book;

public class ArrayOfObjectsTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book books[]=new Book[5];
		for(int i=0;i<books.length;i++) {
		System.out.println("Enter information of first book");
		System.out.println("Enter Book Id:");
		int bookId1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Book name:");
		String name1 = sc.nextLine();
		System.out.println("Enter Author of Book:");
		String author1 = sc.nextLine();
		System.out.println("Enter price of Book:");
		double price1 = sc.nextDouble();
		System.out.println("Enter Publication of Book:");
		String publication1 = sc.nextLine();
		
		books[i]= new Book(bookId1, name1, author1, price1, publication1);
		}
		
		for(int i=0;i<books.length;i++) {
		System.out.println("Book Id :"+ books[i].getName());
		System.out.println("Book Name :"+ books[i].getName());
		System.out.println("Book Author :"+ books[i].getName());
		System.out.println("Book Price :"+ books[i].getName());
		System.out.println("Book Publication :"+ books[i].getName());
		
	}


}
}
