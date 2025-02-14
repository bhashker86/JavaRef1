package com.notificationService.service;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParser;
import com.notificationService.bean.Transaction;

@Service
public class TransactionServcieImpl implements TransactionServcie {

	@Value("api.key")
	private  String API_KEY;
	
	String url_str = "https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/USD";

	// Making Request
	/*
	 * URL url = new URL(url_str); HttpURLConnection request = (HttpURLConnection)
	 * url.openConnection(); request.connect();
	 * 
	 * // Convert to JSON JsonParser jp = new JsonParser(); JsonElement root =
	 * jp.parse(new InputStreamReader((InputStream) request.getContent()));
	 * JsonObject jsonobj = root.getAsJsonObject();
	 */

	// Accessing object
	//String req_result = jsonobj.get("result").getAsString();
	
	@Override
	public String ProcessTransaction(Transaction txn) {
		// TODO Auto-generated method stub
		String mstemplateg="Fraud detected: <reason>";
		String actualMsg="";
		if(!validateTxnAmount(txn)) {
			actualMsg=mstemplateg.replace("<reason>", "Transaction amount is gretter that 10K USD");
		}
		else {
			actualMsg="Transaction processed successfully";
		}
		
		return actualMsg;
	}
	
	
	private boolean validateTxnAmount(Transaction txn) {
		double txnAmount = txn.getAmount();
		String currency = txn.getCurrency();
		if (txnAmount > 10000 && currency.equalsIgnoreCase("usd")) {
			return false;
		} else if (txnAmount / 86.6191 > 10000 && currency.equalsIgnoreCase("inr")) {
			return false;
		}
		return true;

	}
	
	

}
