package com.eric.ninjadojos.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eric.ninjadojos.models.Dojo;
import com.eric.ninjadojos.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private  DojoRepository dRepo;
	
	//Find all dojos
	public List<Dojo> allDojos(){
		return  this.dRepo.findAll();
	}
	//Find one dojo
	public Dojo findDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
	//Create
	public Dojo createDojo(Dojo newDojo) {
		return this.dRepo.save(newDojo);
	}
	
	//Update
	public Dojo updateDojo(Dojo updatedDojo) {
		return this.dRepo.save(updatedDojo);
	}
	
	//Delete
	public void deleteDojo(Long id) {
		this.dRepo.deleteById(id);
	}
	

}
