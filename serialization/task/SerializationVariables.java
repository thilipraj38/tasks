package com.serialization.task;

import java.io.Serializable;

public class SerializationVariables implements Serializable {
	public String bookName;
	public String author;
	public transient String genre;
}
