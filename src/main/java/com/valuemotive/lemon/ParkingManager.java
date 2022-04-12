package com.valuemotive.lemon;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class ParkingManager {

	private LocalDateTime CheckinDate;

	private LocalDateTime CheckoutDate;

	public Optional<ParkingSlot> getFirstAvailableSlot(List<ParkingSlot> slotList) {
		return slotList.stream().filter(ParkingSlot::isAvailable).findFirst();

	}

	public Optional<ParkingSlot> getSlotByCar(List<ParkingSlot> slotList, Car car) {
		if (slotList == null || car == null) {
			return Optional.empty();
		}
		return slotList.stream().filter(s -> s.getCar().getlicensePlate().equals(car.getlicensePlate())).findFirst();

	}

	public long selectAvailableSlots(List<ParkingSlot> slotList) {
		if (slotList == null) {
			return 0;
		}
		return slotList.stream().filter(ParkingSlot::isAvailable).count();

	}

	public void checkDatesAfterCheckout() throws ParkingException {
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
		return null;
	}

	public LocalDateTime getCheckoutDate() {
		return null;
	}

	public void setCheckinDate(LocalDateTime now) {

	}

	public void setCheckoutDate(LocalDateTime now) {

	}
}
