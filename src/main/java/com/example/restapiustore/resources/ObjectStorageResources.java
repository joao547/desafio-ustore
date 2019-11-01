package com.example.restapiustore.resources;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapiustore.DAO.ObjectStorageDAO;
import com.example.restapiustore.models.ObjectStorage;

@RestController
@RequestMapping("/objectStorage")
public class ObjectStorageResources {
	
	ObjectStorageDAO objectDAO = new ObjectStorageDAO();

	public File teste = new File("texto.txt");
	public String teste2 = "joao";
	public String teste3 = "victor";
	public String teste4 = "nascimento";
	public String teste5 = "bezerra";
        
	
	@GetMapping("/objects")
	public @ResponseBody List<ObjectStorage> listaData(){
		return objectDAO.showAll();
	}
	
	@GetMapping("/object/id/{id}")
	public @ResponseBody ObjectStorage listaDataById(@RequestBody int id){
		return objectDAO.showById(id);
	}
	
	@GetMapping("/object/type/{type}")
	public @ResponseBody List<ObjectStorage> listaDataByType(@RequestBody String type){
		return objectDAO.showByType(type);
	}
	@PostMapping("/objects")
	public String InserirObjectStorage(@RequestBody Object object) throws IOException {
		return objectDAO.create(teste);
	}
	
	@PostMapping("/teste")
	public ObjectStorage InserirObjectStorageTeste(@RequestBody Object object) throws IOException {
            objectDAO.createTeste(teste2);
            objectDAO.createTeste(teste3);
            objectDAO.createTeste(teste4);
            objectDAO.createTeste(teste5);
            return objectDAO.createTeste(teste);
	}
	
	@GetMapping("/teste")
	public @ResponseBody List<ObjectStorage> listaDataTeste() throws IOException{
		return objectDAO.showAllTeste();
	}
	
	
}
