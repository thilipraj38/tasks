package com.abstraction;

public abstract class Bank {
	//Abstract class-Parent class
	public void userName(String name) {
		System.out.println("Your username : "+name);
	}
	public abstract void password(String pass); 
}
