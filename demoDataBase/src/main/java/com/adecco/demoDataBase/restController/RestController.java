package com.adecco.demoDataBase.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.adecco.demoDataBase.service.PersonaService;

import com.adecco.demoDataBase.model.Persona;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	PersonaService personaService;
	
	@GetMapping("/api/somma-numeri")
	public int somma(@RequestParam(name="num1") int num1,
								@RequestParam(name="num2") int num2) {
		return num1 + num2;
	}
	@GetMapping("/api/getAll")
	public List<persona> getAllPersone() {
		
		return personaService.getAllPersoneInDatabase();
	}
	@GetMapping("/api/destroyByID")
	public boolean deleteAll(@RequestParam(nome="codice") int codice) {
		
		if(codice==1234)
			return personaService.deleteAllPerson();
		return false;
	}
	
	@PostMapping("/api/savePersona")
	public String savePersona(@RequestBody Persona persona) {
		boolean ris=personaService.addPersona(persona);
		if(ri) {
			return "tutto OK";
		}
		else {
			return "Qualcosa e' andato storto";
		}
		
	}

}
