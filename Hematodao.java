package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hospital.util.Dbutil;

public class Hematodao {
	public static boolean addPatient(Hemato hem) {
		String query = "INSERT INTO hemato(p_name,p_phone,p_age,p_gender,p_email,p_address) values(?,?,?,?,?,?)";
		try(Connection connection = Dbutil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
				
				preparedStatement.setString(1, hem.getName());
				preparedStatement.setString(2, hem.getPhone());
				preparedStatement.setString(3, hem.getAge());
				preparedStatement.setString(4, hem.getGender());
				preparedStatement.setString(5, hem.getEmail());
				preparedStatement.setString(6, hem.getAddress());
				
				
				int rows = preparedStatement.executeUpdate();
				
				return rows>0;
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
		
	}
}
