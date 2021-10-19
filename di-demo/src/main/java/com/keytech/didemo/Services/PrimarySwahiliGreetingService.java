package com.keytech.didemo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.keytech.didemo.Repository.GreetingRepository;

public class PrimarySwahiliGreetingService implements GreetingService{

	private GreetingRepository greetingRepository;
	
	
	public PrimarySwahiliGreetingService(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}



	@Override
	public String sayGreeting() {
		return greetingRepository.getSwahiliGreeting();
	}

}
