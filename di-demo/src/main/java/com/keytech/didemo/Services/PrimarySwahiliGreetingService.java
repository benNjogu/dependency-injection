package com.keytech.didemo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.keytech.didemo.Repository.GreetingRepository;

@Service
@Primary
@Profile({"sw", "default"})
public class PrimarySwahiliGreetingService implements GreetingService{

	@Autowired
	private GreetingRepository greetingRepository;

	@Override
	public String sayGreeting() {
		return greetingRepository.getSwahiliGreeting();
	}

}
