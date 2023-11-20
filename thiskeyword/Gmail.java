package com.thiskeyword;

public class Gmail extends EmailService{
	public Gmail(String context) {
		super(context);
		System.out.println("Triggered");
		
	}
	public Gmail() {
		this("hii dude");
		System.out.println("Initialization done...");
	}
	public static void main(String[]args) {
		Gmail g = new Gmail();
		
	}
}