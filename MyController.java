package com.ValtteriT.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	@GetMapping
	public String Hello() {
		return "Hello World!";
	}

}
