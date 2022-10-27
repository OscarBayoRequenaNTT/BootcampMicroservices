package com.nttdata.tallerwebfluxmicro;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class PeopleController {

	
	@GetMapping(path = "/person-list-1")
	public Flux<Person> personList1(){
		
		int delay = (int) (Math.random() * 3000 +1000);
		Flux<Person> personaFlux = Flux.just(new Person("Nikola","Tesla",31)).delayElements(Duration.ofMillis(delay));
		System.out.println(delay);
		
		return personaFlux;
		
	}
	
	@GetMapping(path = "/person-list-2")
	public Flux<Person> personList2(){
		
		int delay = (int) (Math.random() * 3000 +1000);
		Flux<Person> personaFlux = Flux.just(new Person("Jeffry","Bing",17)).delayElements(Duration.ofMillis(delay));
		System.out.println(delay);
		
		return personaFlux;
		
	}
	
	@GetMapping(path = "/person-list-3")
	public Flux<Person> personList3(){
		
		int delay = (int) (Math.random() * 3000 +1000);
		Flux<Person> personaFlux = Flux.just(new Person("Adonis","Guerrero",35)).delayElements(Duration.ofMillis(delay));
		System.out.println(delay);
		
		return personaFlux;
		
	}
	
	@GetMapping(path = "/person-list-4")
	public Flux<Person> personList4(){
		
		int delay = (int) (Math.random() * 3000 +1000);
		Flux<Person> personaFlux = Flux.just(new Person("Óscar","Bayo",20)).delayElements(Duration.ofMillis(delay));
		System.out.println(delay);
		
		return personaFlux;
		
	}
	
	
}
