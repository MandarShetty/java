package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.movie;

public interface movieRepository 
extends JpaRepository<movie, Long> {
	// add a method for auth
	List<movie> findBymovieNameContainingIgnoreCase(String movieName);

}
