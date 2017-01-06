package com.niit.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.UserDAO;
import com.niit.Model.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	public SessionFactory sessionFactory;
	
	public UserDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
		System.out.println(sessionFactory);
	}
	@Transactional
	public List<User> list() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from user");
		List<User>listuser=query.list();
	
		return null;
	}
	@Transactional
	public User get(String UserId) {
		return (User)sessionFactory.getCurrentSession().get(User.class, UserId);
	}
	@Transactional
	public User Validation(String Mail, String Password) {
		
		return null;
	}
	@Transactional
	public boolean save(User user) {
		sessionFactory.getCurrentSession().save(user);
		return false;
	}
@Transactional
	public boolean update(User user) {
		sessionFactory.getCurrentSession().save(user);
		return false;
		
	}

}
