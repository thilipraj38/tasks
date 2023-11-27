package com.multithreading;

public class ThreadResourcePoint {
	 public void resource() throws Exception {

		  for (int i = 1; i<=3; i++) {
		   System.out.println("Resource count ---> " + i);
		  }
		  }
}
