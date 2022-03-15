package com.lemon;


import java.util.List;
import java.util.Optional;
import java.util.Random;

import com.lemon.Car;
import com.lemon.ParkingSlot;

public class ParkingManager {

	private static final Random random = new Random(System.currentTimeMillis());

	public static int generateId() {
		return Math.abs(random.nextInt());
	}
	public static final Optional<ParkingSlot> getFirstAvailableSlot(List<ParkingSlot> slotList) {
		if (slotList == null) {
			return Optional.empty();
		}
		return slotList.stream().filter(ParkingSlot::isAvailable).findFirst();

	}

	public static final Optional<ParkingSlot> getSlotByCar(List<ParkingSlot> slotList, Car car) {
		if (slotList == null || car == null) {
			return Optional.empty();
		}
		return slotList.stream().filter(s -> s.getCar().getMatricule().equals(car.getMatricule())).findFirst();

	}

	public static final long selectAvailableSlots(List<ParkingSlot> slotList) {
		if (slotList == null) {
			return 0;
		}
		return slotList.stream().filter(ParkingSlot::isAvailable).count();

	}
}
