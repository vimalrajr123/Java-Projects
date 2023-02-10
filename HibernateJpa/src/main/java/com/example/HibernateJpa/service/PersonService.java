package com.example.HibernateJpa.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.HibernateJpa.model.onetomany.Mobile;
import com.example.HibernateJpa.model.onetomany.Person;

@Service
public interface PersonService {
	
	Person createNewPerson(String name,int age, List<Mobile> mobile);

}
