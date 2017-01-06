package com.niit.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.ProductDAO;
import com.niit.Model.Products;

@Repository("productDAO")
public class ProductDAOImpl  implements ProductDAO {
	
	@Autowired
	public SessionFactory sessionFactory;
	
	public ProductDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
		System.out.println(sessionFactory);
		
	}
	@Transactional
	public List<Products> list() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Products");
		List<Products>listproducts=query.list();
		return listproducts;
	}
	@Transactional
	public Products get(String ProductId) {
           return (Products)sessionFactory.getCurrentSession().get(Products.class, ProductId);
	}
@Transactional
	public boolean save(Products p) {
		sessionFactory.getCurrentSession().save(p);
		
		return false;
	}
@Transactional
	public boolean update(Products p) {
		sessionFactory.getCurrentSession().save(p);
		return false;
	}

	

}
