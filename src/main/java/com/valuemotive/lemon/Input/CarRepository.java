package com.valuemotive.lemon.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.valuemotive.lemon.Car;
import com.valuemotive.lemon.CarTypeEnum;

@Repository
public class CarRepository {
	private static final Logger LOG = LoggerFactory.getLogger(CarRepository.class);

	private Map<String, Car> carList = new HashMap<>();

	public void saveCar(String regNum, String carName, CarTypeEnum type) {
		Car car = new Car(regNum, carName, type );
		LOG.info("Adding car: {}", car);
		carList.put(regNum, car);

	}

	public List<Car> findAll() {
		List<Car> cars = new ArrayList<Car>(carList.values());
		LOG.info("Found cars: {}", cars);
		return cars;
	}

}
