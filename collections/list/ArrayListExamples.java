package com.collections.list;
import java.util.*;
public class ArrayListExamples {
	public static void main(String[]args) {
		ArrayList li = new ArrayList();
		li.add("Ravii");
		li.add(1);
		li.add(true);
		li.add(45000l);
		li.add(1.5f);
		li.add(true);
		li.add("");
		//size method
		System.out.println(li.size());
		//get method
		System.out.println(li.get(0));
		//normal list printing
		System.out.println(li);
		//set method
		li.set(3, 56000l);
		//iterating the list using iterator
		Iterator itr = li.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		//remove method
		li.remove(6);
		//iterating using enhanced for loop
		for(Object obj:li) {
			System.out.println(li);
		}
		
		//index based add
		li.add(6, "Developer intern");
		//iterarting using for loop
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		//index of 
		System.out.println(li.indexOf(true));
		//lastindexof
		System.out.println(li.lastIndexOf(true));
		//contains
		System.out.println(li.contains("Raja"));
		//clear
		li.clear();
		System.out.println(li);
	}
}
