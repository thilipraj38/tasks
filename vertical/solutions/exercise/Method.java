package com.vertical.solutions.exercise;

public class Method {
	//Method creation
    //access specifier+return type+method name
	public  void action() {
		System.out.println("action");
	}
	public int action1() {
		return 1;
	}
	public void action2(int no) {
		System.out.println("action2"+" "+no);
	}
	public static void main(String[]args) {
		//object creation
		Method m = new Method();
		m.action();
		System.out.println(m.action1());
		m.action2(12);
	}
}
