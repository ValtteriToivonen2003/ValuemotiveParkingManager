package com.valuemotive.lemon.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {
	
	@GetMapping("/")
    public String LoginPage() {
       return "LoginPage.html";
    }
	
	@GetMapping("/ParkingPage")
	public String ParkingPage() {
		return "ParkingPage.html";
		
	}
	@GetMapping("/Error")
	public String error() {
		return "Error.html";
	}
	

}