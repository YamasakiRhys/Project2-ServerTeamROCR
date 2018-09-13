package com.revature.Project2Rocr.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.Project2Rocr.beans.Requests;
import com.revature.Project2Rocr.service.RequestsService;

@RestController
public class RequestsCtrl {

	@Autowired
	private RequestsService requestsService;
	/**
	 * Sends a get request and receive a list of all requests
	 * @return An array list of requests and an http status is returned
	 */
	@GetMapping("/requests")
	public ResponseEntity<List<Requests>> getAllRequests() {
		return new ResponseEntity<List<Requests>>(requestsService.getAllRequests(), HttpStatus.OK);
	}
	
}
