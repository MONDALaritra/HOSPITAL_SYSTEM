package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hospital.util.Dbutil;

public class Doctordao {
	public boolean isValidDoctor(String email, String password) {
		String query = "SELECT * FROM doctor where email= ? AND password= ?";
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
	
	public boolean addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO doctor(fullname,email,phone,specialist,address,password) values(?,?,?,?,?,?)";
		try(Connection connection = Dbutil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
				
				preparedStatement.setString(1, doctor.getName());
				preparedStatement.setString(2, doctor.getEmail());
				preparedStatement.setString(3, doctor.getPhone());
				preparedStatement.setString(4, doctor.getSpecialist());
				preparedStatement.setString(5, doctor.getAddress());
				preparedStatement.setString(6, doctor.getPassword());
				
				int rows = preparedStatement.executeUpdate();
				
				return rows>0;
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
	}
}
