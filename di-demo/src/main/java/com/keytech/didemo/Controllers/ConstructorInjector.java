package com.keytech.didemo.Controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.keytech.didemo.Services.GreetingService;

@Controller
public class ConstructorInjector {

	private GreetingService greetingService;

	public ConstructorInjector(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
