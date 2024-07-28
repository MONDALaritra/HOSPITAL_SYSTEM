package com.hospital.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutil {
	private static final String URL= "jdbc:mysql://localhost:3306/hospital";
	private static final String USERNAME= "root";
	private static final String PASSWORD= "Aritra@460";
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}	
	public static Connection getConnection() throws SQLException{
		//System.out.println("connection build hua");
		return DriverManager.getConnection(URL,USERNAME,PASSWORD);
	}
}
