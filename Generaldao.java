package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hospital.util.Dbutil;

public class Generaldao {
	public static boolean addPatient(General general) {
		String query = "INSERT INTO general(p_name,p_phone,p_age,p_gender,p_email,p_address) values(?,?,?,?,?,?)";
		try(Connection connection = Dbutil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
				
				preparedStatement.setString(1, general.getName());
				preparedStatement.setString(2, general.getPhone());
				preparedStatement.setString(3, general.getAge());
				preparedStatement.setString(4, general.getGender());
				preparedStatement.setString(5, general.getEmail());
				preparedStatement.setString(6, general.getAddress());
				
				
				int rows = preparedStatement.executeUpdate();
				
				return rows>0;
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
		
	}
}
