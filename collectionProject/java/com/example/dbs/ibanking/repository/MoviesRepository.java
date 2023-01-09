package com.example.dbs.ibanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.dbs.ibanking.model.Movies;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Integer> {
}
