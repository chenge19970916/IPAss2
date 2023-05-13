package com.msb.service;

import com.msb.pojo.Car;
import com.msb.pojo.Renting_History;

import java.util.List;

public interface CarService {
    List<Car> showCars();

    List<Car> selectCar(List<Integer> ids);

    void addRent(Renting_History renting_history);

    void forbiddenCars(List<Integer> ids);
}
