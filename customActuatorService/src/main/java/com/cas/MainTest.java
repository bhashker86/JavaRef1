package com.cas;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.xml.stream.events.Characters;

public class MainTest {

	// CODE EXAMPLE VALID FOR COMPILING
	
	    public static void main(String[] args) {
	        System.out.println("Hello, World!"); 
	        
	        String s="Welcom to java worlf";
	       System.out.println("result is: "+ calculateFre(s));
	    }
	    
	    private static Map<String,Long>  calculateFre(String str){
	        
	      return Arrays.stream(str.split("")).filter(word->!word.trim().isEmpty())
	                 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	                                   
	        
	    }
	}

