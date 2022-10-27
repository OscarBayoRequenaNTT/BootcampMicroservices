package com.nttdata.tallerwebfluxmicro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import reactor.core.publisher.Flux;

@Controller
public class PersonListController {

	@Autowired
	private PersonService personService;
	
	@GetMapping(path = "/person-list")
	public String personList(final Model modelView){
		
		//int delay = (int) (Math.random() * 3000 +1000);
		Flux<Person> personList = personService.allPersons();
		
		modelView.addAttribute("personlist",personList);
		
		return "personList";
		
	}
	
}
