package com.microservice.estudiantes.demoapisrest.app.controller;

import com.microservice.estudiantes.demoapisrest.app.controller.dto.ManufactureDTO;
import com.microservice.estudiantes.demoapisrest.app.entities.Manufacture;
import com.microservice.estudiantes.demoapisrest.app.services.IManufactureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/manufacture")
@RequiredArgsConstructor
public class ManufactureController {

    private final IManufactureService manufactureService;

    @RequestMapping(path = "/find/{idManufacture}", method = RequestMethod.GET)
    public ResponseEntity<?> findById(@PathVariable Long idManufacture) {
        Optional<Manufacture> manufactureOptional = manufactureService.findById(idManufacture);
        if (manufactureOptional.isPresent()) {
            Manufacture manufacture = manufactureOptional.get();
            ManufactureDTO manufactureDTO = ManufactureDTO.builder()
                    .idManufacture(manufacture.getIdManufacture())
                    .manufacturer(manufacture.getManufacturer())
                    .productList(manufacture.getProductList())
                    .build();
            return ResponseEntity.ok(manufactureDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @RequestMapping(path = "/find-all", method = RequestMethod.GET)
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(manufactureService.findAll().stream()
                .map(manufacture ->
                        ManufactureDTO.builder()
                                .idManufacture(manufacture.getIdManufacture())
                                .manufacturer(manufacture.getManufacturer())
                                .productList(manufacture.getProductList())
                                .build()
                ).toList());
    }
}
