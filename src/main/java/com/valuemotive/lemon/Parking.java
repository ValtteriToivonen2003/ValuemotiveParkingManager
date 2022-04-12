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
	
	private ParkingManager parkingManager ;

	private Map<CarTypeEnum, List<ParkingSlot>> nbSlotMap;

	public void initSlots(CarTypeEnum type, long nbSlot) throws ParkingException {
		if (nbSlot < 0) {
			throw new ParkingException("invalid slot number");
		}

		List<ParkingSlot> slot = Stream.generate(ParkingSlot::new).limit(nbSlot).collect(Collectors.toList());
		this.getNbSlot().put(type, slot);
	}

	public String checkin(Car car) {
		Optional<ParkingSlot> slot = parkingManager.getFirstAvailableSlot(this.getNbSlot().get(car.getType()));
		slot.ifPresent(s -> {
			parkingManager.setCheckinDate(LocalDateTime.now());
			s.setAvailable(false);
			s.setCar(car);
			LOGGER.info("car <{}> checked in on slot number <{}>", car.getlicensePlate(), s.getNumber());

		});
		return "succeeded";
	}

	public void checkout(Car car) {
		Optional<ParkingSlot> slot = parkingManager.getSlotByCar(this.getNbSlot().get(car.getType()), car);
		slot.ifPresent(s -> {
			parkingManager.setCheckoutDate(LocalDateTime.now());
			s.setAvailable(true);
			s.setCar(null);
		});
	

	}

	public long selectAllAvailableSlots(CarTypeEnum type) {
		return parkingManager.selectAvailableSlots(this.getNbSlot().get(type));
	}

	public Map<CarTypeEnum, List<ParkingSlot>> getNbSlot() {
		return nbSlot;
	}

}
