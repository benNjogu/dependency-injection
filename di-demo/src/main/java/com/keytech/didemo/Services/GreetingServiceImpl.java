package com.keytech.didemo.Services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

	public static final String HELLO_EVANGELISTS = "Hello evangelists";

	@Override
	public String sayGreeting() {
		
		return HELLO_EVANGELISTS;
	}
	
	
	
}
