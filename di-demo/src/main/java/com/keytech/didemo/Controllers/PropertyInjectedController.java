package com.keytech.didemo.Controllers;

import com.keytech.didemo.Services.GreetingServiceImpl;

public class PropertyInjectedController {
	
	public GreetingServiceImpl greetingServiceImpl;
	
	String sayHello() {
		
		return greetingServiceImpl.sayGreeting();
		
	}


}
