package com.utils;

import java.io.Serializable;

//Solve the Deserializatin issues by overriding readResolve() method
public class LazySingaltonStudent2 implements Serializable {

	private LazySingaltonStudent2 lazySingaltonStudent2=null;
	
	private LazySingaltonStudent2() {};
	
	public LazySingaltonStudent2 getLazySingaltonStudent2() {
		
		if (lazySingaltonStudent2==null) {
			
			synchronized(LazySingaltonStudent2.class) {
				if (lazySingaltonStudent2==null) {
					
					return   lazySingaltonStudent2=new LazySingaltonStudent2();
				}
			}
		}
		return  lazySingaltonStudent2;
	}
	protected Object readResolve() {
		return getLazySingaltonStudent2();
		
	}
}
