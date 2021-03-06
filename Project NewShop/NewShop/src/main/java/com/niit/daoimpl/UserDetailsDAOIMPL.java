package com.niit.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.UserDetailsDAO;
import com.niit.model.User;
import com.niit.model.UserDetails;
import com.niit.model.UserRole;



@Repository("userDetailsDAO")
public class UserDetailsDAOIMPL implements UserDetailsDAO {


    @Autowired
    private SessionFactory sessionFactory;


    
    public UserDetailsDAOIMPL(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		System.out.println(sessionFactory);
    }
	


    @Transactional
	public void addUser(UserDetails userDetails) {
    	System.out.println(userDetails.getUsername());
        Session session = sessionFactory.openSession();
        
        session.saveOrUpdate(userDetails);
       
        User newUser = new User();
        newUser.setUserEmail(userDetails.getUserEmail());
        newUser.setPassword(userDetails.getPassword());
        newUser.setEnabled(true);
        newUser.setUserId(userDetails.getUserId());

        UserRole newUserRole = new UserRole();
        newUserRole.setUserEmail(userDetails.getUserEmail());
        newUserRole.setUsername(userDetails.getUsername());
        newUserRole.setRole("ROLE_USER");
        
        session.save(newUser);
        session.saveOrUpdate(newUserRole);
        session.saveOrUpdate(userDetails);
       
        session.flush();
    }

    
   //LOOK HERE
    @Transactional
    public boolean isValidUser(String name)
    {
    	//select * from UserDetails where id='101' and password='niit'
    	String hql="from UsersDetails where username='"+name+"'";
    	Query query=sessionFactory.openSession().createQuery(hql);
    	
    	List<UserDetails> list = query.list();//list of users detail
    	
    	if(list!=null){
        	return false;//invalid user    		
    	}
    	else{
    		return true;//valid user
    	}
    }
    
    @Transactional
    public UserDetails getUserById (int userId) {
        Session session = sessionFactory.openSession();
        return (UserDetails) session.get(UserDetails.class, userId);
    }

    @Transactional
    public List<UserDetails> getAllUsers() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from UserDetails");
        List<UserDetails> usersDetail = query.list();

        return usersDetail;
    }
    
    @Transactional
    public UserDetails getUserByUsername (String username) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from UserDetails where username = ?");
        query.setString(0, username);
        return (UserDetails) query.uniqueResult();
    }


}