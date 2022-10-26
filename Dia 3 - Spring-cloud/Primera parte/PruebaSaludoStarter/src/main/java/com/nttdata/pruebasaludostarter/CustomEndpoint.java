package com.nttdata.pruebasaludostarter;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@RestControllerEndpoint(id = "customEndpoint")
public class CustomEndpoint {

	@GetMapping("/random")
	public ResponseEntity<String> customEndPoint() {
		return new ResponseEntity<>("Something from my controller", HttpStatus.OK);
	}
	
	@GetMapping("/randomNumberFrom/{start}/to/{end}")
	public ResponseEntity<String> customEndPoint(@PathVariable(value="start") int start, @PathVariable(value="end") int end) {
		
		String output = "";
		int rand;
		
		rand = (int) (Math.random() * (end-start) + start);
		
		output ="Your random number is: " + rand;
		
		return new ResponseEntity<>(output, HttpStatus.OK);
	}

}
