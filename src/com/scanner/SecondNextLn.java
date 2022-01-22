package com.scanner;

import java.util.Scanner;

public class SecondNextLn {
	public static void main(String[] args) {


		Scanner v = new Scanner(System.in);

		System.out.println("name");
		String name = v.next();
		System.out.println("name is"+name);

		System.out.println("salry");
		int salary = v.nextInt();
		System.out.println("salary is"+salary);
		
		v.nextLine();
		System.out.println("Enter your co name");
		String companyName=v.nextLine();
		System.out.println(companyName);
		
		System.out.println("Enter any num");
		int nextInt = v.nextInt();
		System.out.println(nextInt);

		v.nextLine();//dummy line read the above buffer line or enter pantra line
		System.out.println("enter anything");
		String nextLine = v.nextLine();
		System.out.println(nextLine);
		v.close();



	}
}