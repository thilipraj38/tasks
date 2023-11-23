package com.collections.list;

import java.util.TreeSet;

public class ProblemSix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   TreeSet treeSet = new TreeSet();

	        // Add elements to the TreeSet
	        treeSet.add(2);
	        treeSet.add(5);
	        treeSet.add(8);
	        treeSet.add(3);
	        treeSet.add(1);

	        System.out.println(treeSet.headSet(7));
	}

}
