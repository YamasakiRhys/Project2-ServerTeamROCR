package com.revature.Project2Rocr.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import com.revature.Project2Rocr.beans.Games;
import com.revature.Project2Rocr.repository.GamesRepo;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
class GamesServiceTest {

	@Mock
	GamesRepo gamesRepo;
	
	@InjectMocks
	private GamesService gamesService;
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	final void testAddGame() {
		Games games = new Games();
		
		games.setGameId(1);
		games.setTitle("Revenge Of The Titans");
		games.setGenreId(1);
		games.setPlot("Goblins seek revenge on the titan's for the death of one of their own");
	
		
		
		
when(gamesRepo.save(any(Games.class))).thenReturn(games);
		
		Games newGames = gamesService.getGamesRepo().save(new Games());
		System.out.println(newGames);
		
		assertEquals(1, newGames.getGameId());
		assertEquals("Revenge Of The Titans", newGames.getTitle());
		assertEquals(1, newGames.getGenreId());
		assertEquals("Goblins seek revenge on the titan's for the death of one of their own", games.getPlot());
	}
	
final void testGetGames() {
		
	}


}
