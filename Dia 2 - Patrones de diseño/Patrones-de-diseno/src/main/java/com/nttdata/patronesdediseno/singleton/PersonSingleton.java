package com.nttdata.patronesdediseno.singleton;

import org.springframework.boot.CommandLineRunner;

/**
 * 
 * @author Óscar Bayo Requena
 *
 */
public class PersonSingleton {

	private static PersonSingleton instance;

	private String name;
	private int age;

	private PersonSingleton() {
	}

	private PersonSingleton(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public static PersonSingleton getSingleton(String name, int age) {

		if (instance == null) {
			instance = new PersonSingleton(name, age);
		}
		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
