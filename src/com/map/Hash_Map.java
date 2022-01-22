package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> h = new HashMap<Integer,String>();
		
		h.put(1, "mohammednizhar");
		h.put(2, "aravinth");
		h.put(3, "raja");
		
		System.out.println(h);
		
		Map<Integer, String> v = new HashMap<Integer,String>();
		
		v.putAll(h);
		System.out.println(v);
		
	      v.clear();
		  System.out.println(v);
		
		boolean containsKey = h.containsKey(2);
		System.out.println(containsKey);
		
		boolean containsValue = h.containsValue("raja");
		System.out.println(containsValue);
		
		Object clone = h.clone();
		System.out.println(clone);
		
		boolean empty = h.isEmpty();
		System.out.println(empty);
		
		Set<Integer> keySet = h.keySet();
		System.out.println(keySet);
		
		Collection<String> values = h.values();
		System.out.println(values);
		
		String string = h.get(2);
		System.out.println(string);
		
		Set<Entry<Integer, String>> entrySet = h.entrySet();
		System.out.println(entrySet);
		
		
	}

}
