package com.cbpos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbpos.service.OrderService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
//@RequestMapping(value="/api/v1/")
public class OrderController {

	
	@Autowired
	private OrderService orderService;
	
	
	@GetMapping("/confirmPayment")
	@CircuitBreaker(name="payment",fallbackMethod="fallBack")
	public String confirmPayment() {
		 return orderService.confirmPayment();	
	}
	
	private String fallBack() {
		return "Payment API is offline";
	}
}
