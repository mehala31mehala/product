package com.product.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.demo.dto.ProductDto;
import com.product.demo.entity.Product;
import com.product.demo.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	public ProductService productService;
	
	@PostMapping("/product")
	private void save(@RequestBody Product product) {
		productService.save(product);
		
	}
	
}
