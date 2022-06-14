package com.parking.parkinprueba.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name = "Vehicles" ,
        indexes = {@Index(name = "placa_index", columnList = "placa",unique = true)})
public class VehiclesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(nullable = false, length = 6)
    private String placa;
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}

