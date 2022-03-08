package com.lemon;

public class ParkingException extends IllegalArgumentException {

	private static final long serialVersionUID = 1L;

	
	public ParkingException(String errorMessage) {
		super(errorMessage);
	}
}
