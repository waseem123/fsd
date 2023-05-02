package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	private static Connection conn = null;
  
  /*
    1. Replace YOUR_DATABASE_NAME with the actual database name
    2. Replace USERNAME with actual username
    3. Replace PASSWORD with actual password
   */
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/YOUR_DATABASE_NAME","USERNAME","PASSWORD"); 
		}catch(SQLException ex) {
			System.out.println("SQL EXCEPTOIN - "+ex.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
}
