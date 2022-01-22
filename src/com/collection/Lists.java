package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Lists {
	
	public static void main(String[] args) {
		
		List<Object> n = new ArrayList<Object>();
		
//		n.add(10);
//		n.add(20);
//		n.add(30);
//		n.add(40);
//		n.add(50);
//		
//		System.out.println(n);
//		
//		n.add(2, 80);
//		System.out.println(n);
//		
//		boolean contains = n.contains(20);
//		System.out.println(contains);
//		
//		Integer integer = n.get(4);
//		System.out.println(integer);
//		
		n.add(10);
		n.add("java");
		n.add('a');
		n.add(true);
		n.add(50.25);
		n.add(10);
		
		
		Object object = n.get(4);
		System.out.println(object); // this is the difference for above integer object
		
		n.remove(3);
		System.out.println(n); 
		
		int size = n.size();
		System.out.println(size);
		
		n.clear();
		System.out.println(n);
		
		
		
		
		
	}

}
