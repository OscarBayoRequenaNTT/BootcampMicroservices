package com.nttdata.bootcamp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortController {

	@Value("${server.port}")
	private String port;
	
	
	@GetMapping(path="/port")
	public String getPort() {
		return "Estas en el puerto " + port;
	}
	
}
