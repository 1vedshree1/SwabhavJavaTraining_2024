package com.techlabs.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.techlabs.list.model.Book;
import com.techlabs.list.model.BookComparator;

public class BookTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Book> books = new ArrayList<Book>();
		readBook(scanner, books);
		printBook(books);
		sortBook(scanner, books);

	}

	private static void sortBook(Scanner scanner, List<Book> books) {
		while (true) {
			System.out.println("Enter choice:");
			System.out.println("1. Sort by author -> title -> price");
			System.out.println("2. Sort by publication year -> price -> author");
			System.out.println("3. Exit");

			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Sorting by Author -> Title -> Price:");
				Collections.sort(books,
						new BookComparator.BookAuthorComparator()
								.thenComparing(new BookComparator.BookTitleComparator())
								.thenComparing(new BookComparator.BookPriceComparator()));
				printBook(books);
				break;
			case 2:
				System.out.println("Sorting by Publication Year -> Price -> Author:");
				Collections.sort(books,
						new BookComparator.BookPublicationYearComparator()
								.thenComparing(new BookComparator.BookPriceComparator())
								.thenComparing(new BookComparator.BookAuthorComparator()));
				printBook(books);
				break;
			case 3:
				System.out.println("Exiting program.");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
				break;
			}
		}

	}

	private static void printBook(List<Book> books) {
		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println();
	}

	private static void readBook(Scanner scanner, List<Book> books) {
		System.out.println("Enter number of books:");
		int numberOfBooks = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < numberOfBooks; i++) {
			System.out.println("Enter Book " + (i + 1));
			System.out.println("Enter Book Title:");
			String title = scanner.nextLine();
			System.out.println("Enter Book Author:");
			String author = scanner.nextLine();
			System.out.println("Enter Book Price:");
			double price = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Enter Book Publication Year:");
			int publicationYear = scanner.nextInt();
			scanner.nextLine();

			books.add(new Book(title, author, price, publicationYear));
		}
	}
}
