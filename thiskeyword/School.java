package com.thiskeyword;

public class School {

	long noOfStudents;
	private String feeInformation;
	School(long value){
		this.noOfStudents=value;
		System.out.println(noOfStudents);
	}
	public String getFeeInformation() {
		return feeInformation;
	}
	public void setFeeInformation(String feeInformation) {
		this.feeInformation = feeInformation;
	}
	public static void main (String[]args) {
		School s = new School(100);
		s.setFeeInformation("10000");
		System.out.println(s.getFeeInformation());
	}
}
