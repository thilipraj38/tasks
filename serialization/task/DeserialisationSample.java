package com.serialization.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.serialization.SerializationExample;

public class DeserialisationSample {

	public static void main(String[] args) throws ClassNotFoundException {
		SerializationVariables sv = new SerializationVariables();
		try {
			File file = new File ("C:\\Users\\Sankar sp\\Documents\\Serialisedfile.txt");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			sv = (SerializationVariables) ois.readObject();
			System.out.println("name = "+sv.bookName);
			System.out.println("Address = "+sv.author);
			System.out.println("Genre = "+sv.genre);
		}
		catch(IOException e) {
			
		}
//		SerializationVariables objectToSerialize = new SerializationVariables();
//
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializedData.dat"))) {
//            // Serialize the object to a file
//            oos.writeObject(objectToSerialize);
//            System.out.println("Object serialized successfully.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
	}

}
