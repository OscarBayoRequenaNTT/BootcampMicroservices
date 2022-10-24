package com.example.retoconfigservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetoServiceController {
	
	@Value("${student.name}")
	private String name;
	@Value("${student.surnames}")
	private String surnames;
	@Value("${student.birthdate}")
	private String birthdate;
	
	
	@GetMapping(path = "/getName")
	public String getName() {
		return "El nombre es: " + this.name;
	}
	
	@GetMapping(path = "/getSurnames")
	public String getSurnames() {
		return "Los apellidos son: " + this.surnames;
	}
	
	@GetMapping(path = "/getBirthdate")
	public String getBirthdate() {
		return "La fecha de nacimiento es: " + this.birthdate;
	}
}
