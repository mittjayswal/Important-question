package com.as.mitt.designpattern;

public class SingletonEarly {

	private static SingletonEarly s = new SingletonEarly();
	
	private SingletonEarly() {
		
	}
	
	public static SingletonEarly getInstance() {
		return s;
	}
}
