package com.testfivesolutions;
import java.util.*;
public class QueueRemove {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(1);
		pq.add(2);
		pq.add(4);
		pq.add(8);
		pq.add(16);
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
/*
 * If you want to safely check the element at the front without removing it and handle the case where the queue is empty, use peek.
If you want to retrieve and remove the element at the front and handle the case where the queue is empty by returning null, use poll.
If you want to retrieve and remove the element at the front but consider an empty queue as an exceptional case, use remove. However, be cautious about potential NoSuchElementException and handle it appropriately.
*/
	}
}
