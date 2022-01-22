package com.keyword;

public class Keywords1 extends Keywords {
	int j = 60;
	public void test() {
		int j = 70;
		System.out.println("cclv"+j);
		System.out.println("cccv"+ this.j);
		System.out.println("pcv"+super.j);
		

	}
	
	
	
	public static void main(String[] args) {
		Keywords1 d = new Keywords1();
		d.test();
		
	}
	
}