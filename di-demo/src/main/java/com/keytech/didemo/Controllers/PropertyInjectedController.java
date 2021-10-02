package com.keytech.didemo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.keytech.didemo.Services.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Autowired
	public GreetingService greetingService;
	
	public String sayHello() {
		
		return greetingService.sayGreeting();
		
	}


}
