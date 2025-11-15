package com.microservice.estudiantes.demoapisrest.app.services.impl;


import com.microservice.estudiantes.demoapisrest.app.entities.Manufacture;
import com.microservice.estudiantes.demoapisrest.app.persitence.IManufactureDAO;
import com.microservice.estudiantes.demoapisrest.app.services.IManufactureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class ManufactureServiceImpl implements IManufactureService {

    private final IManufactureDAO manufactureDAO;

    @Override
    @Transactional(readOnly = true)
    public Optional<Manufacture> findById(Long idManufacture) {
        return manufactureDAO.findById(idManufacture);
    }

    @Override
    public void saveManufacture(Manufacture manufacture) {
        manufactureDAO.saveManufacture(manufacture);
    }

    @Override
    public List<Manufacture> findAll() {
        return manufactureDAO.findAll();
    }

    @Override
    public void deleteById(Long idManufacture) {
        manufactureDAO.deleteById(idManufacture);
    }
}
