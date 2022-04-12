package com.valuemotive.lemon;

public class ParkingException extends Exception {

	private static final long serialVersionUID = 1L;

	public ParkingException(String errorMessage) {
		super(errorMessage);
	}
}
