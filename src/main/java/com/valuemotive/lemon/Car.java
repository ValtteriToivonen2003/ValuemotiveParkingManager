package com.valuemotive.lemon;

import com.valuemotive.lemon.ParkingException;
import com.valuemotive.lemon.ParkingSlot;

public class Car {

	private final String regNum;

	private final CarTypeEnum type;

	public Car(String regNum, CarTypeEnum type) {
		super();
		this.regNum = regNum;
		this.type = type;
	}

	public CarTypeEnum getType() {
		return type;
	}

	public String getlicensePlate() {
		return regNum;
	}

}
