package com.microservice.estudiantes.demoapisrest.app.persitence.impl;

import com.microservice.estudiantes.demoapisrest.app.entities.Manufacture;
import com.microservice.estudiantes.demoapisrest.app.persitence.IManufactureDAO;
import com.microservice.estudiantes.demoapisrest.app.repository.ManufactureRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
@Log
public class ManufactureDAOImpl implements IManufactureDAO {

    private final ManufactureRepository repository;

    @Override
    public Optional<Manufacture> findById(Long idManufacture) {
        log.info("Find Manufacture by id: " + idManufacture);
        return repository.findById(idManufacture);
    }

    @Override
    public void saveManufacture(Manufacture manufacture) {
        log.info("Save Manufacture: " + manufacture);
        repository.save(manufacture);
    }

    @Override
    public List<Manufacture> findAll() {
        log.info("Find All Manufactures");
        log.info(repository.findAll().toString());
        return (List<Manufacture>) repository.findAll();
    }

    @Override
    public void deleteById(Long idManufacture) {
        log.warning("Delete Manufacture by id: " + idManufacture);
        repository.deleteById(idManufacture);
    }
}
