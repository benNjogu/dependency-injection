package com.keytech.didemo.Controllers;

import com.keytech.didemo.Services.GreetingServiceImpl;

public class ConstructorInjector {

	private GreetingServiceImpl greetingServiceImpl;

	public ConstructorInjector(GreetingServiceImpl greetingServiceImpl) {
		super();
		this.greetingServiceImpl = greetingServiceImpl;
	}
	
	String sayHello() {
		return greetingServiceImpl.sayGreeting();
	}
	
}
