
package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.entity.movie;
import com.app.repository.movieRepository;
@Service
@Transactional


public class movieServiceImpl implements movieService{
	
	@Autowired // by type : Field Level DI
	private movieRepository railRepo;

	@Override
	public List<movie> getAllmovies() {
		// TODO Auto-generated method stub
		return railRepo.findAll();
	}

	@Override
	public movie addrailDetails(movie transientrail) {
		// TODO Auto-generated method stub
		return railRepo.save(transientrail);
	}

	@Override
	public String deleterailDetails(Long movieno) {
		String msg="movie deleted Sucessfully";
		if(railRepo.existsById(movieno)) {
			railRepo.deleteById(movieno);
		}
		return msg;
	}

	@Override
	public movie getrailDetails(Long movieno) {
		// TODO Auto-generated method stub
		return railRepo.findById(movieno).orElseThrow(()-> new ResourceNotFoundException("Invalid movieid"));
	}

	@Override
	public movie updaterailDetails(movie detachedrail) {
		// TODO Auto-generated method stub
		return railRepo.save(detachedrail);
	}

	

	
	}
	
	
	
	
	



