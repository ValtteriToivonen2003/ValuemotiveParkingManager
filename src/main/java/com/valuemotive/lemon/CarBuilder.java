package com.valuemotive.lemon;

import com.valuemotive.lemon.ParkingException;

public class CarBuilder {

	private String matricule;

	private CarTypeEnum type;

	public CarBuilder setMatricule(String matricule) {
		this.matricule = matricule;
		return this;
	}

	public CarBuilder setType(CarTypeEnum type) {
		this.type = type;
		return this;
	}

	public Car build() {
		if (this.matricule == null) {
			throw new ParkingException("you should initialize the matricule");
		}

		if (this.type == null) {
			throw new ParkingException("you should initialize the car type");
		}
		return new Car(matricule, type);
	}

}
