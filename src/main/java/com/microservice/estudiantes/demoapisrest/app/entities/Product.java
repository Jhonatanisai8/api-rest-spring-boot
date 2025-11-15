package com.microservice.estudiantes.demoapisrest.app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "producto")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    @Column(name = "nombre_producto")
    private String nameProduct;

    @Column(name = "precio_producto")
    private BigDecimal priceProduct;

    @ManyToOne
    @JoinColumn(name = "id_fabricante", nullable = false)
    private Manufacture manufacture;
}
