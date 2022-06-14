package com.parking.parkinprueba.service;

import com.parking.parkinprueba.dto.VehicleDto;
import com.parking.parkinprueba.entity.VehiclesEntity;
import com.parking.parkinprueba.mapers.VehicleMapper;
import com.parking.parkinprueba.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    @Autowired
    VehicleMapper vehicleMapper;



    public VehicleDto AddVehicle(VehicleDto vehicleDto){


        VehiclesEntity vehicledb = vehicleRepository.findByPlaca(vehicleDto.getPlaca());

        if (vehicledb == null) {
            VehiclesEntity vehiclesEntity = vehicleMapper.toData(vehicleDto);

            return vehicleMapper.toModel(vehicleRepository.save(vehiclesEntity));


        }

        return null;
    }

//Funciones


   /* public List<VehiclesEntity> vehiclesEntities() {

        return vehicleRepository.findAll();
    }


    public VehicleDto removeVehicle(VehicleDto vehicleDto){

        var vehicledb = vehicleRepository.findByPlaca(vehicleDto.getPlaca());

        if (vehicleDto.equals(vehicledb.getPlaca())){

            var  vehiclesEntity = vehicleMapper.toData(vehicleDto);

            return vehicleMapper.toModel(vehicleRepository.delete());

        }
        return  null;
    }


    public  VehicleDto getVehicle(VehicleDto vehicleDto){


        var vehicledb = vehicleRepository.findByPlaca(vehicleDto.getPlaca());


        if (vehicleDto.equals(vehicledb.getPlaca())){

            var  vehiclesEntity = vehicleMapper.toData(vehicleDto);

            return vehicleMapper.toModel(vehicleRepository.findByPlaca(vehicleDto.getPlaca().toString()));

        }

        return  null;
    }*/

}