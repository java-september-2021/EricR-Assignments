package com.eric.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eric.languages.models.Language;
import com.eric.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository lRepo;
	
	public LanguageService(LanguageRepository repo) {
		this.lRepo = repo;
	}
	
	
	// Find all languages
	public List<Language> allLanguages(){
		return this.lRepo.findAll();
	}
	
	//Find one language
	public Language findLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	//Create 
	public Language createLanguage(Language newLang) {
		return this.lRepo.save(newLang);
	}
	
	//Update
	public Language updateLanguage(Language updatedLang) {
		return this.lRepo.save(updatedLang);
	}
	
	//Delete
	public void deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
	}

}
