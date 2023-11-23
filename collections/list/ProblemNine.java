package com.collections.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ProblemNine {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Create a list with duplicates
        List<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Apple");
        originalList.add("Cherry");
        originalList.add("Banana");

        // Remove duplicates using a Set
        HashSet<String> set = new HashSet<>(originalList);
        List<String> listWithoutDuplicates = new ArrayList<>(set);

        // Print the result
        System.out.println("Original List with Duplicates: " + originalList);
        System.out.println("List without Duplicates: " + listWithoutDuplicates);
   
	}
}
