package com.parking.parkinprueba.repository;


import com.parking.parkinprueba.entity.VehiclesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository  extends JpaRepository<VehiclesEntity, Long> {



    VehiclesEntity findByPlaca(String placa);

}
