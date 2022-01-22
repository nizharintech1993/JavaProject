package com.scanner;

import java.util.Scanner;

public class BankDetails {
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);

		System.out.println("enten the name ");
		String name = o.next();

		System.out.println("enter the id");
		int num = o.nextInt();

		System.out.println("bank name");
		String com = o.next();

		System.out.println(" name is "+":"+name+"."+"enter the id"+":"+num+"."+"bank name is"+":"+com);
		o.close();
	}


}
