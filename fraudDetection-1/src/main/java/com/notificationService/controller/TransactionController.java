package com.notificationService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.notificationService.bean.Transaction;
import com.notificationService.bean.TransactionDTO;
import com.notificationService.service.TransactionServcie;

@RestController
@RequestMapping("api/v1/transaction")
public class TransactionController {
	
	@Autowired
	private TransactionServcie txnServcie;
	
	@PostMapping("/handleTransaction")
	public ResponseEntity<String> handleTransaction(@RequestBody TransactionDTO transcData) {
		
		ObjectMapper  mapper=new ObjectMapper ();
		Transaction txn=mapper.convertValue(transcData, Transaction.class);
		
		String message=txnServcie.ProcessTransaction(txn);
		
		return new ResponseEntity<>(message,HttpStatus.ACCEPTED);
	}

}
