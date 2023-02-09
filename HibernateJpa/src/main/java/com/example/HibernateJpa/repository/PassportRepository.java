package com.example.HibernateJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HibernateJpa.model.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Integer> {

}
