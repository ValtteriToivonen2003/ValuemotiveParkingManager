package com.valuemotive.lemon;

import java.time.LocalDateTime;

public class ParkingSlot {
	
	private LocalDateTime CheckinDate;
	
	private LocalDateTime CheckoutDate;

	private long number;

	private Car car;

	private boolean available;

	public ParkingSlot() {
		
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
	
	public static Object getCheckinDate() {
		return null;
	}
	public static Object getCheckoutDate() {
		return null;
	}

	public static void setCheckoutDate(LocalDateTime now) {
		
	}
	public static void setCheckinDate(LocalDateTime now) {
		
		
	}
	
	

}

