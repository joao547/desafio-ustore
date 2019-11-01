package com.example.restapiustore.models;

import java.io.IOException;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.restapiustore.processObject.ProcessObject;

@Entity
public class ObjectStorage implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private byte[] data;
	private int size;
	private String type;
	
	
	public ObjectStorage(Object object) throws IOException {
		ProcessObject processObject = new ProcessObject();
		byte[] byteObject = processObject.objectToByte(object);
		setId(15);
		setData(byteObject);
		setSize(byteObject.length);
		setType(object.toString());
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return "{data: " + data +
				", type: " + type +
				", id: " + id +
				", size: " + size + "}\n"
				;
	}
	

}
