package com.revature.Project2Rocr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.Project2Rocr.beans.Requests;
import com.revature.Project2Rocr.repository.GamesRepo;
import com.revature.Project2Rocr.repository.GenreRepo;
import com.revature.Project2Rocr.repository.RequestsRepo;
import com.revature.Project2Rocr.repository.StatusRepo;

@Service
public class RequestsService {

	@Autowired
	private RequestsRepo requestsRepo;
	
	@Autowired
	private GamesRepo gamesRepo;
	
	@Autowired
	private GenreRepo genreRepo;
	
	@Autowired
	private StatusRepo statusRepo;
	
	public List<Requests> getAllRequests(){
		return (List<Requests>) requestsRepo.findAll();
		
	}
}
