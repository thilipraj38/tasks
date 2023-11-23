package com.collections.list;

import java.util.PriorityQueue;

public class ProblemSeven {
	public static void main(String[] args) {
        // Create a Priority Queue of Integers
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add numeric values to the priority queue
        priorityQueue.add(8);
        priorityQueue.add(3);
        priorityQueue.add(5);
        priorityQueue.add(1);

        // Print the elements in the priority queue
        System.out.println("Priority Queue elements: " + priorityQueue);

        // Alternatively, you can poll elements one by one and print them
        System.out.println("Priority Queue elements (polling one by one):");
        for(Integer s:priorityQueue) {
        	System.out.println(s);
        }
    }
}
