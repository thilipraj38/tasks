package com.collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class ProblemTwo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList<String> list=new LinkedList<String>();
		list.add("Naveen");
		list.add("Thilip");
		list.add("Pope");
		list.add("Siva");
		list.add("Siva");
		
		System.out.println("Before removing from the list");
		System.out.println();
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println("After removing from the list");
		System.out.println();
		/*
		 * list.remove(0); list.remove(list.size()-1);(with the help of index)
		 */
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
	}

}
