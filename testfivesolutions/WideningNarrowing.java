package com.testfivesolutions;

public class WideningNarrowing {
	public static void main(String[]args) {
		//implicit-Widening
		int no = 10;
		double num = no;
		System.out.println(no);
		System.out.println(num);
		//Explicit-Narrowing
		double d = 33.33;
		int dd = (int)d;
		System.out.println(d);
		System.out.println(dd);
	}
}
