package com.serialization;
import java.io.*;
public class SerializedData {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		SerializationExample se = new SerializationExample();
		se.name = "Thilip";
		se.address="Aranthangi";
		se.number="7904951667";
		se.designation="Ass Software Developer";
		File file = new File("C:\\Users\\Sankar sp\\Documents\\file.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream obj = new ObjectOutputStream(fos); 
		obj.writeObject(se);
		obj.close();
		fos.close();
		System.out.println("Serialized Successfully....(^-^)");
	}

}
