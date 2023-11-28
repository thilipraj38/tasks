package com.serialization.task;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationConcept {

	public static void main(String[] args) throws IOException {
		SerializationVariables sv = new SerializationVariables();
		sv.bookName = "Alchemist";
		sv.author = "Paul coelho";
		sv.genre = "Self help";
				
		File file = new File("C:\\Users\\Sankar sp\\Documents\\Serialisedfile.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream obj = new ObjectOutputStream(fos); 
		obj.writeObject(sv);
		obj.close();
		fos.close();
		System.out.println("Serialized Successfully....(^-^)");
	}

}
