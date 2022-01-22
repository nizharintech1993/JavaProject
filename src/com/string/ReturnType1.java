package com.string;

public class ReturnType1 {
	public static void main(String[] args) {
		String x = "java is easier this is java i learn java";
		
		int length = x.length();
		System.out.println(length);
		
		boolean equals = x.equals("java Is easier this is java i learn java");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = x.equalsIgnoreCase("java Is easier this is java i learn java");
		System.out.println(equalsIgnoreCase);  // home work
		
		char charAt = x.charAt(2 );
		System.out.println(charAt);
		 
		int indexOf = x.indexOf('i');
		System.out.println(indexOf);
		
		int lastIndexOf = x.lastIndexOf('i');       // home work
		System.out.println(lastIndexOf);
		
		boolean contains = x.contains("learn");
		System.out.println(contains);
		
		String replace = x.replace('j', 'l');
		System.out.println(replace);
		
		String replace2 = x.replace("easier", "hard");
		System.out.println(replace2);                     // home work
		
		String upperCase = x.toUpperCase();
		System.out.println(upperCase);           // home work
		
		String lowerCase = x.toLowerCase();
		System.out.println(lowerCase);
		
	    boolean endsWith = x.endsWith("ava");
	    System.out.println(endsWith);
	    
	    boolean startsWith = x.startsWith("ja");
	    System.out.println(startsWith);           // home work
	    
		
	}

}
