package com.msb.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private Integer id;
    private String Category;
    private String Availability;
    private String Brand;
    private String Model;
    private Integer Modelyear;
    private Integer Mileage;
    private String Fueltype;
    private Integer Seats;
    private String Priceday;
    private String Description;
}
