package org.raapp;

import org.raapp.model.User;
import org.raapp.model.bootstrap.BootstrapService;
import org.raapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Raapp implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
    private BootstrapService<User> userBootstrapService;

	public static void main(String[] args) {
		SpringApplication.run(Raapp.class, args);
	}

	@Override
	public void run(String... args) {

		userBootstrapService.bootstrap();

		// fetch all customers
		System.out.println("Users found with findAll():");
		System.out.println("-------------------------------");
		for (User user : userRepository.findAll()) {
			System.out.println(user);
		}
		System.out.println();
	}
}
