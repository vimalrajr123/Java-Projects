package com.example.dbs.Movies.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.dbs.Movies.helper.IbankHelper;
import com.example.dbs.Movies.model.CommonResponse;
import com.example.dbs.Movies.model.Movies;
import com.example.dbs.Movies.model.MoviesDTO;
import com.example.dbs.Movies.service.MoviesService;


//@Controller
@RestController   
@RequestMapping("/movies")
//@Slf4j
public class MoviesController {
	
	
	@Autowired
	MoviesService ibankingService;
	
	@Autowired
	IbankHelper ibankHelper;
	
	//@RequestMapping(value= "/getMoviesById/{id}",method=RequestMethod.GET,consumes ="application/json",produces = "application/json")
	@GetMapping("/getMoviesById/{id}")
	//@ResponseBody   //if @Controller has been used
	public ResponseEntity<CommonResponse> getMoivesById(@PathVariable int id) {
		
		CommonResponse moviesResponse ; 
		
		Movies movies = ibankingService.getMoviesById(id);
		if(movies==null){
			//runtime exception  
			moviesResponse = ibankHelper.getResponseDetails(404, "Movies not found", movies);
			return new ResponseEntity<CommonResponse>(moviesResponse, HttpStatus.NOT_FOUND);
			}  
		
		moviesResponse = ibankHelper.getResponseDetails(200, "Movies retrieved successfully", movies);
		return new ResponseEntity<CommonResponse>(moviesResponse, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteMoviesById/{id}")
	//@ResponseBody
	public ResponseEntity<CommonResponse> deleteMoviesById(@PathVariable int id) {
		ibankingService.deleteMoviesById(id);
		return null;
	}
	
	@PutMapping("updateMoviesNameById/{id}/{name}")
	//@ResponseBody
	public ResponseEntity<CommonResponse> updateMoviesById(@PathVariable int id,@PathVariable String name){
		
		CommonResponse moviesResponse; 
		Movies movies = ibankingService.updateMoviesNameById(id, name);
		moviesResponse = ibankHelper.getResponseDetails(200, "Movies updated successfully", movies);
		return new ResponseEntity<CommonResponse>(moviesResponse, HttpStatus.OK);
	}
	
	
	@PostMapping("/createNewMovies")
	//@ResponseBody
	public ResponseEntity<CommonResponse> createNewMovies(@RequestBody MoviesDTO moviesDTO){
		
		CommonResponse moviesResponse; 
		Movies movies = ibankingService.createNewMovies(moviesDTO.getName(),moviesDTO.getGenere(),
				moviesDTO.getYear(),moviesDTO.getMinutes());
		moviesResponse = ibankHelper.getResponseDetails(200, "Movies created successfully", movies);
		return new ResponseEntity<CommonResponse>(moviesResponse,HttpStatus.OK);
	}
	
	@GetMapping("/getAllMovies")
	public ResponseEntity<CommonResponse> getAllMovies(){
		
		System.out.println("entered controller");
		CommonResponse moviesResponse;
		List<Movies> movies =ibankingService.getAllMovies();
 		if(movies==null){
			//runtime exception  
			moviesResponse = ibankHelper.getResponseDetails(404, "No Movies found", movies);
			return new ResponseEntity<CommonResponse>(moviesResponse, HttpStatus.NOT_FOUND);
			}  
		
		moviesResponse = ibankHelper.getResponseDetails(200, "Movies retrieved successfully", movies);
		return new ResponseEntity<CommonResponse>(moviesResponse, HttpStatus.OK);
		
	}
		
}
	
	
	
	

