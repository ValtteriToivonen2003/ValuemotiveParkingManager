package com.valuemotive.lemon.login;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class pageController {
	
	private CarRepository carRepo ;
	
	@GetMapping("/parkingpage")
	public String ParkingPage() {
		return "ParkingPage.html";
	}
	@GetMapping("/myvehicles")
	public String myvehicles() {
		return "myvehicles.html";
	}
	
	@PostMapping(path="/vehicle/add" , consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String addvehicle(@RequestBody Input input) {
		
		return "myvehicles.html";
	}
	
	
}