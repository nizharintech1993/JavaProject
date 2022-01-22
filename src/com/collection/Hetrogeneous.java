package com.collection;

import java.util.TreeSet;

public class Hetrogeneous {
	
	public static void main(String[] args) {
		
		TreeSet<Object> b = new TreeSet<Object>();
		
		b.add(10);
		b.add(23.5);
	    b.add('k');
		b.add("man");  // not support tree set and tree map hetrogenious value
		                // i through null pointer exception and class cast exception
		b.add(null);
		
		System.err.println(b);
		
	}

}
