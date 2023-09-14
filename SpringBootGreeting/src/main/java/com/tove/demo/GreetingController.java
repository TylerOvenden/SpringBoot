package com.tove.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	Greeting greeting(@RequestParam(defaultValue = "Jeff") String name) {
		//counter.incrementAndGet() increment the number and then return it
	//	return new Greeting(counter.incrementAndGet(), String.format(template, name));
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	//when running call http://localhost:8080/greeting\
	//either directly into web browser or use curl in command prompt
}
