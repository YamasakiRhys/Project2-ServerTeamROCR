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

import com.revature.Project2Rocr.beans.Requests;
import com.revature.Project2Rocr.repository.RequestsRepo;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
class RequestsServiceTest {
	
	@Mock
	RequestsRepo requestsRepo;
	
	@InjectMocks
	private RequestsService requestsService;
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	final void testCreateRequest() {
		Requests requests = new Requests();
		
		requests.setRequestId(1);
		requests.setUserId(124);
		requests.setGameId(1);
		requests.setStatusId(3);
		
when(requestsRepo.save(any(Requests.class))).thenReturn(requests);
		
		Requests newRequests = requestsService.getRequestsRepo().save(new Requests());
		System.out.println(newRequests);
		
		assertEquals(1, newRequests.getRequestId());
		assertEquals(124, newRequests.getUserId());
		assertEquals(1, newRequests.getGameId());
		assertEquals(3, requests.getStatusId());
	}
	
final void testGetRequests() {
		
	}
}
