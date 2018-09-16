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
import com.revature.Project2Rocr.beans.Trade;
import com.revature.Project2Rocr.repository.TradeRepo;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
class TradeServiceTest {
	
	@Mock
	TradeRepo tradeRepo;
	
	@InjectMocks
	private TradeService tradeService;
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	final void testCreateTrade() {
		Trade trade = new Trade();
		
		trade.setTradeId(1);
		trade.setRequestedOfferId(124);
		trade.setGivenOfferId(1);
		trade.setStatusId(3);
		
		
when(tradeRepo.save(any(Trade.class))).thenReturn(trade);
		
		Trade newTrade = tradeService.getTradeRepo().save(new Trade());
		System.out.println(newTrade);
		
		assertEquals(1, newTrade.getTradeId());
		assertEquals(124, newTrade.getRequestedOfferId());
		assertEquals(1, newTrade.getGivenOfferId());
		assertEquals(3, trade.getStatusId());
	}
	
final void testGetRequests() {
		
	}

}
