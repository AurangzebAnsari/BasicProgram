package com.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connect {
	
	public static void main(String[] args) 
	{
		Connection con=null;
		try{
			Class.forName("org.h2.Driver");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		try{
			con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","rehan");
			System.out.println("Database Connected");
		}
		catch(Exception e1){
			e1.printStackTrace();
		}
		
		Statement sta=null;
		try{
		 sta=con.createStatement();
		}
		catch(Exception e2){
			e2.printStackTrace();
		}
		try{
		     //sta.execute("insert into TEST values (12,'Rehan Raza')");
		     //sta.execute("insert into TEST values (13,'Amisha Kumari')");
		     sta.execute("insert into TEST values (14,'raj')");
		     sta.execute("insert into TEST values (15,'roji')");
		     System.out.println("inserted into Table TEST");
		}
		catch(SQLException e3)
		{
			e3.printStackTrace();
		}
		
		try{
			ResultSet r=sta.executeQuery("select *from TEST");
			
			while(r.next())
			{
				System.out.println(r.getInt(1)+""+r.getString(2));
			}
		}
			catch(SQLException e4)
			{
				e4.printStackTrace();
			}
		}
	}
	
		

