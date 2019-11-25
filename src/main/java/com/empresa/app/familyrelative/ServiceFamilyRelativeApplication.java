package com.empresa.app.familyrelative;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.empresa.app.familyrelative.model.dao.IFamilyRelativeDao;
import com.empresa.app.familyrelative.model.document.FamilyRelative;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class ServiceFamilyRelativeApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(ServiceFamilyRelativeApplication.class);
	@Autowired
	private IFamilyRelativeDao dao;

	public static void main(String[] args) {
		SpringApplication.run(ServiceFamilyRelativeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Flux.just(
				new FamilyRelative("Alejandro", "Toribio", "M", new Date(), "Dni", "12345678", "Padre"),
				new FamilyRelative("Maria", "Rojas", "F", new Date(), "Dni", "11223344", "Madre"),
				new FamilyRelative("Danny", "Toribio Rojas", "M", new Date(), "Dni", "11122233", "Hermano"),
				new FamilyRelative("Claudia", "Toribio Rojas", "F", new Date(), "Dni", "11112222", "Hermana"),
				new FamilyRelative("Angie", "Aparicio", "F", new Date(), "Dni", "99988877", "Esposa")
				)
		.flatMap(p -> dao.save(p))
		.subscribe(p -> log.info("Nombre:" + p.getFirstName() + " - " + p.getLastName()));

	}
	

}
