package com.utils;

//If singleton class is loaded by two classloaders, 
//two instance of singleton class will be created, one for each classloader
public class LazySingaltonStudent {
	
	private static LazySingaltonStudent lazySingaltonStudent=null;
	
	private LazySingaltonStudent() {};
	
	public static LazySingaltonStudent getLazySingaltonStudent() {
		if(lazySingaltonStudent==null) {
			
			synchronized(LazySingaltonStudent.class) {
				
				if(lazySingaltonStudent==null) {
					lazySingaltonStudent= new LazySingaltonStudent();
				}
			}
		}
		 return lazySingaltonStudent;
	}

}
