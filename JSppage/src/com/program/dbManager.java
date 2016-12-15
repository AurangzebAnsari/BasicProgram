package com.program;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class dbManager {
	
	private static Connection conn=ConnectionManegar.getInstance().getConnection();
	
	public static void insert(getterandgetter set) throws SQLException{
		
		Connection con=null;
	
			try {
				Class.forName("org.h2.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		String h2="INSERT INTO REGISTER(ID,FIRST_NAME, LAST_NAME, GENDER,EMAIL,PASSWORD, DATE_OD_BIRTH,STATE,ADDRESS,SKILL) values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(h2);
		ps.setInt(1, set.getId());
		ps.setString(2, set.getFname());
		ps.setString(3, set.getLname());
		ps.setString(4, set.getGender());
		ps.setString(5, set.getEmail());
		ps.setString(6, set.getPassword());
		ps.setString(7, set.getBirthday());
		
		ps.setString(8, set.getState());
		
		ps.setString(9, set.getAddress());
		ps.setString(10, set.getSkills());
		ps.executeUpdate();
		ConnectionManegar.getInstance().closed();
		
	}

}
