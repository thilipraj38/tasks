package com.multithreading.task;

public class Cake{
	int cakeCount = 0;
	public synchronized void increment() {
		cakeCount++;
	}
}
