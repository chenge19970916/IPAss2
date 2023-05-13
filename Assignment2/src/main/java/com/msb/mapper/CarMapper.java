package com.msb.mapper;


import com.msb.pojo.Car;
import com.msb.pojo.Renting_History;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CarMapper {
    List<Car> showCars();

    List<Car> selectCar(@Param("ids") List<Integer> ids);

    void addRent(Renting_History renting_history);

    void forbiddenCars(@Param("ids") List<Integer> ids);
}
