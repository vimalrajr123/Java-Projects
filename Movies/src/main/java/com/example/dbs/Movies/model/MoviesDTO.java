package com.example.dbs.Movies.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor


public class MoviesDTO {
	
	private String name;
	private String genere;
	private int year;
	private int minutes;

}
