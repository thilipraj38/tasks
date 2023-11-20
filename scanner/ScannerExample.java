package com.scanner;
import java.util.Scanner;
public class ScannerExample {
	int s;
	public void summa() {
		
	}
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name,age,sex");
		String name =input.nextLine();
		int age = input.nextInt();
		char sex = input.next().charAt(0);
        input.next();
        
		String feedback = input.nextLine();
		System.out.println("Batch member Details");
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Sex :"+sex);
		System.out.println("Feedback :"+feedback);
		input.close();
	}
}
