package com.keytech.didemo.Controllers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

import com.keytech.didemo.Services.GreetingService;

@Controller
public class MyController {

	private GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}


	public String hello() {
		System.out.println("Helloooo!!!!");
		return greetingService.sayGreeting(); 
	}
	
}
