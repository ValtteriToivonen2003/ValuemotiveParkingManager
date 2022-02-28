package com.lemon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class PermitController {
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name", "test");
		return "hello";
		
	}

}
