package com.niit.Configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.CategoryDAO;
import com.niit.Model.Category;

public class CategoryTest {
	
	public   CategoryTest()
	{
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext();
		con.scan("com.niit.*");
		con.refresh();
		
		Category category=(Category)con.getBean("category");
		CategoryDAO categorydao=(CategoryDAO)con.getBean("categoryDAO");
	
	    category.setCategory_id(01);
	    category.setCategory_name("Mobile");
		category.setCategory_desc("Sony v3 model 2");
		categorydao.save(category);	
		
	}
}