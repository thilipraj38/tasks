package com.testfivesolutions;
import java.util.*;
public class QueuePrint {
	public static void main(String[]args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(1);
		pq.add(2);
		pq.add(4);
		pq.add(8);
		pq.add(16);
		Iterator itr = pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
