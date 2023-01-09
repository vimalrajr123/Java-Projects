package com.example.dbs.Movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.dbs.Movies.model.Movies;


@Repository
public interface MoviesRepository extends JpaRepository<Movies, Integer> {
}
