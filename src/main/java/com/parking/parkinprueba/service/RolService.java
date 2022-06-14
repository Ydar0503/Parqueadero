package com.parking.parkinprueba.service;


import com.parking.parkinprueba.dto.RolDto;
import com.parking.parkinprueba.entity.RolEntity;
import com.parking.parkinprueba.mapers.RolMapper;
import com.parking.parkinprueba.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService {

    @Autowired
    RolRepository rolRepository;
    @Autowired
    RolMapper rolMapper;

    public RolDto AddRol(RolDto rolDto){

        rolDto.setRolAdmin(false);
                RolEntity rolEntity = rolMapper.toData(rolDto);

        return rolMapper.toModel(rolRepository.save(rolEntity));

    }




}
