package com.keyword;

public  class Keywords {
	
	 int j = 50;
	
	static {
   System.out.println("mohammed nizhar"); // static  block automatically executed
	}
	static int i = 10;      //static variable no need to object
	
	public static void hai() {
	System.out.println("keyword");   // static method also no need to object
		
	   // final int i =12;  // final variable cannot be increased or decreased cannot change
		//i++;

	}
	public static void main(String[] args) {
		System.out.println(i);
		hai();
	    
	}

}
