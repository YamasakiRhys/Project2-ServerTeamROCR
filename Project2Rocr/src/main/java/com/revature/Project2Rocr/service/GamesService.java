package com.revature.Project2Rocr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.Project2Rocr.beans.Genre;
import com.revature.Project2Rocr.repository.GamesRepo;
import com.revature.Project2Rocr.repository.GenreRepo;

@Service
public class GamesService {

	@Autowired
	private GamesRepo gamesRepo;
	
	@Autowired
	private GenreRepo genreRepo;
	
	public List<Genre> getAllGenres() {
		return (List<Genre>) genreRepo.findAll();
	}
}
