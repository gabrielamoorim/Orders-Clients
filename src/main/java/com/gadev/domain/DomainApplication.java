package com.gadev.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gadev.domain.entities.Client;
import com.gadev.domain.repositories.ClientRepository;

@SpringBootApplication
public class DomainApplication implements CommandLineRunner {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DomainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Client c1 = new Client(null, "Alex Green", "Alex@gmail.com");
		
		clientRepository.save(c1);
	}

}
