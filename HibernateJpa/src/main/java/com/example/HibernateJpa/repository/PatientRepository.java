package com.example.HibernateJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HibernateJpa.model.manytomany.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
