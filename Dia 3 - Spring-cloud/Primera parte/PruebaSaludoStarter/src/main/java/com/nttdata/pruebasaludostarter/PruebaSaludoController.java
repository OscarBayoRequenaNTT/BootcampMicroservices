package com.nttdata.pruebasaludostarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.saludoidioma.SaludoIdioma;

@RestController
public class PruebaSaludoController {
	
	@Autowired
	private SaludoIdioma saludo;
	
	@GetMapping(path="/prueba")
	public String pruebaSaludo() {
		return saludo.mensajeSaludo();
	}
	
}
