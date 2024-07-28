package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hospital.util.Dbutil;

public class Admindao {
	public boolean isValidAdmin(String email, String password) {
		String query = "SELECT * FROM admin where email= ? AND password= ?";
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
	
	public boolean addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO admin(fullname,email,phone,address,password) values(?,?,?,?,?)";
		try(Connection connection = Dbutil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
				
				preparedStatement.setString(1, admin.getName());
				preparedStatement.setString(2, admin.getEmail());
				preparedStatement.setString(3, admin.getPhone());
				preparedStatement.setString(4, admin.getAddress());
				preparedStatement.setString(5, admin.getPassword());
				
				int rows = preparedStatement.executeUpdate();
				
				return rows>0;
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
	}
}
