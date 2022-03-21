package com.valuemotive.lemon;

import com.valuemotive.lemon.ParkingException;

public class CarBuilder {

	private String licensePlate;

	private CarTypeEnum type;

	public CarBuilder setMatricule(String matricule) {
		this.licensePlate = matricule;
		return this;
	}

	public CarBuilder setType(CarTypeEnum type) {
		this.type = type;
		return this;
	}

	public Car build() {
		if (this.licensePlate == null) {
			throw new ParkingException("you should initialize the matricule");
		}

		if (this.type == null) {
			throw new ParkingException("you should initialize the car type");
		}
		return new Car(licensePlate, type);
	}

}
