package com.training.vehicles.controllers;

import com.training.vehicles.entities.Vehicle;
import com.training.vehicles.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, path = "/api/vehicles")
@RestController
public class VehicleController {


    private VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    List<Vehicle> getVehicles(){
        List<Vehicle> vehicles = vehicleService.findAllVehicles();
        return vehicles;
    }

    @GetMapping(value = "/filter")
    List<Vehicle> getVehiclesByColor(@RequestParam String color){
        List<Vehicle> vehicles = vehicleService.findAllVehiclesByColor(color);
        return vehicles;
    }

    @GetMapping(value = "/{id}")
    Vehicle getVehicleById(@PathVariable Long id){
        Vehicle vehicle = vehicleService.findVehicleById(id);
        return vehicle;
    }

    @PostMapping
    Vehicle saveVehicle(@RequestBody Vehicle vehicle){
        return vehicleService.saveVehicle(vehicle);
    }

    @PostMapping(value = "/saveAll")
    List<Vehicle> saveVehicleList(@RequestBody List<Vehicle> vehicleList){
        return vehicleService.saveVehicleList(vehicleList);
    }

}
