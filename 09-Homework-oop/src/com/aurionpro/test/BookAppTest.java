package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BookApp;

public class BookAppTest {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of books:");
        int numberOfBooks = sc.nextInt();
        double temp;
        BookApp books[] = new BookApp[numberOfBooks];
        
        for(int i = 0; i < books.length; i++) {
            System.out.println("Enter information of book " + (i + 1));
            System.out.println("Enter Book Id:");
            int bookId = sc.nextInt();
            sc.nextLine(); 
            String name = sc.nextLine();
            System.out.println("Enter Author of Book:");
            String author = sc.nextLine();
            System.out.println("Enter price of Book:");
            double price = sc.nextDouble();
            sc.nextLine(); 
            System.out.println("Enter Publication of Book:");
            String publication = sc.nextLine();
            
            books[i] = new BookApp(bookId, name, author, price, publication);
        }
        
        
        for(int i = 0; i < books.length; i++) {
            for(int j = i + 1; j < books.length; j++) {
                if(books[j].getPrice() > books[i].getPrice()) {
                    BookApp tempBook = books[i];
                    books[i] = books[j];
                    books[j] = tempBook;
                }
            }
        }
        
       
        System.out.println("List Of Books (Sorted by Price in Descending Order):");
        for(int i = 0; i < books.length; i++) {
        	System.out.println("Book Id :"+ books[i].getBookId());
    		System.out.println("Book Name :"+ books[i].getName());
    		System.out.println("Book Author :"+ books[i].getAuthor());
    		System.out.println("Book Price :"+ books[i].getPrice());
    		System.out.println("Book Publication :"+ books[i].getPublication());
        }
        
    }
}
