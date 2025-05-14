package com.ecomm.Product_service.repository;

import com.ecomm.Product_service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}