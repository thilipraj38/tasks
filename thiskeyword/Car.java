package com.thiskeyword;

public class Car extends Automobile{
	int noOfSections;
	public String start(String key) {
		super.start(key);
		System.out.println("Engine started");
		System.out.println(super.noOfSections);
		return "Started..";
		
	}
	public static void main(String[]args) {
		Car access = new Car();
		access.start("Turn on");
	}
}
