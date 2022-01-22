package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combine_onelist_to_anotherlist {
	
	public static void main(String[] args) {
		
		
		List<Object> li = new LinkedList<Object>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		
		System.out.println(li);
		
		List<Integer> li1 = new ArrayList<Integer>();
		
		li1.add(20);
		li1.add(30);
		li1.add(50);
		System.err.println(li1);
		
	//	li.add(li1);
	//	System.out.println(li);
		
		li.addAll(li1);
		System.out.println(li);
		
		li.retainAll(li1);
		System.out.println(li);
		
		li.removeAll(li1);
		System.out.println(li);
		
		
		
	}
		
}
	