package com.anonymousobject;

public class OuterClass {
	void output() {
		System.out.println("Inside Outer Class");
	}
	class InnerClass{
		void display() {
			System.out.println("Inside Inner Class");
		}
		class InnerClass2{
			void show() {
				System.out.println("Inside Inner Class2");
			}
		}
		
	}
	public static void main(String[]args) {
		new OuterClass().output();
		new OuterClass().new InnerClass().display();
		new OuterClass().new InnerClass().new InnerClass2().show();
	}
}
