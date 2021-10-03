package com.keytech.didemo.Repository;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository{

	@Override
	public String getSwahiliGreeting() {
		return "Habari";
	}

	@Override
	public String getEnglishGreeting() {
		return "Hi";
	}

	@Override
	public String getGermanGreeting() {
		return "Guten Morgen";
	}

}
