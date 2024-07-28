package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.hospital.util.Dbutil;

public class Userdao {
	public boolean isValidUser(String email, String password) {
		String query = "SELECT * FROM user where email= ? AND password= ?";
		try(Connection connection = Dbutil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query)){
			
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			
			ResultSet rs = preparedStatement.executeQuery();
			//System.out.println("query run ho rhi hai");
			return rs.next();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO user(fullname,email,phone,address,password) values(?,?,?,?,?)";
		try(Connection connection = Dbutil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
				
				preparedStatement.setString(1, user.getName());
				preparedStatement.setString(2, user.getEmail());
				preparedStatement.setString(3, user.getPhone());
				preparedStatement.setString(4, user.getAddress());
				preparedStatement.setString(5, user.getPassword());
				
				int rows = preparedStatement.executeUpdate();
				
				return rows>0;
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
	}
}
