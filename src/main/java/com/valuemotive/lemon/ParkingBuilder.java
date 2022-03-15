package com.valuemotive.lemon;

import com.valuemotive.lemon.ParkingException;

public class ParkingBuilder {

	private final Parking parking;

	public ParkingBuilder() {
		this.parking = new Parking();
	}

	
	public ParkingBuilder addSlots(CarTypeEnum carType, int nbSlots) {
		this.parking.initSlots(carType, nbSlots);
		return this;
	}

}
