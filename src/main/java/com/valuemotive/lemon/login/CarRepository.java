package com.valuemotive.lemon.login;

import java.util.HashMap;

public class CarRepository {
	
	public void saveCar(String regNum, String carName) {
		
		HashMap<String, String> carList= new HashMap<>();
		
		carList.put(regNum, carName);
		carList.put(regNum, carName);
		carList.put(regNum, carName);
		
		for (String i : carList.keySet()) {
			System.out.println("Car: " + i + carList.get(i));
		}
		
		
		
		
	}

}
