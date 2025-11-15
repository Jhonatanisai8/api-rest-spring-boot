package com.microservice.estudiantes.demoapisrest.app.repository;

import com.microservice.estudiantes.demoapisrest.app.entities.Manufacture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufactureRepository extends CrudRepository<Manufacture, Long> {

}
