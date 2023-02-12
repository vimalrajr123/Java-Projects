package com.example.HibernateJpa.service;


import com.example.HibernateJpa.model.onetomany.Person;
import com.example.HibernateJpa.model.onetomany.PersonDTO;


public interface PersonService {
	
	Person createNewPerson(PersonDTO personDTO);

}
