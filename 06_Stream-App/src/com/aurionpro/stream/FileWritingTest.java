package com.aurionpro.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingTest {
	
public static void main(String[] args) throws IOException {
		
		FileInputStream fileinputstream = new FileInputStream("D:\\Aurionpro\\06_Stream-App\\src\\com\\aurionpro\\stream\\myfile");
		int ch;
		FileOutputStream fileoutputstream = new FileOutputStream("D:\\Aurionpro\\06_Stream-App\\src\\com\\aurionpro\\stream\\myfile1");
		while((ch = fileinputstream.read())!=-1) {
			
			fileoutputstream.write(ch);
		}
		
		fileinputstream.close();
		System.out.println("File copied successfully");
	}


}
