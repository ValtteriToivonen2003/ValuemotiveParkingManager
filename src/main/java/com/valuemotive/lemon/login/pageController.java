package com.valuemotive.lemon.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pageController {
	
	@GetMapping("/parkingpage")
	public String ParkingPage() {
		return "ParkingPage.html";
	}
	@GetMapping("/myvehicles")
	public String myvehicles() {
		return "myvehicles.html";
	}
	
	
}