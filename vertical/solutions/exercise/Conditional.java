package com.vertical.solutions.exercise;

public class Conditional {
	public static void main(String[]args) {
		//if else statement
		int a=10;
		if(a==10) {
			System.out.println("A equals 10");
		}
		else {
			System.out.println("A not equals 10");
		}
		//if else if
		int b=20;
		if(b==12) {
			System.out.println("B equals 20");
		}
		else if(b==13) {
			System.out.println("B equals 13");
		}
		//nested if
		int age = 18;
		String license = "yes";
		if(age<=18) {
			if(license.equals("yes")) {
				System.out.println("You are eligible to drive");
			}
			else {
				System.out.println("You are not eligible to drive");
			}
		}
		
		int number = 2;
		switch(number) {
		case 1: System.out.println("Monday");break;
		case 2: System.out.println("Tuesday");break;
		case 3: System.out.println("Wednesday");break;
		case 4: System.out.println("Thursday");break;
		case 5: System.out.println("Friday");break;
		case 6: System.out.println("Saturday");break;
		case 7: System.out.println("Sunday");break;
		default: System.out.println("Sunday");break;
		}
	}
}
