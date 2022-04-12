package com.valuemotive.lemon;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Parking {

	private static final Logger LOGGER = LoggerFactory.getLogger(Parking.class);

	private final Map<CarTypeEnum, List<ParkingSlot>> nbSlot = new HashMap<>();

	public void initSlots(CarTypeEnum type, long nbSlot) throws ParkingException {
		if (nbSlot < 0) {
			throw new ParkingException("invalid slot number");
		}

		List<ParkingSlot> slot = Stream.generate(ParkingSlot::new).limit(nbSlot).collect(Collectors.toList());
		this.getNbSlot().put(type, slot);
	}

	public String checkin(Car car) {
		Optional<ParkingSlot> slot = ParkingManager.getFirstAvailableSlot(this.getNbSlot().get(car.getType()));
		slot.ifPresent(s -> {
			ParkingSlot.setCheckinDate(LocalDateTime.now());
			s.setAvailable(false);
			s.setCar(car);
			LOGGER.info("car <{}> checked in on slot number <{}>", car.getlicensePlate(), s.getNumber());
		
			});
		return "succeeded";
	}

	public String checkout(Car car) {
		Optional<ParkingSlot> slot = ParkingManager.getSlotByCar(this.getNbSlot().get(car.getType()), car);
		slot.ifPresent(s -> {
			ParkingSlot.setCheckoutDate(LocalDateTime.now());
			s.setAvailable(true);
			s.setCar(null);
		});
		 return "true";

	}

	public long selectAllAvailableSlots(CarTypeEnum type) {
		return ParkingManager.selectAvailableSlots(this.getNbSlot().get(type));
	}

	public Map<CarTypeEnum, List<ParkingSlot>> getNbSlot() {
		return nbSlot;
	}

}
