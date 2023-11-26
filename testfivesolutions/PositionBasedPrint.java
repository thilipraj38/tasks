package com.testfivesolutions;
import java.util.*;
public class PositionBasedPrint {
	public static void main(String[]args) {
		LinkedList li = new LinkedList();
		li.add("Naveen");
		li.add("Nijantha");
		li.add("Thilip");
		li.add("Ganesh");
		li.add("Samy");
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
	}
}
