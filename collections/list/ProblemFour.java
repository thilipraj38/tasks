package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class ProblemFour {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list =new ArrayList<String>();
		list.add("Pope");
		//list.add(1);
		list.add("Naveen");
		//list.add(2);
		list.add("Siva");
		//list.add(3);
		list.add("Thilip");
		//list.add(4);
		list.add("Ramasamy");
		//list.add(5);
		System.out.println("Before sorting "+list);
		Collections.sort(list);
		System.out.println("After sorting "+list);
		  // Create an ArrayList of Integers
        ArrayList<Integer> integerList = new ArrayList<>();

        // Add Integer objects to the list
        integerList.add(new Integer(10));
        integerList.add(new Integer(5));
        integerList.add(new Integer(8));
        integerList.add(new Integer(3));

        // Print the list before sorting
        System.out.println("Before sorting: " + integerList);

        // Sort the ArrayList using Collections.sort
        Collections.sort(integerList);

        // Print the list after sorting
        System.out.println("After sorting: " + integerList);
    
		System.out.println("Get random element"+list.get(3));
	}

}
