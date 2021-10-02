package com.keytech.didemo.Controllers;

import org.springframework.stereotype.Controller;

import com.keytech.didemo.Services.GreetingService;

@Controller
public class ConstructorInjector {

	private GreetingService greetingService;

	public ConstructorInjector(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
