package com.nttdata.consumelibreria;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nttdata.saludoidioma.SaludoIdioma;

@Configuration
@ConditionalOnClass(SaludoIdioma.class)
@EnableConfigurationProperties(SaludoProperties.class)
public class SaludoAutoConfigure {

	private final SaludoProperties properties;
	
	public SaludoAutoConfigure(SaludoProperties properties) {
		this.properties = properties;
	}
	
	@Bean
	public SaludoIdioma saludo() {
		return new SaludoIdioma(properties.getIdioma());
	}
	
}
