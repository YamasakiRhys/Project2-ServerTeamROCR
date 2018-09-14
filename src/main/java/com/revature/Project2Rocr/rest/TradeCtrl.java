package com.revature.Project2Rocr.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.Project2Rocr.beans.Requests;
import com.revature.Project2Rocr.beans.Trade;
import com.revature.Project2Rocr.service.RequestsService;
import com.revature.Project2Rocr.service.TradeService;
@RestController
public class TradeCtrl {

	@Autowired
	private TradeService tradeService;
	
	@Autowired
	private RequestsService requestsService;
	
	/**
	 * Gets all trades from DB
	 * @return
	 */
	@GetMapping("/trade")
	public ResponseEntity<List<Trade>> getAllTrade() {
		System.out.println("TradeCtrl - getAllTrade");
		return new ResponseEntity<List<Trade>>(tradeService.getAllTrade(), HttpStatus.OK);
	}
	
	/**
	 * Sends a post request and creates a new trade
	 */
	
	@PostMapping("/trade")
	public ResponseEntity<Trade> createTrade(@RequestBody Trade trad) {
		System.out.println("TradeCtrl - createTrade");
//		req = requestsService.getRequestBy(req.getRequestId());
		trad = tradeService.createTrade(trad);
		return new ResponseEntity<Trade>(trad, HttpStatus.CREATED);
		}
	}
