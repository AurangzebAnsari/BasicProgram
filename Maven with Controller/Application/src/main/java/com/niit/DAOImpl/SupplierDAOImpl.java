package com.niit.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.SuppilerDAO;
import com.niit.Model.Supplier;

@Repository("supplierDAO")
public class SupplierDAOImpl implements SuppilerDAO {
	
	@Autowired
	public SessionFactory sessionFactory;
	
	public SupplierDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
		System.out.println(sessionFactory);
	}
	
	@Transactional
	public List<Supplier> list() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Supplier");
		List<Supplier>listsupplier=query.list();
		
		return listsupplier;
	}
	@Transactional
	public Supplier get(String SupplierId) {
		return(Supplier)sessionFactory.getCurrentSession().get(Supplier.class,SupplierId);
		
	}
	@Transactional
	public boolean save(Supplier s) {
		sessionFactory.getCurrentSession().save(s);
		return false;
	}
	@Transactional
	public boolean update(Supplier s) {
		sessionFactory.getCurrentSession().update(s);
		
		return false;
	}

}
