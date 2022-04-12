package com.valuemotive.lemon;

import java.util.List;
import java.util.Optional;

public class ParkingManager {

	public static final Optional<ParkingSlot> getFirstAvailableSlot(List<ParkingSlot> slotList) {
		return slotList.stream().filter(ParkingSlot::isAvailable).findFirst();

	}

	public static final Optional<ParkingSlot> getSlotByCar(List<ParkingSlot> slotList, Car car) {
		if (slotList == null || car == null) {
			return Optional.empty();
		}
		return slotList.stream().filter(s -> s.getCar().getlicensePlate().equals(car.getlicensePlate())).findFirst();

	}

	public static final long selectAvailableSlots(List<ParkingSlot> slotList) {
		if (slotList == null) {
			return 0;
		}
		return slotList.stream().filter(ParkingSlot::isAvailable).count();

	}
}
