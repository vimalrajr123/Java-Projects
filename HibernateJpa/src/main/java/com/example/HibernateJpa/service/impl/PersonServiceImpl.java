package com.example.HibernateJpa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HibernateJpa.model.onetomany.Mobile;
import com.example.HibernateJpa.model.onetomany.MobileDTO;
import com.example.HibernateJpa.model.onetomany.Person;
import com.example.HibernateJpa.model.onetomany.PersonDTO;
import com.example.HibernateJpa.repository.PersonRepository;
import com.example.HibernateJpa.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	PersonRepository personRepository;

	@Override
	public Person createNewPerson(PersonDTO personDTO) {
		Person person = new Person();
		List<Mobile> mobileList = new ArrayList<>();
		List<MobileDTO> mobileDTOList = personDTO.getMobileDTOList();
		
		for(MobileDTO m : mobileDTOList) {
			Mobile mobile = new Mobile();
			mobile.setModel(m.getModel());
			mobile.setNumber(m.getNumber());
			mobileList.add(mobile);
		}
		System.out.println("mobileList::"+mobileList);
		person.setPersonName(personDTO.getPersonName());
		person.setAge(personDTO.getAge());
		person.setMobileList(mobileList);
		
		System.out.println("person::"+person);
		Person result = personRepository.save(person);
		return result;
	}

}
