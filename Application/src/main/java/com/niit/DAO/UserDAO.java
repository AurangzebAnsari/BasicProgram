package com.niit.DAO;

import java.util.List;

import com.niit.Model.User;

public interface UserDAO {
	
	public List<User>list();
	
	public User get(String UserId);
	
	public User Validation(String Mail,String Password);
	
	public boolean save(User user);
	
	public boolean update(User user);
	
}
