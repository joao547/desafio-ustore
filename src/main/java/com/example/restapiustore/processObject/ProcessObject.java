package com.example.restapiustore.processObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.springframework.util.SerializationUtils;

public class ProcessObject {

	public byte[] objectToByte(Object object) throws IOException{
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
	    objectOutputStream.writeObject(object);
	    objectOutputStream.flush();
	    objectOutputStream.close();
	    byteArrayOutputStream.close();
	    return byteArrayOutputStream.toByteArray();

	}
	public byte[] objectToByte2(Object object) throws IOException{
		byte[] data = SerializationUtils.serialize(object);
		return data;

	}
}
