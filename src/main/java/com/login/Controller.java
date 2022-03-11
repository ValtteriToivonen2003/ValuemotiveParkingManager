package com.login;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	String index(Principal principal) {
		return principal != null ? "hello" : "homeNotSignedIn";
		
	}
}
