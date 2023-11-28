package com.serialization;
import java.io.*;
public class Deserialization {
	public static void main(String[]args) throws ClassNotFoundException {
		SerializationExample se = new SerializationExample();
		try {
			File file = new File ("C:\\Users\\Sankar sp\\Documents\\file.txt");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			se = (SerializationExample) ois.readObject();
			System.out.println("name = "+se.name);
			System.out.println("Address = "+se.address);
			System.out.println("Number = "+se.number);
			System.out.println("Designation = "+se.designation);
			
		}
		catch(IOException e) {
			e.getMessage();
		}
	}
}
