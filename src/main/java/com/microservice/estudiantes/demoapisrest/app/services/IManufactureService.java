package com.microservice.estudiantes.demoapisrest.app.services;

import com.microservice.estudiantes.demoapisrest.app.entities.Manufacture;

import java.util.List;
import java.util.Optional;

public interface IManufactureService {

    Optional<Manufacture> findById(Long idManufacture);

    void saveManufacture(Manufacture manufacture);

    List<Manufacture> findAll();

    void deleteById(Long idManufacture);
}
