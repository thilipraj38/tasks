package com.multithreading;

public class ThreadSample extends Thread {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ThreadSample tref=new ThreadSample();
			tref.start();
		}

		public  void start() {
			// TODO Auto-generated method stub
			System.out.println("Thread Start");
			Thread actualT=new Thread(this,"");
			actualT.run();
		}
		public void run() {
			try {
				for(int i=0;i<3;i++) {
					System.out.println("looping"+i);
				}
				System.out.println("thread terminated");
			}
			catch(Exception e){
				e.printStackTrace();
			}
		
	}
}
