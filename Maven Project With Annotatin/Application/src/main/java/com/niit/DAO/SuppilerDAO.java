package com.niit.DAO;

import java.util.List;

import com.niit.Model.Supplier;

public interface SuppilerDAO {
	
	public List<Supplier>list();
	
	public Supplier get(String SupplierId);
	
	public boolean save(Supplier s);
	
	public boolean update(Supplier s);

}
