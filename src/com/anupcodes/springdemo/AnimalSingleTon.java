package com.anupcodes.springdemo;

public class AnimalSingleTon {
	
	private static AnimalSingleTon single_instance= null;
	
	private AnimalSingleTon() {
		
	}
	
	public static AnimalSingleTon getInstance() {
		
		if(single_instance == null) {
			return single_instance = new AnimalSingleTon();
		}
		return single_instance;
		
	}
	
}
