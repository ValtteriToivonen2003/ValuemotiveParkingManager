package com.valuemotive.lemon.Input;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class pageController {

	private CarRepository carRepo;

	@GetMapping("/parkingpage")
	public String ParkingPage() {
		return "ParkingPage.html";
	}

	@GetMapping("/MyVehicles")
	public String myvehicles() {
		return "MyVehicles.html";
	}

	@GetMapping("/Vehicle/Add")
	public String addVehicle(Model model) {
	//	model.addAttribute("cars", cars.findAll());
		return "MyVehicles.html";
	}

}
