package com.valuemotive.lemon.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {
	
	@GetMapping("/")
    public String LoginPage() {
        return "LoginPage.html";
    }
}