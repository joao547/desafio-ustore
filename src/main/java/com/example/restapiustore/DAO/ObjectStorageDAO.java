package com.example.restapiustore.DAO;

import java.io.IOException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.example.restapiustore.models.ObjectStorage;
import com.example.restapiustore.repository.ObjectStorageRepository;
import java.util.ArrayList;

public class ObjectStorageDAO {

	@Autowired
	private ObjectStorageRepository objectRep;
	private List<ObjectStorage> objectList = new ArrayList<ObjectStorage>();
        
	public List<ObjectStorage> showAll(){
		List<ObjectStorage> data = objectRep.findAll();
		return data;
	}
	
	public ObjectStorage showById(int id){
		ObjectStorage data = objectRep.findById(id);
		return data;
	}
	
	public List<ObjectStorage> showByType(String type){
		List<ObjectStorage> data = objectRep.findByType(type);
		return data;
	}
	
	public String create(Object object) throws IOException {
		ObjectStorage data = new ObjectStorage(object);
		System.out.println(data.getId());
		System.out.println(data.getData());
		System.out.println(data.getType());
		System.out.println(data.getSize());
		objectRep.saveTeste(data.getId(),data.getData(), data.getType(), data.getSize());
		return "Deu certo";
	}
	public ObjectStorage createTeste(Object object) throws IOException {
            ObjectStorage data = new ObjectStorage(object);
            objectList.add(data);
            return data;
	}
        
        public List<ObjectStorage> showAllTeste(){
		return objectList;
	}
}
