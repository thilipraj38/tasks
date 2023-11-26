package com.testfivesolutions;
import java.util.*;
public class LinkedListAddRemove {
	public static void main(String[]args) {
		LinkedList li = new LinkedList();
		li.add("Naveen");
		li.add("Nijantha");
		li.add("Thilip");
		li.add("Ganesh");
		li.add("Samy");
		li.addFirst("Roomies:");
		li.addLast("!!!");
		System.out.println(li);
		li.removeFirst();
		li.removeLast();
		System.out.println(li);
	}
}
