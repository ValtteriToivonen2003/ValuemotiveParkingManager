package com.valuemotive.lemon;

import com.valuemotive.lemon.ParkingException;
import com.valuemotive.lemon.ParkingSlot;

public class Car {

	private final String regNum;
	
	private final  String carName;

	private final CarTypeEnum type;

	public Car(String regNum, String carName, CarTypeEnum type) {
		super();
		this.regNum = regNum;
		this.carName = carName;
		this.type = type;
	}

	public CarTypeEnum getType() {
		return type;
	}

	public String getlicensePlate() {
		return regNum;
	}

	public String getRegNum() {
		return regNum;
	}
	
	public String getCarName() {
		return carName;
	}

}
