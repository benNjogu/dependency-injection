package com.keytech.didemo.Services;

import com.keytech.didemo.Repository.GreetingRepository;

public class GreetingServiceFactory {

	private GreetingRepository greetingRepository;

	public GreetingServiceFactory(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}

	public GreetingService createGreetingService(String lang) {
		switch (lang) {
		case "en":
			return new PrimaryGreetingService(greetingRepository);

		case "de":
			return new PrimaryGermanGreetingService(greetingRepository);
			
		case "sw":
			return new PrimarySwahiliGreetingService(greetingRepository);

		default:
			return new PrimarySwahiliGreetingService(greetingRepository);
		}
	}

}
