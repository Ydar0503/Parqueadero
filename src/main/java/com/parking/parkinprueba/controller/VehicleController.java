package com.parking.parkinprueba.controller;

import com.parking.parkinprueba.dto.VehicleDto;
import com.parking.parkinprueba.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/vehicle")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @PostMapping
    public ResponseEntity<VehicleDto> generateContract(@RequestBody VehicleDto vehicleDto) {
        VehicleDto vehicledb = vehicleService.AddVehicle(vehicleDto);

        if (vehicledb != null) {
            return new ResponseEntity<>(vehicledb, HttpStatus.OK);
        }
        else  {
            return new ResponseEntity<>(vehicledb, HttpStatus.BAD_REQUEST);
        }
    }
}
