package com.niit.Configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.SuppilerDAO;
import com.niit.DAOImpl.SupplierDAOImpl;
import com.niit.Model.Supplier;

public class SupplierTest {
	
	public SupplierTest(){
		AnnotationConfigApplicationContext annot=new AnnotationConfigApplicationContext();
		annot.scan("com.niit");
		annot.refresh();
		
		Supplier supplier=(Supplier)annot.getBean("supplier");
		SuppilerDAO Supplierdao=(SuppilerDAO)annot.getBean("supplierDAO");
		
		supplier.setSupplierId("02");
		supplier.setSupplierName("Amit Kumar");
		supplier.setSupplierMail("amit234@gmail.com");
		supplier.setSupplierPhoneNo("+919590548494");
		supplier.setSupplierAddress("Bangalore jayanager 4th block");
		
		Supplierdao.save(supplier);
	}

}
