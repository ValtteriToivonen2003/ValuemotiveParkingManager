package com.valuemotive.lemon;

import java.time.LocalDateTime;

import com.valuemotive.lemon.ParkingException;

public class Car {

	private final String licensePlate;

	private final CarTypeEnum type;

	private LocalDateTime checkinDate;

	private LocalDateTime checkoutDate;

	public Car(String licensePlate, CarTypeEnum type) {
		super();
		this.licensePlate = licensePlate;
		this.type = type;
	}

	public static CarBuilder builder() {
		return new CarBuilder();
	}

	public void checkDatesAfterCheckout() {
		if (this.getCheckinDate() == null) {
			throw new ParkingException("the car checkin date is not set");
		}
		if (this.getCheckoutDate() == null) {
			throw new ParkingException("the car checkout date is not set");
		}
		if (this.getCheckinDate().isAfter(this.getCheckoutDate())) {
			throw new ParkingException("the checkin/checkout dates are not coherent");
		}
	}

	public LocalDateTime getCheckinDate() {
		return checkinDate;
	}

	
	public void setCheckinDate(LocalDateTime checkinDate) {
		this.checkinDate = checkinDate;
	}

	public LocalDateTime getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(LocalDateTime checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public CarTypeEnum getType() {
		return type;
	}

	public String getlicensePlate() {
		return licensePlate;
	}

}
