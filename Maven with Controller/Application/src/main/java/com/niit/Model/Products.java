package com.niit.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Products {
	
	@Id
	private String ProductId;
	private String ProductName;
	private String ProductModel;
	
	
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductModel() {
		return ProductModel;
	}
	public void setProductModel(String productModel) {
		ProductModel = productModel;
	}

}
