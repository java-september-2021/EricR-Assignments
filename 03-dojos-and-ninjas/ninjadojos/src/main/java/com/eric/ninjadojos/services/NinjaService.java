package com.eric.ninjadojos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eric.ninjadojos.models.Ninja;
import com.eric.ninjadojos.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository nRepo;
	
	
	//Find all ninjas
	public List<Ninja> allNinjas(){
		return this.nRepo.findAll();
	}
	
	//Find one ninja
	public Ninja findNinja(Long id) {
		return this.nRepo.findById(id).orElse(null);
	}
	
	//Create
	public Ninja createNinja(Ninja newNinja) {
		return this.nRepo.save(newNinja);
	}
	
	//Update
	public Ninja updateNinja(Ninja updatedNinja) {
		return this.nRepo.save(updatedNinja);
	}
	
	//Delete
	public void deleteNinja(Long id) {
		this.nRepo.deleteById(id);
	}

}
