package com.testfivesolutions;
import java.io.*;
public class FileReadAndWrite {

	public static void main(String[] args) throws IOException{
		String content = "Hiii This is String in File Opertaions";
		File file = new File("C:\\Users\\Sankar sp\\Documents\\Task\\FileOperatioons.txt");
		FileOutputStream fos = new FileOutputStream(file);
		byte[] container = content.getBytes();
		fos.write(container);
		fos.close();
		FileInputStream fis = new FileInputStream(file);
		int i ;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		fis.close();
	}

}
