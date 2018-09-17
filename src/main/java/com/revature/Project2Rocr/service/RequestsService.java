package com.revature.Project2Rocr.service;

import java.util.List;
import java.util.Optional;

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
		return (List<Requests>) getRequestsRepo().findAll();
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
		getRequestsRepo().save(req);
		return req;
		}
	}
	
	/**
	 * This method that finds requests by id
	 * @param gets an id from the get request that passed it
	 * @return the req object or null if not found
	 */
	public Optional<Requests> findRequestById(int id) {
		Optional<Requests> req = getRequestsRepo().findById(id);
		return req;
	}
	
	/**
	 * This method changes the status of a request to pending
	 * @param receives a request object from the controller
	 * @return returns the result of the saved object
	 */
	public Requests updateRequestStatus(Requests requests) {
		getRequestsRepo().save(requests);
		return requests;
	}

	public RequestsRepo getRequestsRepo() {
		return requestsRepo;
	}

	public void setRequestsRepo(RequestsRepo requestsRepo) {
		this.requestsRepo = requestsRepo;
	}
	
}
