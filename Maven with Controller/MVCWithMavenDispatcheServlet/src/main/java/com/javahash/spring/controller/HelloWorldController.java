package com.javahash.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
		 
	@RequestMapping("/")
	 public String index(){
	   System.out.println("hi Rehan  Home Page is Running");
	   //returns the view name
	   return "index";
	}
	@RequestMapping("/blog")
	public String blog(){
		System.out.println("Bolg Page Is Running");
		return "blog";
	}
	
	@RequestMapping("/components")
	public String components(){
		System.out.println("Components Page Is Running");
		return "components";
	}
	
	@RequestMapping("/contact")
	public String contact(){
		System.out.println("Contact Page Is Running");
		return "contact";
	}
	

	@RequestMapping("/portfolio")
	public String portfolio(){
		System.out.println("Portfolio Page Is Running");
		return "portfolio";
	}
	
	@RequestMapping("/pricingbox")
	public String pricingbox(){
		System.out.println("Pricingbox Page Is Running");
		return "pricingbox";
	}
	
	
	@RequestMapping("/typography")
	public String typography(){
		System.out.println("Typography Page Is Running");
		return "typography";
	}

}
