package com.valuemotive.lemon.Input;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.valuemotive.lemon.CarTypeEnum;

@Controller
public class PageController {

	@Autowired
	private CarRepository carRepo;

	@GetMapping("/parkingpage")
	public String ParkingPage() {
		return "ParkingPage.html";
	}

	@GetMapping("/myvehicles")
	public String myvehicles(Model model) {
		model.addAttribute("cars", carRepo.findAll());
		return "MyVehicles.html";
	}

	@PostMapping("/vehicle/add")
	public String addVehicle(Model model, String regNum, String carName) {
		carRepo.saveCar(regNum, carName, CarTypeEnum.GASOLINE);
		model.addAttribute("cars", carRepo.findAll());
		return "MyVehicles.html";
	}

}
