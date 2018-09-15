package com.revature.Project2Rocr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.Project2Rocr.beans.Games;
import com.revature.Project2Rocr.beans.Genre;
import com.revature.Project2Rocr.repository.GamesRepo;
import com.revature.Project2Rocr.repository.GenreRepo;

@Service
public class GamesService {

	@Autowired
	private GamesRepo gamesRepo;
	
	@Autowired
	private GenreRepo genreRepo;
	
	/**
	 * Gets a list of all available game genres in the db
	 * @return a list of game genres
	 */
	
	public List<Genre> getAllGenres() {
		return (List<Genre>) genreRepo.findAll();
	}
	
	/**
	 * 	This method saves a game to the database
	 * 
	 * @param game - takes in a game object
	 * @return 
	 */
	
	public Games addGame(Games game) {
		gamesRepo.save(game);
		return game;
	}
}
