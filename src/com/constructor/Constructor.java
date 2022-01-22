package com.constructor;

public class Constructor {
	public Constructor() {
		System.out.println("my friend nethaji came to my house");
	}
	public Constructor(String f) {
		System.out.println("he met my "+":"+f);

	}
	public Constructor(int g) {
		System.out.println("my father gave him to"+":"+g);
	}
	
	public static void main(String[] args) {
		//class name object name = new class name();
		Constructor x = new Constructor();
		Constructor y = new Constructor("father");
		Constructor z = new Constructor(2000);
	}
}

