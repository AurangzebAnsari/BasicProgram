package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.UserDetailsDAO;
import com.niit.model.UserDetails;

import java.util.List;

import javax.validation.Valid;

/*
 * This Controller is used to register user into the system
 */
@Controller
public class UserRegistrationController {

	@Autowired
	private UserDetailsDAO userDetailsDAO;

	/*
	 * registerUserPost method is used to register user into the system and to
	 * show registration related errors
	 */

	
	@RequestMapping("/registered")
	public String registers(Model model) {

		UserDetails userDetails = new UserDetails();
		model.addAttribute("userDetails", userDetails);
		return "registered";
	}
	
	
	@RequestMapping(value = "/registered", method = RequestMethod.POST)
	public ModelAndView registerUserPost(@Valid @ModelAttribute("userDetails") UserDetails userDetails,
			BindingResult result) {
		System.out.println(userDetails.getUsername());
		if (result.hasErrors()) {					
			ModelAndView model=new ModelAndView("registered");
			model.addObject("message", "You have entered invalid details");
			
			System.out.println("Page has errors");
			return model;
		}
		
		List<UserDetails> userDetailsList = userDetailsDAO.getAllUsers();

        for (int i=0; i< userDetailsList.size(); i++) {
        	ModelAndView model=new ModelAndView("registered");
        	if(userDetails.getUserEmail().equals(userDetailsList.get(i).getUserEmail())) {
                model.addObject("emailError", "Email already exists");

                return model;
            }

            if(userDetails.getUsername().equals(userDetailsList.get(i).getUsername())) {
                model.addObject("usernameError", "Username already exists");
                return model;
            }
            if(userDetails.getUserPhone().equals(userDetailsList.get(i).getUserPhone())) {
                model.addObject("userPhoneError", "User phone already exists");
                return model;
            }
        }
	/*	if(userDetailsDAO.isValidUser(userDetails.getUsername())==false){
			ModelAndView model=new ModelAndView("customerRegister");
			model.addObject("usernameError", "User name already exists");
			return model;
		}*/
		
        userDetails.setEnabled(true);	
		userDetailsDAO.addUser(userDetails);
		ModelAndView model=new ModelAndView("index");
		return model;
	}
}