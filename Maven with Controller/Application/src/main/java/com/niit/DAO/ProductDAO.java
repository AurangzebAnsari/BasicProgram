package com.niit.DAO;

import java.util.List;

import com.niit.Model.Products;

public interface ProductDAO {
	
	public List<Products> list();

	public Products get(String ProductId);
	
	public boolean save(Products p);
	
	public boolean update(Products p);
}
