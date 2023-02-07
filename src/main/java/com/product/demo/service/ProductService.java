package com.product.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.demo.dto.ProductDto;
import com.product.demo.entity.Product;
import com.product.demo.repository.ProductDetailsRepository;
import com.product.demo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductDetailsRepository productDetailsRepository;
	
	public void save(Product product) {
		 productRepository.saveAndFlush(product);
	}
	

}
