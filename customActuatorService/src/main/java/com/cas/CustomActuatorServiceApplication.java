package com.cas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CustomActuatorServiceApplication {

	public static void main(String[] args) {
		ApplicationContext  appContext=SpringApplication.run(CustomActuatorServiceApplication.class, args);
		String [] names=appContext.getBeanDefinitionNames();
		for(String str: names) {
			System.out.println("Output is:"+str);
		}
	}

}
