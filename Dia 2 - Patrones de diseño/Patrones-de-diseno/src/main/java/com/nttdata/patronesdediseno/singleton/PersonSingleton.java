package com.nttdata.patronesdediseno.singleton;

public class PersonSingleton {

	private static Person instance;
	
	public static Person getInstance() {
		if (instance == null) {
			instance = new Person();
		}
		return instance;
	}
	
}
