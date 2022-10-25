package com.nttdata.patronesdediseno.singleton;

/**
 * 
 * @author Óscar Bayo Requena
 *
 */
public class Person {
	
	private String name;
	private int age;
	private char gender;
	private String dni;

	public Person(){}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}

	public Person(String name, int age, char gender, String dni) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dni = dni;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.getName()
					+ "\nEdad: " + this.getAge()
					+ "\nSexo: " + this.getGender()
					+ "\nDNI: " + this.getDni();
	}
	
}
