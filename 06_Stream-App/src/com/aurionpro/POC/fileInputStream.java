package com.aurionpro.POC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileInputStream {
	
	public static void main(String[] args) throws IOException {
		
	    
		FileInputStream fileinputstream = new FileInputStream("D:\\Aurionpro\\06_Stream-App\\src\\com\\aurionpro\\stream\\myfile");
	
		int ch;
		 fileinputstream.skip(3);
         System.out.println("Input stream after skipping 3 bytes:");
		System.out.println("Available bytes at the begining: " + fileinputstream.available());
		while((ch = fileinputstream.read())!=-1) {
			
			System.out.print((char)ch);
		}
//		fileinputstream.read();
	
		 System.out.println();
		 System.out.println(fileinputstream.getChannel());
		 System.out.println(fileinputstream.getFD());
		 System.out.println("Available bytes at the end: " + fileinputstream.available());
		fileinputstream.getChannel();
		fileinputstream.close();
	}    
	             
	}
	

