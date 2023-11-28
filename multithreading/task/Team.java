package com.multithreading.task;

public class Team implements Runnable{

	Cake count;
	Team(Cake count){
		this.count = count;
	}
	
	public void run() {
		System.out.println("Cake is Preparing...."+Thread.currentThread().getName());
		for(int i=0;i<1000;i++) {
			count.increment();
		}
	}
	
}
