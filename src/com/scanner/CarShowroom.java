package com.scanner;

import java.util.Scanner;

public class CarShowroom {

	public static void main(String[] args) {

		Scanner b = new Scanner(System.in);
		System.out.println("showroom name");
		String name = b.nextLine();
		System.out.println("showroom name is"+" "+name);

		System.out.println("car price is");
		int price = b.nextInt();
		System.out.println(price);


		System.out.println("car height ");
		float height = b.nextFloat();
		System.out.println("car price is "+height);

		System.out.println("car name ");
		String cname = b.next();
		System.out.println("car name is"+" "+cname);
		b.close();


	}

}
