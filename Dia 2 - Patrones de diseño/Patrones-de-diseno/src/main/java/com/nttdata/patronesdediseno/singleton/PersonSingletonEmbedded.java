package com.nttdata.patronesdediseno.singleton;

import org.springframework.boot.CommandLineRunner;

/**
 * 
 * @author Óscar Bayo Requena
 *
 */
public class PersonSingletonEmbedded {

	private static PersonSingletonEmbedded instance;

	private String name;
	private int age;

	private PersonSingletonEmbedded() {
	}

	private PersonSingletonEmbedded(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public static PersonSingletonEmbedded getInstance() {

		if (instance == null) {
			instance = new PersonSingletonEmbedded();
		}
		return instance;
	}
	
	public static PersonSingletonEmbedded getInstance(String name, int age) {

		if (instance == null) {
			instance = new PersonSingletonEmbedded(name, age);
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

	@Override
	public String toString() {
		return "Nombre: " + this.getName()
					+ "\nEdad: " + this.getAge();
	}
	
	
}
