package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Linked_Hash_Map {
	
	public static void main(String[] args) {
		
	
	
	LinkedHashMap<String, String> c = new LinkedHashMap<String,String>();
	
	
	c.put("father", "the name is : pakkirmohammed");
	c.put("mother", "name is : ayisha");            // linked hash map follow insertion order 
	c.put("brother", "name is shagul and perosh");
	System.out.println(c);
	
	HashMap<String ,String> b = new HashMap<String,String>();
	
	b.put("father", "the name is : pakkirmohammed");
	b.put("mother", "name is : ayisha");                // hash map do not follow insertion order it prints random order
	b.put("brother", "name is shagul and perosh");
	System.out.println(b);
	
	
	
	
	
	
	}

}
