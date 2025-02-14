package com.utils;

public class SingaltonStudent {
	
	private static SingaltonStudent sStudent=new SingaltonStudent();
	
	private SingaltonStudent() {};
	
	public static SingaltonStudent getSingaltonStudent() {
		return sStudent;
	}

}
