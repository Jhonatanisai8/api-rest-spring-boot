package com.microservice.estudiantes.demoapisrest.app.repository;

import com.microservice.estudiantes.demoapisrest.app.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    @Query(value = "select p from Product p WHERE p.priceProduct >= ?1 and p.priceProduct <= ?2")
    List<Product> findByPriceInRange(BigDecimal min, BigDecimal max);

    List<Product> findByPriceProductBetween(BigDecimal min, BigDecimal max);
}
