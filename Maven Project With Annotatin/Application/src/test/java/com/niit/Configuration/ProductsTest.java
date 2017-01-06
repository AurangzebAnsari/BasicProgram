package com.niit.Configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.ProductDAO;
import com.niit.Model.Products;

public class ProductsTest {
	
	public ProductsTest(){
		AnnotationConfigApplicationContext cont=new AnnotationConfigApplicationContext();
		cont.scan("com.niit");
		cont.refresh();
		System.out.println("success");
		
		Products product=(Products)cont.getBean("products");
		ProductDAO productdao=(ProductDAO)cont.getBean("productDAO");
		
		product.setProductId("02");
		product.setProductName("Nokia mobile");
		product.setProductModel("Model 1208");
		
		productdao.save(product);
	}

}
