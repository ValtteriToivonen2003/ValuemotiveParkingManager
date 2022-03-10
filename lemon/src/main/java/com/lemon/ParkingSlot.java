package com.lemon;

import com.lemon.ParkingUtils;


public class ParkingSlot {


	private long number;

	private Car car;

	private boolean available;

	public ParkingSlot() {
		this.setNumber(ParkingUtils.generateId());
		this.setAvailable(true);
	}

	public long getNumber() {
		return number;
	}


	public void setNumber(long number) {
		this.number = number;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}