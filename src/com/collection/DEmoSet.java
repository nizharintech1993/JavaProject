package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DEmoSet {
	
public static void main(String[] args) {
	Set<Object> s = new HashSet<Object>();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(100);
	s.add(40);
	s.add(40);     // it will not allow dublicate and its random order and it allows null
	s.add(null);
	System.out.println(s);
	
	
	Set<Object> u = new LinkedHashSet<>();
	
	u.add(10);
	u.add(20);
	u.add(30);
	u.add(100);
	u.add(100);
	u.add(null);   // it is insertion order it allowes null  it will not allow duplicate
	
	System.out.println(u);
	
	
	Set<Object> v = new  TreeSet<Object>();
	
	v.add(10);
	v.add(20);
	v.add(90);
	v.add(70);  // it will not allow null it is ascending order it will not allow duplicate
	v.add(70);
	//v.add(null);
	
	System.out.println(v);
	
	
	
	
	
}

}
