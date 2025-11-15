package com.microservice.estudiantes.demoapisrest.app.repository;

import com.microservice.estudiantes.demoapisrest.app.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
