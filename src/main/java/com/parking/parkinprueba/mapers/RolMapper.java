package com.parking.parkinprueba.mapers;

import com.parking.parkinprueba.dto.RolDto;
import com.parking.parkinprueba.entity.RolEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface RolMapper {
    @Mappings({
            @Mapping(source = "id",target = "id"),
            @Mapping(source = "email",target = "email"),
            @Mapping(source = "password",target = "password"),
            @Mapping(source = "rolAdmin",target = "rolAdmin")

    })
    RolDto toModel(RolEntity rolEntity);
    @InheritInverseConfiguration
    RolEntity toData(RolDto rolDto);


}
