package com.vertical.solutions.exercise;

public class Operators {

	public static void main(String[] args) {
		//Assignment operator "="
		int a = 48;
		
		//Arithmetic operator "+,-,*,/,%"
		int b = a-3;
		int c = b*2;
		int d = c/3;
		int e = d%10;
	     
		//printing the values
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		System.out.println("c ="+c);
		System.out.println("d ="+d);
		System.out.println("e ="+e);
		
		//logical operator (&&,)
		if(a==10 && b==21) {
			System.out.println("Condn satisfied");
		}
		else if(a==10) {
			
		}
		//conditional operator & Relational operator(==)
		String s = a==48 ? "Yes":"No";
		System.out.println(s);
		
		//shorthand operator
		 a+=10;
		 System.out.println("a ="+a);
		 
		 
		//increment / decrement(unary operator)
		 a++;
		 System.out.println("a ="+a);
		 ++a;
		 System.out.println("a ="+a);
		 b--;
		 System.out.println("b ="+b);
		 --b;
		 System.out.println("b ="+b);
	}
}
