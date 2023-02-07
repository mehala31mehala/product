package com.product.demo.entity;

import java.util.UUID;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product_details")
public class ProductDetails {
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	 
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;
	
	@Column(name="product_quantity")
	private double quantity;
	
	@Column(name="purchase_rate")
	private double purchaseRate;
	
	@Column(name="sales_rate")
	private double salesRate;
	
	@Column(name="discount")
	private String discount;
	
	
	@Column(name="total_amount")
	private double totalAmount;

}
