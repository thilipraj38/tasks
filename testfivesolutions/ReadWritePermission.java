package com.testfivesolutions;
import java.io.*;
public class ReadWritePermission {
	public static void main(String[]args) {
		File f = new File("C:\\Users\\Sankar sp\\eclipse-workspace\\sampleee\\src"
				+ "\\main\\java\\com\\testfivesolutions\\CloneMap.java");
		boolean cr = f.canRead();
		System.out.println(cr);
		boolean cw = f.canWrite();
		System.out.println(cw);
	}
}
