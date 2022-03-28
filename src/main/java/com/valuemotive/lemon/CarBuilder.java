package com.valuemotive.lemon;

import com.valuemotive.lemon.ParkingException;

public class CarBuilder {

	private String regNum;

	private CarTypeEnum type;

	public CarBuilder setregNum(String regNum) {
		this.regNum = regNum;
		return this;
	}

	public CarBuilder setType(CarTypeEnum type) {
		this.type = type;
		return this;
	}

	public Car build() {
		if (this.regNum == null) {
			throw new ParkingException("you should initialize the Register number");
		}

		if (this.type == null) {
			throw new ParkingException("you should initialize the car type");
		}
		return new Car(regNum, type);
	}

}
