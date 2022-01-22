 package com.string;

public class ReturnType {
	

	public static void main(String[] args) {	
	
    String a =  "Welcome To Java";
	
	int length = a.length();
	System.out.println(length);
	
	boolean equals = a.equals("welcome to java");
	System.out.println(equals);
	
	boolean equalsIgnoreCase = a.equalsIgnoreCase("welcome to java");
	System.out.println(equalsIgnoreCase );
	
	char charAt = a.charAt(6);
	System.out.println(charAt);
	
	int indexOf = a.indexOf('J');
	System.out.println(indexOf);
	
	
	boolean contains = a.contains("To");
	System.out.println(contains);
	
	String upperCase = a.toUpperCase();
	System.out.println(upperCase);
	
	String lowerCase = a.toLowerCase();
	System.out.println(lowerCase);
	
	boolean startsWith = a.startsWith("Wel");
	System.out.println(startsWith);
	
	boolean endsWith = a.endsWith("va");
	System.out.println(endsWith);
	
	String replace = a.replace('e','z');
	System.out.println(replace);
	
	String replace2 = a.replace("To", "hi");
	System.out.println(replace2);
	
	String substring = a.substring(5);
	System.out.println(substring);
	
    String substring2 = a.substring(5,9);	
    System.out.println(substring2);
	
    String d = "Greens";
    String d1 = " ";
    String d2 = "";
    String d3 = null;
    
    boolean empty2 = d.isEmpty();
    System.out.println(empty2);
    
    boolean empty3 = d1.isEmpty();
    System.out.println(empty3);
    
    boolean empty4 = d2.isEmpty();
    System.out.println(empty4);
    
  // boolean empty5 = d3.isEmpty();
   //System.out.println(empty5);
    
    String v = " i love you";
    
    String[] x = v.split(" ");
    for (int i = 0; i < x.length; i++) {
    	System.out.println(x[i]);
		
	
	}
    
    
    
    
    
    
    
    
	

	
	
	
	
	}

}
