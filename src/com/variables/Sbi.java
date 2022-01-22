package com.variables;

public class Sbi  extends Iob{
	int  n = 999;
	long l;  // default value is executed
	String m = ("love");
	public  void employeeDetails(){
		String m = ("RAju");
		long a = 123456;  // local variable 
		String b =("mohammed nizhar"); // local variable it is used only for the inside a method 
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);
		System.out.println(m);
	}
	
	public static void main(String[] args) {
		// class name object name = new object name();
		
		Sbi v = new Sbi();
		
		v.employeeDetails();
		System.out.println(v.n); // class variable
		System.out.println(v.l);
		System.out.println(v.m); // class variable name and method or local variable name will be same
		                         // the priority goes to which one is first system out
		
		// below is extends one class to another class we using extends keyword we called directly because static
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c); 
		
	}

}
