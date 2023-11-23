package com.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ProblemThree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		list.add("Naveen");
		list.add("Thilip");
		list.add("Pope");
		list.add("Siva");
		list.add("Siva");
		//	print the list elements 		
		System.out.println(list);
		//convert list to array...		
		Object friends[]=list.toArray();
		//print the array elements ....		
		for(Object names:friends) {
		System.out.println(names);
	}
		//create the array list...		
	ArrayList<String> roomie=new ArrayList<String>();
	//	store the array elements in list...
	for(Object names:friends) {
		roomie.add((String) names);
	}
    //print the list elements...
	System.out.println(roomie);
	int index=roomie.size()/2;
	//print the middle elements ....	
	System.out.println(roomie.get(index));
	}
}
