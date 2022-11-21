package com.adecco.demoDataBase.model;

import org.springframework.beans.factory.annotation.Autowired;

public class PersonaRepository {
	@Autowired
	private PersonaRepository personaRepository;
	
	public void addPersona(Persona persona) {
		if (persona==null || persona.getEta()<18)
		return ;
		
		personaRepository.save(persona);
		return true;
		{
			
		}

}
