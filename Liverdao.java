package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hospital.util.Dbutil;

public class Liverdao {
	public static boolean addPatient(Liver liver) {
		String query = "INSERT INTO liver(p_name,p_phone,p_age,p_gender,p_email,p_address) values(?,?,?,?,?,?)";
		try(Connection connection = Dbutil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
				
				preparedStatement.setString(1, liver.getName());
				preparedStatement.setString(2, liver.getPhone());
				preparedStatement.setString(3, liver.getAge());
				preparedStatement.setString(4, liver.getGender());
				preparedStatement.setString(5, liver.getEmail());
				preparedStatement.setString(6, liver.getAddress());
				
				
				int rows = preparedStatement.executeUpdate();
				
				return rows>0;
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
		
	}
	
}
