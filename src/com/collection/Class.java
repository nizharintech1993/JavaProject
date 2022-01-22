package com.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Class {
	public static void main(String[] args) throws IOException {
		
		FileInputStream b = new FileInputStream // it is used to read the file
				("C:\\Users\\hp\\eclipse-workspace\\Java_Student_Traingcentre\\src\\com\\collection\\Hide");
		
		Properties v = new Properties();  // load the file using property class
		v.load(b);
		String property = v.getProperty("1"); // get property method for get the value baced on given key
		//System.out.println(property);
		
		Object setProperty = v.setProperty("1", "praveen");
		//System.out.println(setProperty);
		
		FileOutputStream n = new FileOutputStream
				("C:\\Users\\hp\\eclipse-workspace\\Java_Student_Traingcentre\\src\\com\\collection\\Hide");
		v.store(n, property);
	
		
		System.out.println(property);
		
	}

}

