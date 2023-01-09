package com.example.dbs.Movies.service;

import java.util.List;
import com.example.dbs.Movies.model.Movies;

public interface MoviesService {
	
	Movies getMoviesById(int id);

	void deleteMoviesById(int id);

	Movies updateMoviesNameById(int id, String name);

	Movies createNewMovies(String name, String genere, int year, int minutes);
	
	List<Movies> getAllMovies();

}
