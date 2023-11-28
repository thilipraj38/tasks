package com.serialization;

import java.io.Serializable;

public class SerializationExample	implements Serializable {
	public String name;
	public String address;
	public String number;
	public  transient String designation;
}
