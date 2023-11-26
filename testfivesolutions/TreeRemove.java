package com.testfivesolutions;
import java.util.*;
public class TreeRemove {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(1);
		ts.add(5);
		ts.add(7);
		ts.add(9);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a index to remove the element");
		int index = s.nextInt();
		ts.remove(index);
		System.out.println(ts);
	}
}
