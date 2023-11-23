package com.collections.list;

import java.util.TreeSet;

public class ProblemEight {
	 public static void main(String[] args) {
	        // Create a TreeSet of Strings
	        TreeSet<String> treeSet = new TreeSet<>();

	        // Add some words to the TreeSet
	        treeSet.add("Apple");
	        treeSet.add("Banana");
	        treeSet.add("Cherry");
	        treeSet.add("Date");

	        // Get the first and last elements
	        String firstElement = treeSet.first();
	        String lastElement = treeSet.last();

	        // Append both elements to create a meaningful word (variable)
	        String meaningfulWord = firstElement + lastElement;

	        // Print the result
	        System.out.println("First Element: " + firstElement);
	        System.out.println("Last Element: " + lastElement);
	        System.out.println("Meaningful Word: " + meaningfulWord);
	    }
}
