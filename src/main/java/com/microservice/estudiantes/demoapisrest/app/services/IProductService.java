package com.microservice.estudiantes.demoapisrest.app.services;

import com.microservice.estudiantes.demoapisrest.app.entities.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


public interface IProductService {
    Optional<Product> findById(Long id);

    List<Product> findAll();

    void deleteById(Long id);

    void saveProdufct(Product product);

    List<Product> findByPriceInRange(BigDecimal min, BigDecimal max);
}
