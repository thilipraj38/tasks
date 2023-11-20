package com.abstraction;

public class Details extends Bank{
	//abstraction -child class
	@Override
	public void password(String pass) {
		// TODO Auto-generated method stub
		System.out.println("Your password : "+pass);
	}
	public static void main(String[]args) {
		Details d = new Details();
		d.userName("Thilip123");
		d.password("Thhh677");
	}

}
