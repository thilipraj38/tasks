package com.testfivesolutions;

public class StringNumerics {
	public static void main(String[]args) {
		String no = "1847254.412132141";
		double d = Double.parseDouble(no);
		int num = (int) d;
		System.out.println(num);
	}
}
