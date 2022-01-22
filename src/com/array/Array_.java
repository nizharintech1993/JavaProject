package com.array;


public class Array_ {

	public static void main(String[] args) {
	int [] a= new int[5];

		a[0]=5;
		a[1]=10;
		a[2]=15;
		a[3]=20;
		a[4]=25;

		System.out.println(a[3]);

		int hi = a.length;
		System.out.println(hi); // to get the length of the array

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);                // for array one by one print


		}

	}


}


