package com.revature.Project2Rocr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.Project2Rocr.beans.Requests;
import com.revature.Project2Rocr.beans.Trade;
import com.revature.Project2Rocr.repository.RequestsRepo;
import com.revature.Project2Rocr.repository.TradeRepo;

@Service
public class TradeService {

	@Autowired
	private TradeRepo tradeRepo;
	
	@Autowired
	private RequestsRepo requestsRepo;

	/**
	 * Gets all trades from DB
	 * @return List of trades
	 */
	public List<Trade> getAllTrade(){
		return (List<Trade>) tradeRepo.findAll();
	}
	
	/**
	 * 
	 * @param creating a new trade to persist to DB
	 * @return created object
	 */
	public Trade createTrade(Trade trad) {
		System.out.println("service - Creating Trade");
		System.out.println(requestsRepo.findById(trad.getGivenOfferId()));
		tradeRepo.save(trad);
		return trad;
	}
}
