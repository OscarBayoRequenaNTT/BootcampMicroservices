package com.nttdata.tallerwebfluxmicro;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@Service
public class PersonService {

	public Flux<Person> allPersons() {

		Flux<Person> persona1 = WebClient.create("http://localhost:8082/person-list-1").get().retrieve().bodyToFlux(Person.class);
		Flux<Person> persona2 = WebClient.create("http://localhost:8082/person-list-2").get().retrieve().bodyToFlux(Person.class);
		Flux<Person> persona3 = WebClient.create("http://localhost:8082/person-list-3").get().retrieve().bodyToFlux(Person.class);
		Flux<Person> persona4 = WebClient.create("http://localhost:8082/person-list-4").get().retrieve().bodyToFlux(Person.class);

		Flux<Person> allFlux = Flux.merge(persona1,persona2,persona3,persona4);

		return allFlux;
	}

//	public List<Person> allPersons(){
//		
//		List<Person> listado = new ArrayList();
//		
//		listado.add(new Person("Nikola","Tesla",31));
//		listado.add(new Person("Jeffry","Bing",17));
//		listado.add(new Person("Adonis","Guerrero",35));
//		listado.add(new Person("Óscar","Bayo",20));
//		
//		return listado;
//	}

}
