package com.testfivesolutions;
import java.util.*;
public class RetainCommonElements {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add("two");
		hs.add(3);
		hs.add("four");
		hs.add(5);
		hs.add("Six");
		hs.add(7);
		hs.add("eight");
		hs.add(9);
		HashSet hsTwo = new HashSet();
		hsTwo.add(1);
		hsTwo.add("two");
		hsTwo.add(3);
		hsTwo.add("four");
		hsTwo.add(5);
		hs.retainAll(hsTwo);
		System.out.println(hs);
	}
}
