package com.nttdata.patronesdediseno;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.patronesdediseno.builder.Director;
import com.nttdata.patronesdediseno.builder.PersonBuilder;
import com.nttdata.patronesdediseno.singleton.Person;
import com.nttdata.patronesdediseno.singleton.PersonSingletonEmbedded;

/**
 * 
 * @author Óscar Bayo Requena
 *
 */
@SpringBootApplication
public class PatronesDeDisenoApplication  implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(PatronesDeDisenoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Singleton
		PersonSingletonEmbedded.getInstance().setName("Jeffry");
		PersonSingletonEmbedded.getInstance().setAge(32);
		
		System.out.println(PersonSingletonEmbedded.getInstance().toString());
		
		PersonSingletonEmbedded.getInstance().setName("Adonis");

		System.out.println(PersonSingletonEmbedded.getInstance().toString()+"\n\n");
		
		
		
		//Builder
		Director direc = new Director();
		
		PersonBuilder pBuilder = new PersonBuilder();
		
		direc.constructMan(pBuilder);
		Person genericMan = pBuilder.build();
		
		System.out.println(genericMan.toString());
		
		direc.constructWoman(pBuilder);
		Person genericWoman = pBuilder.build();
		
		System.out.println(genericWoman.toString());
		
		direc.constructJeffry(pBuilder);
		Person jeffry = pBuilder.build();
		
		System.out.println(jeffry.toString());
		
	}

}
