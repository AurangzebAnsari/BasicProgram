package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	

	@RequestMapping("/")
	public String getindex(){
		System.out.println("success index page");
		return "index";
	}
	
	/*@RequestMapping("/login")
	public String getlogin(){
		System.out.println("success login page");
		return "login";
	}*/

	@RequestMapping("/products")
	public String getproducts(){
		System.out.println("success products page");
		return "products";
	}
	
	@RequestMapping("/products1")
	public String getproducts1(){
		System.out.println("success products1 page");
		return "products1";
	}
	
	@RequestMapping("/single")
	public String getsingle(){
		System.out.println("success single page");
		return "single";
	}
	
	/*@RequestMapping("/registered")
	public String getregistered(){
		System.out.println("success registered page");
		return "registered";
	}*/
	
	@RequestMapping("/mail")
	public String getmail(){
		System.out.println("success mail page");
		return "mail";
	}
	

}
