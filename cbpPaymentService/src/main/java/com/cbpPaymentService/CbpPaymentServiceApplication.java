package com.cbpPaymentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@EnableCircuitBreaker
public class CbpPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CbpPaymentServiceApplication.class, args);
	}

}
