package com.revature.Project2Rocr.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.Project2Rocr.beans.Games;
import com.revature.Project2Rocr.beans.Genre;
import com.revature.Project2Rocr.service.GamesService;

@CrossOrigin
@RestController
public class GamesCtrl {

	@Autowired
	private GamesService gamesService;
	
	/**
	 *  This method sends a get request to endpoint to receive a list of genres
	 * @return if null is returned from game service method the return httpStatus of not found
	 * 		else return a list of genres and an httpStatus of 200
	 */
	@GetMapping("/games/genres")
	public ResponseEntity<List<Genre>> getAllGenres() {
		if (gamesService.getAllGenres() == null) {
			return new ResponseEntity<List<Genre>>(HttpStatus.NOT_FOUND);
		} else {
		return new ResponseEntity<List<Genre>>(gamesService.getAllGenres(), HttpStatus.OK); 
		}
	}
	
	
	/**
	 * This method sends a post request to create a game in the db
	 * @param game - takes a json object
	 * @return - returns a game object and an http status of 201
	 */
	@PostMapping("/games")
	public ResponseEntity<Games> addGame(@RequestBody Games game) {
		System.out.println("Adding game to DB -POST");
		game = gamesService.addGame(game);
		return new ResponseEntity<Games>(game, HttpStatus.CREATED);
	}	
	
}
