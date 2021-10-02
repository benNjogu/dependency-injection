package com.keytech.didemo.Controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String hello() {
		System.out.println("Helloooo!!!!");
		return "hello";
	}
	
}
