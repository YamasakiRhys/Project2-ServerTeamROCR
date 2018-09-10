package com.revature.Project2Rocr.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.Project2Rocr.beans.Genre;
import com.revature.Project2Rocr.service.GamesService;

@RestController
public class GamesCtrl {

	@Autowired
	private GamesService gamesService;
	
	@GetMapping("/games/genres")
	public List<Genre> getAllGenres() {
		return gamesService.getAllGenres();
	}
}
