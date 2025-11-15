package com.microservice.estudiantes.demoapisrest.app.controller.dto;

import com.microservice.estudiantes.demoapisrest.app.entities.Product;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ManufactureDTO {
    private Long idManufacture;
    private String manufacturer;
    private List<Product> productList = new ArrayList<>();

}
