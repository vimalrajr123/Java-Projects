package com.example.HibernateJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.HibernateJpa.model.onetomany.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
