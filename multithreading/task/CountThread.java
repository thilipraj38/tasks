package com.multithreading.task;

public class CountThread {

	public static void main(String[] args) throws InterruptedException {
		Cake count = new Cake();
		Thread teamOne = new Thread(new Team(count));
		teamOne.setName("Team one Thread");
		teamOne.start();
		System.out.println(teamOne.getName());
		//teamOne.join(); 
		Thread teamTwo = new Thread(new Team(count));
		teamTwo.start();
		teamTwo.setName("Team Two Thread");
		System.out.println(teamTwo.getName());
		//teamTwo.join();
		Thread teamThree = new Thread(new Team(count));
		teamThree.start();
		teamThree.setName("Team Three Thread");
		System.out.println(teamThree.getName());
		teamThree.setPriority(Thread.MAX_PRIORITY);
	}

}
