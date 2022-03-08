package com.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String login() {
		return"Please login";
		
	}
	
	@GetMapping("/redirect")
	public String redirect() {
		return"You have succesfully logged in!";
		
	}

}
