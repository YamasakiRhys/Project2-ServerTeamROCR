package com.revature.Project2Rocr.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

	@PatchMapping("/requests/{id}")
	public ResponseEntity<Requests> updateStatusPending(@RequestBody Requests requests, @PathVariable int id) {
		System.out.println("RequestsCtrl - update status to pending");
		requests.setRequestId(id);
		System.out.println(requests);
		requestsRepo.save(requests);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
