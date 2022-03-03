package com.cybage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCUtility {
	private static Connection connection=null;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdb" ,"root","root");
			System.out.println("connected to database");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
		
	}

}
