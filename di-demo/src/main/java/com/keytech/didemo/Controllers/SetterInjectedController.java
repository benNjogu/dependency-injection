package com.keytech.didemo.Controllers;

import com.keytech.didemo.Services.GreetingService;

public class SetterInjectedController {

	private GreetingService greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
}
