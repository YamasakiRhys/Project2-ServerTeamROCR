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

import com.revature.Project2Rocr.beans.Trade;
import com.revature.Project2Rocr.service.RequestsService;
import com.revature.Project2Rocr.service.TradeService;

@CrossOrigin
@RestController
public class TradeCtrl {

	@Autowired
	private TradeService tradeService;
	
	@Autowired
	private RequestsService requestsService;
	
	/**
	 * Gets all trades from DB
	 * @return A list of trades an HttpStatus of 200
	 */
	@GetMapping("/trade")
	public ResponseEntity<List<Trade>> getAllTrade() {
		System.out.println("TradeCtrl - getAllTrade");
		return new ResponseEntity<List<Trade>>(tradeService.getAllTrade(), HttpStatus.OK);
	}
	
	/**
	 * Sends a post request and creates a new trade
	 * @return a trade json object and an HttpStatus of Created
	 */
	
	@PostMapping("/trade")
	public ResponseEntity<Trade> createTrade(@RequestBody Trade trad) {
		System.out.println("TradeCtrl - createTrade");
		trad.setStatusId(1);
		trad = tradeService.createTrade(trad);
		return new ResponseEntity<Trade>(trad, HttpStatus.CREATED);
		}
	}
