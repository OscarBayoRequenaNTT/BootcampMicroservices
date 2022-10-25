package com.nttdata.patronesdediseno.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.nttdata.patronesdediseno.singleton.Person;

public class Config {

	@Bean(name="personPrototype")
	@Scope("prototype")
	public Person personPrototype() {
		return new Person ("Jeffry",33);
	}
	
	@Bean(name="personSingleton")
	//@Scope("singleton")
	public Person personSingleton() {
		return new Person ("Adonis",20);
	}
	
}
