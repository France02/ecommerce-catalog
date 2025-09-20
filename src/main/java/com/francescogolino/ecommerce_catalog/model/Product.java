package com.francescogolino.ecommerce_catalog.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;
    private String imgUrl;
}
