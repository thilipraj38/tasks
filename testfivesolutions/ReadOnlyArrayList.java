package com.testfivesolutions;
import java.util.*;
public class ReadOnlyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println(al);
		List read = Collections.unmodifiableList(al);
		read.add(6);
		System.out.println(al);
	}

}
