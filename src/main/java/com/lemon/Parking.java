package com.lemon;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lemon.ParkingException;
import com.lemon.ParkingUtils;

public class Parking {

	private static final Logger LOGGER = LoggerFactory.getLogger(Parking.class);

	private Map<CarTypeEnum, List<ParkingSlot>> nbSlot;


	public static ParkingBuilder builder() {
		return new ParkingBuilder();
	}

	public void initSlots(CarTypeEnum type, long nbSlots) {
		if (nbSlots < 0) {
			throw new ParkingException("invalid slots number");
		}

		List<ParkingSlot> slots = Stream.generate(ParkingSlot::new).limit(nbSlots).collect(Collectors.toList());
		this.getNbSlot().put(type, slots);
	}
	
	public Optional<ParkingSlot> checkin(Car car) {
		Optional<ParkingSlot> slot = ParkingUtils.getFirstAvailableSlot(this.getNbSlot().get(car.getType()));
		slot.ifPresent(s -> {
			car.setCheckinDate(LocalDateTime.now());
			s.setAvailable(false);
			s.setCar(car);
			LOGGER.info("car <{}> checked in on slot number <{}>", car.getMatricule(), s.getNumber());
		});
		return slot;
	}

	public double checkout(Car car) {
		Optional<ParkingSlot> slot = ParkingUtils.getSlotByCar(this.getNbSlot().get(car.getType()), car);
		slot.ifPresent(s -> {
			car.setCheckoutDate(LocalDateTime.now());
			s.setAvailable(true);
			s.setCar(null);
		});
		return 0;

	}

	public long selectAllAvailableSlots(CarTypeEnum type) {
		return ParkingUtils.selectAvailableSlots(this.getNbSlot().get(type));
	}

	


	public Map<CarTypeEnum, List<ParkingSlot>> getNbSlot() {
		if (this.nbSlot == null) {
			this.setNbSlot(new HashMap<>());
		}
		return nbSlot;
	}

	public void setNbSlot(Map<CarTypeEnum, List<ParkingSlot>> nbSlot) {
		this.nbSlot = nbSlot;
	}

}
