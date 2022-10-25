package com.nttdata.patronesdediseno.builder;

import org.springframework.cache.interceptor.CachePutOperation.Builder;

import com.nttdata.patronesdediseno.singleton.Person;

public class Director {
		
	public void constructMan(IBuilder builder) {
		builder.setName("John Doe");
		builder.setAge(0);
		builder.setGender('M');
		builder.setDni("-No especificado-");
	}
	
	public void constructWoman(IBuilder builder) {
		builder.setName("Jane Doe");
		builder.setAge(0);
		builder.setGender('M');
		builder.setDni("-No especificado-");
	}
	
	public void constructJeffry(IBuilder builder) {
		builder.setName("Jeffry");
		builder.setAge(17);
		builder.setGender('M');
		builder.setDni("987654321F");
	}
		
	
}
