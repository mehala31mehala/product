package com.product.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.demo.dto.ProductDto;
import com.product.demo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID>{

	
}
