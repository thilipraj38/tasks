package com.collections.list;
import java.util.*;
public class LinkedListExamples {
	public static void main(String[]args) {
		LinkedList li = new LinkedList();
		li.add("Kane Williamson");
		li.add(22);
		li.add("New Zealand");
		li.add(23000l);
		li.add(2009);
		li.add(true);
		System.out.println(li);
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
		li.remove(5);
		//iterating using enhanced for loop
		for(Object obj:li) {
			System.out.println(li);
					}
		//index based add
		li.add(5, "Right handed batsman");
		//iterarting using for loop
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
					}
		//index of 
		System.out.println(li.indexOf(22));
		//lastindexof
		System.out.println(li.lastIndexOf(true));
		//contains
		System.out.println(li.contains("Kohli"));
		
		LinkedList ll = new LinkedList();
		//Add all 
		ll.addAll(li);
		ll.add("Wohoooo");
		//retain all
		ll.retainAll(li);
		System.out.println(ll);
		//remove all
		ll.removeAll(li);
		System.out.println(ll);
	}
}
