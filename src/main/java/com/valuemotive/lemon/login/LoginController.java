package com.valuemotive.lemon.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/")
    public String LoginPage() {
       return "LoginPage";
    }
	
	@GetMapping("/parkingpage")
	public String ParkingPage() {
		return "ParkingPage.html";
	}
	@GetMapping("/myvehicles")
	public String myvehicles() {
		return "myvehicles.html";
	}
	
	@GetMapping("/error")
	public String error() {
		return "Error.html";
	}
	
}