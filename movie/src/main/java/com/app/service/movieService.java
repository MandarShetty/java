package com.app.service;

import java.util.List;

import com.app.entity.movie;

public interface movieService {
	
	List<movie> getAllmovies();

	movie addrailDetails(movie transientrail);

	String deleterailDetails(Long movieno);

	movie getrailDetails(Long movieno);

	
	movie updaterailDetails(movie detachedrail);

	


}
