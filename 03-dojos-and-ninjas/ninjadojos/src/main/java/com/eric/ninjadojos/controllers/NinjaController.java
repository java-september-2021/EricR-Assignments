package com.eric.ninjadojos.controllers;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eric.ninjadojos.models.Dojo;
import com.eric.ninjadojos.models.Ninja;
import com.eric.ninjadojos.services.DojoService;
import com.eric.ninjadojos.services.NinjaService;

@Controller
public class NinjaController {
	//Dependency injection for dojo services
	@Autowired
	private DojoService dService;
	//Dependency injection for ninja services
	@Autowired
	private NinjaService nService;
	
	//Request mapping for main page render
	@GetMapping("/")
	public String dojo(Model viewModel) {
		viewModel.addAttribute("allDojos", this.dService.allDojos());
		viewModel.addAttribute("allninjas", this.nService.allNinjas());
		return "index.jsp";
	}
	
	//Request mapping for new ninja page render
	@GetMapping("/newn")
	public String newNinja() {
		return "ninja.jsp";
	}
	
	//Post mapping for new ninja information
	@PostMapping("/newNinja")
	public String addNew(@RequestParam("dojo") Dojo dojo,@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, @RequestParam("age") Integer age ) {
		Ninja ninjaToSave = new Ninja(lastName, firstName, age, dojo);
		this.nService.createNinja(ninjaToSave);
		return "redirect:/";
	}
	
	//Request mapping for new dojo page render
	@GetMapping("/newdo")
	public String newDojo(@Valid @ModelAttribute("dojo") Dojo dojo, Model viewModel) {
		List<Dojo> dojos = dService.allDojos();
		viewModel.addAttribute("dojos", dojos);
		return "dojo.jsp";
	}
	
	//Post mapping for new dojo information
	@PostMapping("/newdojo")
	public String addDojo(@RequestParam("dojo") Dojo dojo) {
		this.dService.createDojo(dojo);
		return "redirect:/";
		
	}
	
}
	
	
