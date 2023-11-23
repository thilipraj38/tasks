package com.collections.list;

import java.util.Collections;
import java.util.LinkedList;

public class ProblemTen {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        Collections.shuffle(linkedList);
        System.out.println(linkedList);

	}

}
