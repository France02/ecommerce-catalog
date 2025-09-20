package com.francescogolino.ecommerce_catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.francescogolino.ecommerce_catalog.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
