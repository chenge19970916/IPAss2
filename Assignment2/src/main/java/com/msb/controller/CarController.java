package com.msb.controller;


import com.msb.pojo.Car;
import com.msb.pojo.Renting_History;
import com.msb.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/rent")
    @ResponseBody
    public List<Car> showCars(){
        List<Car> cars= carService.showCars();
        return cars;
    }

    @PostMapping("/selectCar")
    @ResponseBody
    public List<Car> selectCar(@RequestBody List<Integer> ids){
        System.out.println(ids);
        List<Car> cars = carService.selectCar(ids);
        return cars;
    }

    @PostMapping("/addRent")
    @ResponseBody
    public String addRent(@RequestBody Renting_History renting_history){
        carService.addRent(renting_history);
        return "Booking success!";
    }

    @PostMapping("/forbiddenCars")
    @ResponseBody
    public String forbiddenCars(@RequestBody List<Integer> ids){
        System.out.println("传过来的ids是: "+ids);
        carService.forbiddenCars(ids);
        return "forbiddenCars success!";
    }
}
