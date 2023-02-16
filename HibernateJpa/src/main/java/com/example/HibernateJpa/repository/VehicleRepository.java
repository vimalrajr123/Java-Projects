package com.example.HibernateJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HibernateJpa.model.manytomany.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
