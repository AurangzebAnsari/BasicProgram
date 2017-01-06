package com.niit;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.xml");
    	
    	SessionFactory factory= cfg.buildSessionFactory();
    	Session session =factory.openSession();
    	
    	Product p=new Product();
    	
    	
    	p.setProName("Lava mobile");
    	p.setPrice(200);
    	
    	Transaction tx=session.beginTransaction();
    	session.save(p);
    	System.out.println("success");
    	tx.commit();
    	session.close();
    	factory.close();		
    
}

	
}