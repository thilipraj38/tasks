7package com.inheritance;

public class Employee extends Customer{
	int empId =1;
	String name = "Thilip";
	private long salary = 70000l;
	public void getEmployeeDetails() {
		System.out.println("*******Employee Details*********");
		System.out.println(empId);
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String[]args) {
		Employee e = new Employee();
		e.getBankDetails();
		e.getEmployeeDetails();
		e.getCustomerDetails();
	}
}
