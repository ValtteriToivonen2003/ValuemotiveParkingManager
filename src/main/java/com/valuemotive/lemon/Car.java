package com.valuemotive.lemon;

import java.time.LocalDateTime;

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

	public void checkDatesAfterCheckout() {
		if (ParkingSlot.getCheckinDate() == null) {
			throw new ParkingException("the car checkin date is not set");
		}
		if (ParkingSlot.getCheckoutDate() == null) {
			throw new ParkingException("the car checkout date is not set");
		}
		if (ParkingSlot.getCheckoutDate() .isAfter(ParkingSlot.getCheckinDate())) {
			throw new ParkingException("the checkin/checkout dates are not coherent");
		}
	}

	public CarTypeEnum getType() {
		return type;
	}

	public String getlicensePlate() {
		return regNum;
	}

}
