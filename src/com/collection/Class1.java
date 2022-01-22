package com.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Class1 {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream
				("C:\\Users\\hp\\eclipse-workspace\\Java_Student_Traingcentre\\src\\com\\collection\\Hide1");
		Properties v = new Properties();
		v.load(file);
		String property = v.getProperty("1");
		System.out.println(property);
		Object setProperty = v.setProperty("1", "raja");
		System.out.println(setProperty);
		FileOutputStream c = new FileOutputStream
				("C:\\Users\\hp\\eclipse-workspace\\Java_Student_Traingcentre\\src\\com\\collection\\Hide1");
		
		v.store(c, property);
		System.out.println(property);
	}

}
