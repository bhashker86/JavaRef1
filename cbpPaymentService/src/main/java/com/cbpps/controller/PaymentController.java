package com.cbpps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbpps.service.PaymentServcie;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/api/v1/payment/")
public class PaymentController {
	
	@Autowired
	private PaymentServcie  paymentServcie;
	
	
   @GetMapping("/verifyPayment")
   public ResponseEntity<Object> verifyPayment() {
	   return new ResponseEntity<Object>(paymentServcie.verifyPayment(),HttpStatus.OK);
   }

}
