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
	
	@GetMapping("/games/genres")
	public ResponseEntity<List<Genre>> getAllGenres() {
		if (gamesService.getAllGenres().equals(null)) {
			return new ResponseEntity<List<Genre>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Genre>>(gamesService.getAllGenres(), HttpStatus.OK); 
	}
	
	@PostMapping("/games")
	public ResponseEntity<Games> addGame(@RequestBody Games game) {
		System.out.println("Adding game to DB -POST");
		game = gamesService.addGame(game);
		return new ResponseEntity<Games>(game, HttpStatus.CREATED);
	}	
	
}
