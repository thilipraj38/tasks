package com.encapsulation;

public class Encapsulated {
	//private variables
	private String name;
	private int age;
	private char initial;
	private float height;
	
	//getter method
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getInitial() {
		return initial;
	}
	public float getHeight() {
		return height;
	}
	
	//setter method
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setInitial(char initial) {
		this.initial=initial;
	}
	public void setHeight(float height) {
		this.height=height;
	}
	
	
	public static void main (String []args) {
		Encapsulated e = new Encapsulated();
		e.setName("Thilip");
		System.out.println(e.getName());
		
		e.setAge(23);
		System.out.println(e.getAge());
		
		e.setInitial('R');
		System.out.println(e.getInitial());
		
		e.setHeight(171.7f);
		System.out.println(e.getHeight());
	}
}
