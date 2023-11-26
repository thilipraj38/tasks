package com.testfivesolutions;
import java.io.*;
public class ListingFiles {
	public static void main(String[]args) {
		File file = new File ("C:\\Users\\Sankar sp\\eclipse-workspace\\sampleee\\src"
				+ "\\main\\java\\com\\testfivesolutions");
		String container[] = file.list();
		for(String c:container) {
			System.out.println(c);
		}
	}
}
