package com.microservice.estudiantes.demoapisrest.app.services.impl;

import com.microservice.estudiantes.demoapisrest.app.entities.Product;
import com.microservice.estudiantes.demoapisrest.app.persitence.IProductDAO;
import com.microservice.estudiantes.demoapisrest.app.services.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductServiceImpl implements IProductService {

    private final IProductDAO productDAO;

    @Override
    @Transactional(readOnly = true)
    public Optional<Product> findById(Long id) {
        return productDAO.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public void deleteById(Long id) {
        productDAO.deleteById(id);
    }

    @Override
    public void saveProdufct(Product product) {
        productDAO.saveProdufct(product);
    }

    @Override
    public List<Product> findByPriceInRange(BigDecimal min, BigDecimal max) {
        return productDAO.findByPriceInRange(min, max);
    }
}
