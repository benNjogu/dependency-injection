package com.keytech.didemo.Services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		
		return "Hello-I actually am from setter";
	}

}
