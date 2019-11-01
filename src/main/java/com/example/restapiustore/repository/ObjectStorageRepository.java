package com.example.restapiustore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.restapiustore.models.ObjectStorage;

public interface ObjectStorageRepository  extends JpaRepository<ObjectStorage, Integer>{
	ObjectStorage findById(int id);
	List<ObjectStorage> findByType(String type);
	@Query(value="INSERT INTO object_storage (id,data,type,size) VALUES(3,E'\\xDEADBEEF','teste3',12)",  nativeQuery = true)
	ObjectStorage saveTeste(@Param("id") Integer id, @Param("data") byte[] data, @Param("type") String type, @Param("size") int size);
}
