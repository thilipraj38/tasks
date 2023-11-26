package com.testfivesolutions;
import java.util.*;
public class CloneMap {
	public static void main(String[]args) {
		Map<Integer,String> m = new  HashMap<Integer,String>();
		m.put(1, "Singam");
		m.put(2, "Puli");
		m.put(3, "Siruthai");
		m.put(4, "Yaanai");
		m.put(5, "Vengai");
		System.out.println(m);
		//Copying the exact value to Another map
		Map<Integer,String> hm = new HashMap<Integer,String>(m);
		System.out.println(hm);
		
	}
}
