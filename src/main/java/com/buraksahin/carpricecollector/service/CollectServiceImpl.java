package com.buraksahin.carpricecollector.service;

import com.buraksahin.carpricecollector.domain.entity.Car;
import com.buraksahin.carpricecollector.domain.request.CollectRequest;
import com.buraksahin.carpricecollector.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CollectServiceImpl implements CollectService{
    CarRepository carRepository;

    @Autowired
    public CollectServiceImpl(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    @Override
    public String createCarCollection(CollectRequest collectRequest) {
        List<Car> cars = collectRequest.getCars()
                .stream()
                .map(car -> new Car(car.getModel(),car.getPrice(), car.getKm(), car.getColor(), car.getYear(), car.getListingDate(), car.getListingProvince(), car.getListingDistinct()))
                .collect(Collectors.toList());
        carRepository.saveAll(cars);
        return "ok";
    }
}
