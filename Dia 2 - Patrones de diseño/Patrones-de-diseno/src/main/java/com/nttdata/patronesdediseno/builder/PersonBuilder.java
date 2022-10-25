package com.nttdata.patronesdediseno.builder;

import com.nttdata.patronesdediseno.singleton.Person;

public class PersonBuilder implements IBuilder{

	private String name;
	private int age;
	private char gender;
	private String dni;
	
	@Override
	public void setName(String data) {
		this.name = data;
	}

	@Override
	public void setAge(int data) {
		this.age = data;
		
	}

	@Override
	public void setGender(char data) {
		this.gender = data;
		
	}

	@Override
	public void setDni(String data) {
		this.dni = data;
		
	}
	
	public Person build() {
		Person p = new Person(this.name,this.age,this.gender,this.dni);
		this.limpiarDatos();
		return p;
	}

	private void limpiarDatos() {
		
		this.name = null;
		this.age = 0;
		this.gender = '-';
		this.dni = null;
		
	}

}
