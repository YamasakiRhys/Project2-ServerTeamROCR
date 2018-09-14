package com.revature.Project2Rocr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.Project2Rocr.beans.Requests;
import com.revature.Project2Rocr.repository.RequestsRepo;

@Service
public class RequestsService {

	@Autowired
	private RequestsRepo requestsRepo;
	
	/**
	 * Gets all requests in table
	 * @return a list of requests
	 */
	public List<Requests> getAllRequests(){
		return (List<Requests>) requestsRepo.findAll();
	}
	
	/**
	 * 
	 * @param req - takes in a request json object
	 * @return Null if description input is "" 
	 * 			else set the status to 3/open and return the saved object
	 */
	public Requests createRequest(Requests req) {
		System.out.println("req service - get all accounts");
		if (req.getDescription().equals("")) {
			return null;
		} else {
		req.setStatusId(3);
		requestsRepo.save(req);
		return req;
		}
	}
	
}
