package com.nttdata.bootcamp.configservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductTestController {

	@Value("${product.product-name}")
	private String producto;
	
	@GetMapping(path="/getProduct")
	public String getProduct() {
		return this.producto;
	}
	
}
