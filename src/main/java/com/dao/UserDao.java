package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;

import com.connector.DatabaseConnector;
import com.mysql.jdbc.Statement;

public class UserDao {
	public static boolean userRegistration(String name, String email, String phone, String message) {
		Connection con=null;
		boolean flag=false;
		Statement st=null;
		ResultSet rs=null;
		
		try {
			con=DatabaseConnector.getConnection();
			st=(Statement) con.createStatement();
			
			String query="insert into softpro_tb(name,email,phone,message)values('"+name+"','"+email+"','"+phone+"','"+message+"')";
			int n=st.executeUpdate(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

}
