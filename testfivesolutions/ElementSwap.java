package com.testfivesolutions;
import java.util.*;
public class ElementSwap {
	public static void main(String[]args) {
		ArrayList li = new ArrayList();
		li.add(1);
		li.add(5);
		li.add(7);
		li.add(9);
		System.out.println(li);
		//Using Predefined method
		Collections.swap(li, 2, 3);
		System.out.println(li);
		//Swapping using temporary variable
		Object[] a = li.toArray();
		Object temp = a[2];
			a[2]=a[3];
			a[3] = temp;
		ArrayList liTwo = new ArrayList();
		for(Object m:a) {
			liTwo.add(m);
		}
		System.out.println(liTwo);
	}
}
