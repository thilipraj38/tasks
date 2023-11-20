package com.constructor;

public class Finance {
	public String name;
	int no ;
	public Finance(String name) {
		this.name = name;
		System.out.println(name);
	}
	public Finance(int no) {
		this.no = no;
		System.out.println((no*13)%10);
	}
	public Finance(String name,int no) {
		System.out.println(name+" "+no);
	}
	
	public static void main (String[]args) {
		Finance f = new Finance("Hii");
		Finance fi = new Finance(12);
		Finance obj = new Finance("Thilip",3);
		System.out.println(fi.no);
	}
}
