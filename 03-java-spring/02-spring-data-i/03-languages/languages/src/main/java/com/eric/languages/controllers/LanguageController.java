package com.eric.languages.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eric.languages.models.Language;
import com.eric.languages.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService lService;
	public LanguageController(LanguageService service) {
		this.lService = service;
	}
	
	
	@RequestMapping
	@GetMapping("/")
	public String index(Model model, @ModelAttribute("language") Language language) {
			model.addAttribute("allLanguages", this.lService.allLanguages());
			return "index.jsp";		
	}
	
}
