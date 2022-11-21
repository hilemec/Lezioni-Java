package com.adecco.demoDataBase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adecco.demoDataBase.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

	
	
}