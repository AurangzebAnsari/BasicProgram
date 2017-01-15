package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class User {
	@Id
    @GeneratedValue
    private int userId;
	
	@Pattern(regexp=".+@.+\\.[a-z]+", message = "email format ansari95904@gmail.com")
	@NotEmpty (message = "Email can not be empty.")
	@Column(unique = true)
    private String userEmail;
    
	@NotEmpty (message = "Username can not be empty.")
    private String password;
    
    private boolean enabled;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int usersId) {
		this.userId = usersId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPasswor() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
   

}
