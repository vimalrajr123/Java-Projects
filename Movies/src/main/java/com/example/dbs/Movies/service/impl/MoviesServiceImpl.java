package com.example.dbs.Movies.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dbs.Movies.model.Movies;
import com.example.dbs.Movies.repository.MoviesRepository;
import com.example.dbs.Movies.service.MoviesService;


@Service
public class MoviesServiceImpl implements MoviesService {
	
	@Autowired
	MoviesRepository moviesRepository;

	@Override
	public Movies getMoviesById(int id) {
		// TODO Auto-generated method stub
		
		Optional<Movies> movies = moviesRepository.findById(id); //optional is may or may not contain null value
		if(movies.isEmpty()) {
			return null;
		}
		Movies result = movies.get();
		return result;
	}

	@Override
	public void deleteMoviesById(int id) {
		// TODO Auto-generated method stub
		moviesRepository.deleteById(id);
		
	}

	@Override
	public Movies updateMoviesNameById(int id, String name) {
		// TODO Auto-generated method stub
		
		Optional<Movies> movies = moviesRepository.findById(id);
		Movies moviesDetails = movies.get();
		moviesDetails.setName(name);
		
		Movies result = moviesRepository.save(moviesDetails);
		return result;
	}

	@Override
	public Movies createNewMovies(String name, String genere, int year, int minutes) {
		// TODO Auto-generated method stub
		
		Movies movies = new Movies(name,genere,year,minutes);
		Movies result = moviesRepository.save(movies);
		
		return result;
	}

	@Override
	public List<Movies> getAllMovies() {
		// TODO Auto-generated method stub
		System.out.println("entered service");
		List<Movies> movies = new ArrayList<Movies>();
		movies = moviesRepository.findAll();
		return movies;
	}


	}