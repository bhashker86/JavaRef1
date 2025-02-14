package com.cbpps.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentServcieImpl implements PaymentServcie {

	@Override
	public boolean verifyPayment() {
		return true;
	}

}
