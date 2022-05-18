package com.whdiaztorres.practicamongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.whdiaztorres.practicamongo.Repository.UserRepository;
import com.whdiaztorres.practicamongo.domain.User;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	public UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		

		
		User maria = new User(null, "Maria brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob grey", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
		
	}
	

}
