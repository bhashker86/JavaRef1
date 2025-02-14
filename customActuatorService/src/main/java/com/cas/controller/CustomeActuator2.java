package com.cas.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="customer-actuator2", enableByDefault = false)
public class CustomeActuator2 {


	private Map<String,Feature > data=new HashMap<>();
	
	
	@ReadOperation
	public Map<String,Feature > readData() {
		return data;
	}

	@WriteOperation
	public void writeData( @Selector String key, Feature value) {
		data.put(key,value);
		System.out.println(data);
	}
	
	@DeleteOperation
	public void deleteData(@Selector String key) {
		data.remove(key);
		System.out.println(data);
	}
	
	public static class Feature {
        private Boolean enabled;

    }
}
