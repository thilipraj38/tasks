package com.collections.list;

import java.util.ArrayList;

public class ProblemFive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list =new ArrayList();
		list.add("Pope");
		list.add(1);
		list.add("Naveen");
		list.add(2);
		list.add("Siva");
		list.add(3);
		list.add("Thilip");
		System.out.println(list.subList(1,5));
	}
}
