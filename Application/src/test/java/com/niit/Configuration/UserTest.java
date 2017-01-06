package com.niit.Configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.UserDAO;
import com.niit.Model.User;

public class UserTest {
	
	public UserTest(){
		AnnotationConfigApplicationContext annot= new AnnotationConfigApplicationContext();
		annot.scan("com.niit");
		annot.refresh();
		
		User user=(User)annot.getBean("user");
		UserDAO userdao=(UserDAO)annot.getBean("userDAO");
		
		user.setUserId(01);
		user.setUserName("Ajay Kumar");
		user.setEmail("ajaykumar9087@gmail,com");
		user.setPassword("ajaykumar");
		user.setDOB("1-03-1989");
		user.setAddress("Bangalore vijayanagar ");
		user.setPhoneNo("+919590414516");
		userdao.save(user);
		
	}

}
