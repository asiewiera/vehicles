package com.training.vehicles.services;

import com.training.vehicles.entities.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;



@SpringBootTest
class VehicleServiceImplTest {

    @Autowired
    VehicleService vehicleService;

    @Test
    void findAllVehicles() {
        List<Vehicle> vehicles = vehicleService.findAllVehicles();
        System.out.println(vehicles);
        Assert.notEmpty(vehicles, "Vehicles List is not empty");
    }

    @Test
    void findVehicleById() {
    }
}