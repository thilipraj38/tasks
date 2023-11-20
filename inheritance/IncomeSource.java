package com.inheritance;

public class IncomeSource extends Bank{
	String loan = "Home Loan";
	int interest = 7;
	char turnOver = 'P';
	public void bankIncomeDetails() {
		System.out.println("***********Income details***********");
		System.out.println(loan);
		System.out.println(interest+"%");
		System.out.println(turnOver);
	}
	public static void main(String[]args) {
		IncomeSource i = new IncomeSource();
		i.getBankDetails();
		i.bankIncomeDetails();
	}
}
