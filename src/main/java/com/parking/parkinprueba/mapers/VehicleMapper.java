package com.parking.parkinprueba.mapers;


import com.parking.parkinprueba.dto.VehicleDto;
import com.parking.parkinprueba.entity.VehiclesEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface VehicleMapper {

    @Mappings({
            @Mapping(source = "id",target = "id"),
            @Mapping(source = "placa", target = "placa"),
            @Mapping( source = "fechaIngreso", target = "fechaIngreso")
    })
    VehicleDto toModel(VehiclesEntity vehicleEntity);

    @InheritInverseConfiguration()
    VehiclesEntity toData(VehicleDto vehicleDto);
}
