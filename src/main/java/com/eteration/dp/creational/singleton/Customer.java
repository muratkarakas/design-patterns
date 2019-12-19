package com.eteration.dp.creational.singleton;

public class Customer {
	
	private static Customer  instance;
	private static Object lock = new Object();
	private Customer() {
	}
	
	
	public static Customer newInstance() {
		
		
		synchronized (lock) {
			if(instance == null) {
				instance = new Customer();
			}
		}
		
		
		return instance;
	}

}
