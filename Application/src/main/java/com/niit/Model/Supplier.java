package com.niit.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Supplier {
	
	@Id
	private String SupplierId;
	private String SupplierName;
	private String SupplierAddress;
	private String SupplierPhoneNo;
	private String SupplierMail;
	
	
	public String getSupplierName() {
		return SupplierName;
	}
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}
	public String getSupplierId() {
		return SupplierId;
	}
	public void setSupplierId(String supplierId) {
		SupplierId = supplierId;
	}
	public String getSupplierAddress() {
		return SupplierAddress;
	}
	public void setSupplierAddress(String supplierAddress) {
		SupplierAddress = supplierAddress;
	}
	public String getSupplierPhoneNo() {
		return SupplierPhoneNo;
	}
	public void setSupplierPhoneNo(String supplierPhoneNo) {
		SupplierPhoneNo = supplierPhoneNo;
	}
	public String getSupplierMail() {
		return SupplierMail;
	}
	public void setSupplierMail(String supplierMail) {
		SupplierMail = supplierMail;
	}

}
