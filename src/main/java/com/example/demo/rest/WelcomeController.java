package com.example.demo.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.props.AppProperties;

@RestController
public class WelcomeController {
	@Autowired
	private AppProperties ap;

	@GetMapping("/welcome")
	public String welcomeMsg() {
		Map<String, String> msg = ap.getMessages();
		String msgValue = msg.get("welcomeMsg");
		return msgValue;
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		Map<String, String> msg = ap.getMessages();
		String greetVal = msg.get("greetMsg");
		return greetVal;
	}
	
	
	
	
}
