package com.msb.service.impl;


import com.msb.mapper.CarMapper;
import com.msb.pojo.Car;
import com.msb.pojo.Renting_History;
import com.msb.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMapper carMapper;
    @Override
    public List<Car> showCars() {
        List<Car> cars = carMapper.showCars();
        return cars;
    }

    @Override
    public List<Car> selectCar(List<Integer> ids) {
        List<Car> cars = carMapper.selectCar(ids);
        return cars;
    }

    @Override
    public void addRent(Renting_History renting_history) {
        carMapper.addRent(renting_history);
    }

    @Override
    public void forbiddenCars(List<Integer> ids) {
        carMapper.forbiddenCars(ids);
    }
}
