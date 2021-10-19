package com.keytech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.keytech.didemo.Repository.GreetingRepository;
import com.keytech.didemo.Services.GreetingService;
import com.keytech.didemo.Services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {

	@Bean
	GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
		
		return new GreetingServiceFactory(greetingRepository);	
	}
	
	@Bean
	@Primary
	@Profile({"sw", "default"})
	GreetingService primarySwahiliGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("sw");
	}
	
	@Bean
	@Primary
	@Profile("en")
	GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("en");
	}
	
	@Bean
	@Primary
	@Profile("de")
	GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("de");
	}
	
}
