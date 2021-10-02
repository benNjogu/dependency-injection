package com.keytech.didemo.Controllers;

import com.keytech.didemo.Services.GreetingService;

public class ConstructorInjector {

	private GreetingService greetingService;

	public ConstructorInjector(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
