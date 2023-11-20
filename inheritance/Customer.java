package com.inheritance;

public class Customer extends Bank{
	String name = "Naveen";
	long accNo = 155556254l;
	String accInfo = "Active-Fixed deposit";
	public void getCustomerDetails() {
		System.out.println("*******Customer Details*********");
		System.out.println(name);
		System.out.println(accNo);
		System.out.println(accInfo);
		
	}
}
