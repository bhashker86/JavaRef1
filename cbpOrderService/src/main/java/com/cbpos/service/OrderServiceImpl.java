package com.cbpos.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService {

	
	private final String PAYMENT_URL="http://localhost:9093/payment-service/api/v1/payment/verifyPayment";
	
	private RestTemplate  restTemplate;
	
	@Override
	public String confirmPayment() {
		
		return restTemplate.getForObject(PAYMENT_URL, String.class);
	}

}
