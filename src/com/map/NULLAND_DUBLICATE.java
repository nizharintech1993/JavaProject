package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class NULLAND_DUBLICATE {
	
	public static void main(String[] args) {
	 
		HashMap<String, String> nv = new HashMap<String, String>();
		
		nv.put("name"," nizhar");
		nv.put("peyar", "velu");
		nv.put("peyar", "ramu"); // dublicate key the value is over rided
		nv.put(null, "vinoth");
		nv.put(null, "manoj");   // null is also over rided
		System.out.println(nv);
		
		LinkedHashMap<String, String> v = new LinkedHashMap<String,String>();
		
		
		v.put("id", "23456");
		v.put("name", "vidhya");
		v.put("name", "velan");   // dublicate key the value is over rided
		v.put(null, "hai");   
		v.put(null, "ennadi");  // null over rided
		
		System.out.println(v);
		
		TreeMap<String, String> b = new TreeMap<String, String>();
		b.put("name", " aravinth");
		b.put("name", "ashock");
		b.put("work", "vivasayi");  // value is over rided 
    //b.put(null, "velu");
	//b.put(null,"ramu");  // null key is not possible in tree map
		System.out.println(b);
			
		
		
		
		
		
	}

}
