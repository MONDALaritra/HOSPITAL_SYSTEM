package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hospital.util.Dbutil;

public class Radiodao {
	public static boolean addPatient(Radio rad) {
		String query = "INSERT INTO radio(p_name,p_phone,p_age,p_gender,p_email,p_address) values(?,?,?,?,?,?)";
		try(Connection connection = Dbutil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
				
				preparedStatement.setString(1, rad.getName());
				preparedStatement.setString(2, rad.getPhone());
				preparedStatement.setString(3, rad.getAge());
				preparedStatement.setString(4, rad.getGender());
				preparedStatement.setString(5, rad.getEmail());
				preparedStatement.setString(6, rad.getAddress());
				
				
				int rows = preparedStatement.executeUpdate();
				
				return rows>0;
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
		
	}
}
