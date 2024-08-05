package com.aurionpro.POC;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileinputstream = new FileInputStream("D:\\Aurionpro\\06_Stream-App\\src\\com\\aurionpro\\POC\\input");
		FileOutputStream fileoutputstream = new FileOutputStream("D:\\Aurionpro\\06_Stream-App\\src\\com\\aurionpro\\POC\\output");
		int ch;
		String data="This is flush method.";
		while((ch=fileinputstream.read())!=-1) {
			
			fileoutputstream.write(ch);
		}
		fileoutputstream.write(data.getBytes());
//		fileoutputstream.flush();
		System.out.println(fileoutputstream.getChannel());
		System.out.println(fileoutputstream.getFD());
		fileinputstream.close();
		fileoutputstream.close();
		
		System.out.println("File copied successfully");
		
	}
}

