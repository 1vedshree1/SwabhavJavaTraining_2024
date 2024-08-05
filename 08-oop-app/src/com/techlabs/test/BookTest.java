package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Book;

public class BookTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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
		
		Book book1 = new Book(bookId1, name1, author1, price1, publication1);
		System.out.println("Book Id :"+ book1.getName());
		System.out.println("Book Name :"+ book1.getName());
		System.out.println("Book Author :"+ book1.getName());
		System.out.println("Book Price :"+ book1.getName());
		System.out.println("Book Publication :"+ book1.getName());
		
	}

}
