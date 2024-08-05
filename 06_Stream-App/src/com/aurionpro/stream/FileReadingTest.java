package com.aurionpro.stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadingTest {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileinputstream = new FileInputStream("D:\\Aurionpro\\06_Stream-App\\src\\com\\aurionpro\\stream\\myfile");
		int ch;
		while((ch = fileinputstream.read())!=-1) {
			
			System.out.print((char)ch);
		}
		
		fileinputstream.close();
	}

}
