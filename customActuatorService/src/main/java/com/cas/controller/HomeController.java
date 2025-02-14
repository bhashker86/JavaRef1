package com.cas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController{
	
	
	@GetMapping("home/{name}")
	public ResponseEntity<String>  homeInfo(@PathVariable("name") String name) {
		
		String str="This is page "+name;
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
}