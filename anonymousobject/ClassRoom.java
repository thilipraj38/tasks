package com.anonymousobject;

public class ClassRoom {
	public boolean chalkAvailable(int piece) {
		if(piece>0) {
			System.out.println("True");
			return true;
		}
		else {
			System.out.println("False");
		return false;
		}
	}
		public static void main(String[]args) {
			new ClassRoom().chalkAvailable(1);
			new ClassRoom().chalkAvailable(1);
			ClassRoom c = new ClassRoom();
			c.chalkAvailable(1);
		}
}
