package com.keytech.didemo.Services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello Am from constuctor";
	}
	
}
