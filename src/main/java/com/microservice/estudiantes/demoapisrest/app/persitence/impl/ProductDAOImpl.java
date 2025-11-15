package com.microservice.estudiantes.demoapisrest.app.persitence.impl;

import com.microservice.estudiantes.demoapisrest.app.entities.Product;
import com.microservice.estudiantes.demoapisrest.app.persitence.IProductDAO;
import com.microservice.estudiantes.demoapisrest.app.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
@Log
public class ProductDAOImpl implements IProductDAO {

    private final ProductRepository repository;

    @Override
    public Optional<Product> findById(Long id) {
        log.info("Find product by id: " + id);
        return repository.findById(id);
    }

    @Override
    public List<Product> findAll() {
        log.info("Find all products");
        log.info(repository.findAll().toString());
        return (List<Product>) repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        log.info("Delete product by id: " + id);
        repository.deleteById(id);
    }

    @Override
    public void saveProdufct(Product product) {
        log.info("Save product: " + product);
        repository.save(product);
    }

    @Override
    public List<Product> findByPriceInRange(BigDecimal min, BigDecimal max) {
        log.info("Find product by price range: " + min + " - " + max);
        return repository.findByPriceProductBetween(min, max);
    }
}
