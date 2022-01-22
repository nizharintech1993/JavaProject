package com.collection;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Adding_Removing {
	
	public static void main(String[] args) {
		List<Object> c = new LinkedList<Object>();
		
		c.add(10);
		c.add(20);
		c.add(30);  // adding duplicate value in linked list using removing duplicate in linked hash set
		c.add(30);
		c.add(40);
		System.out.println(c);
		
		Set<Object> p = new LinkedHashSet<Object>(c);
		System.out.println(p);
		 
		
	}

}
