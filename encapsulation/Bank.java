package com.encapsulation;

public class Bank {
     //Encapsulation
	public String username;
	private int mpin;
	private String name;
	private String email;
	public long accno;
	//UserNam
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getMpin() {
		return mpin;
	}
	public void setMpin(int mpin) {
		this.mpin = mpin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	
	public static void main(String[]args) {
		Bank b = new Bank();
		b.setName("Thilip Balaji");
		System.out.println("Your Name: "+b.getName());
		b.setAccno(23456543111l);
		System.out.println("Your Account no: "+b.getAccno());
		b.setUsername("Thilip122@1");
		System.out.println("Your Username: "+b.getUsername());
		b.setEmail("email@2123");
		System.out.println("Your email: "+b.getEmail());
		b.setMpin(2234);
		System.out.println("Your pin: "+b.getMpin());
	}
}
