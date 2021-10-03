package com.keytech.didemo.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"sw", "default"})
public class PrimarySwahiliGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Waambaje";
	}

}
