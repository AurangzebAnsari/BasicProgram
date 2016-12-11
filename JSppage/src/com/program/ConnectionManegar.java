package com.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManegar {

	private static ConnectionManegar instance=null;
	
	private String username="sa";
	private String userpassword="rehsn";
	private String conn_string="jdbc:h2:tcp://localhost/~/test";
	
	private Connection conn=null;
	
	
	private ConnectionManegar(){
		
	}
	
	public static ConnectionManegar getInstance(){
		if(instance==null){
			instance=new ConnectionManegar();
		}
		return instance;
	}
	
	
	private boolean openConnection(){
		try {
			conn=DriverManager.getConnection(conn_string,username,userpassword);
			System.out.println("connected");
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return true;
	}

	
	public Connection getConnection(){
		if(conn==null){
			if(openConnection()){
				System.out.println("Connection open");
				return conn;
			}
			else
			{
				return null;
			}
		}
		return conn;
	}
	
	public void closed(){
		System.out.println("closing connection");
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conn=null;
	}

}
