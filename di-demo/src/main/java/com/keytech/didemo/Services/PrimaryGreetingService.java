package com.keytech.didemo.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.keytech.didemo.Repository.GreetingRepository;


public class PrimaryGreetingService implements GreetingService{

	private GreetingRepository greetingRepository;
	
	public PrimaryGreetingService(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return greetingRepository.getEnglishGreeting();
	}

}
