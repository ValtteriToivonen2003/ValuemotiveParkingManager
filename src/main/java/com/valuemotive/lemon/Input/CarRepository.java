package com.valuemotive.lemon.Input;

import java.util.HashMap;

public class CarRepository {

	public void saveCar(String regNum, String carName) {

		HashMap<String, String> carList = new HashMap<>();

		carList.put(regNum, carName);
		carList.put(regNum, carName);
		carList.put(regNum, carName);

		for (String car : carList.keySet()) {
			System.out.println("Car: " + car + carList.get(car));
		}

	}

}
