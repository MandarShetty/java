package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.app.entity.movie;
import com.app.service.movieServiceImpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/movies")
public class movieController {
	@Autowired
private movieServiceImpl movieService;
	@GetMapping
	public List<movie> getAllmovie(){
		return movieService.getAllmovies();
	}
//	@PostMapping
//	public movie addmovie( @RequestBody movie m) {
//		return movieService.addrailDetails(m);
//	}
	
	@PostMapping
	 public ResponseEntity<movie>  savemovieDetails(@org.springframework.web.bind.annotation.RequestBody movie m){
		 System.out.println("In add emp details controller....");
		 return new ResponseEntity<>(movieService.addrailDetails(m),HttpStatus.CREATED);
	 }

	@DeleteMapping
	public String deletemovie(@PathVariable Long movieNo) {
		String msg="deleted";
		movieService.deleterailDetails(movieNo);
		return msg;
	}
	@GetMapping("/{movieno}")
	public movie getmovieByid(@PathVariable Long movieno) {
		return movieService.getrailDetails(movieno);
		
	}
	@PutMapping("/{movieNo}")
	public movie updatemovie(@org.springframework.web.bind.annotation.RequestBody movie m) {
		return   movieService.updaterailDetails(m);
		
	}
}
