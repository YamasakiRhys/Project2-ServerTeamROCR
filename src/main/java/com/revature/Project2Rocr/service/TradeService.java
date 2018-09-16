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
		return (List<Trade>) getTradeRepo().findAll();
	}
	
	/**
	 * 
	 * @param creating a new trade to persist to DB
	 * @return created object
	 */
	public Trade createTrade(Trade trad) {
		getTradeRepo().save(trad);
		return trad;
	}
	
	/**
	 * 
	 * @param takes a json object
	 * @return return the saved object from db
	 */
	public Trade statusClosed(Trade trad) {
		getTradeRepo().save(trad);
		return trad;
	}
	
	/**
	 * 
	 * @param trad
	 * @return return the saved object from the db
	 */
	public Trade statusAccepted(Trade trad) {
		getTradeRepo().save(trad);
		return trad;
	}

	public TradeRepo getTradeRepo() {
		return tradeRepo;
	}

	public void setTradeRepo(TradeRepo tradeRepo) {
		this.tradeRepo = tradeRepo;
	}
}
