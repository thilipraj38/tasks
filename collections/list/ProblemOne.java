package com.collections.list;

import java.util.LinkedList;

public class ProblemOne {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		list.add("Naveen");
		list.add("Thilip");
		list.add("Pope");
		list.add("Siva");
		list.add("Siva");
		System.out.println("Print the list elements:");
//		using for each loop..
		int position =0;
		for(String elements:list) {
			System.out.println("Element in LinkedList: "+elements+" is placed in that position:"+position);
			position++;
		}
		
	}

}
