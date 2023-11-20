package com.vertical.solutions.exercise;

public class Child extends GrandParent{
	public int calculation(int a) {
		return a%8;
	}
	public static void main(String[]args) {
		Child obj = new Child();
		obj.greetings();
		int a = obj.calculation(0);
		System.out.println(obj.calculation(100));
	}
}
