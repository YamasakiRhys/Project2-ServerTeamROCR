package com.revature.Project2Rocr.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.Project2Rocr.beans.Requests;
import com.revature.Project2Rocr.repository.RequestsRepo;
import com.revature.Project2Rocr.service.RequestsService;

@CrossOrigin
@RestController
public class RequestsCtrl {

	@Autowired
	private RequestsService requestsService;

	@Autowired
	private RequestsRepo requestsRepo;

	/**
	 * Sends a get request and receive a list of all requests
	 * 
	 * @return An array list of requests and an http status is returned
	 */
	@GetMapping("/requests")
	public ResponseEntity<List<Requests>> getAllRequests() {
		return new ResponseEntity<List<Requests>>(requestsService.getAllRequests(), HttpStatus.OK);
	}

	/**
	 * 
	 * @param req - takes a json object 
	 * @return if requestService.createRequest returns null, an http status response is sent back
	 * 		if a response is returned with an object, then return the object and send http status 201
	 */
	@PostMapping("/requests")
	public ResponseEntity<Requests> createRequest(@RequestBody Requests req) {
		System.out.println("RequestsCtrl - createRequest");
		req = requestsService.createRequest(req);
		if (req == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<Requests>(req, HttpStatus.CREATED);
		}
	}
	

	/**
	 * 	This method sends an put request to the database to change the requests status
	 * 
	 * @param requests - receives json object from client
	 * @param id - the id of the specific request that needs to be updated
	 * @return - a request object is returned and http status of 200
	 */
	@PutMapping("/requests/pending/{id}")
	public ResponseEntity<Requests> updateStatusPending(@RequestBody Requests requests, @PathVariable int id) {
		System.out.println("RequestsCtrl - update status to pending");
		requests.setRequestId(id);
		requests.setStatusId(2);
		System.out.println(requests);
		requests = requestsService.updateRequestStatusPending(requests);
		return new ResponseEntity<>(requests, HttpStatus.OK);
	}
	
	
	@PutMapping("/requests/open/{id}")
	public ResponseEntity<Requests> updateStatusOpen(@RequestBody Requests requests, @PathVariable int id) {
		System.out.println("RequestsCtrl - update status to pending");
		requests.setRequestId(id);
		requests.setStatusId(3);
		System.out.println(requests);
		requests = requestsService.updateRequestStatusOpen(requests);
		return new ResponseEntity<>(requests, HttpStatus.OK);
	}
}
