package com.cas.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@Endpoint(id="custome")
public class CustomeActuator {
	
	
	private Map<String,String > data=new HashMap<>();
	
	
	@ReadOperation
	public Map<String,String > readData() {
		return data;
	}

	@WriteOperation
	public void writeData( String key, String value) {
		data.put(key,value);
		System.out.println(data);
	}
	
	@DeleteOperation
	public void deleteData(String key) {
		data.remove(key);
		System.out.println(data);
	}
	
	
}
