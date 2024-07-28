package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hospital.util.Dbutil;

public class Neurodao {
	public static boolean addPatient(Neuro neu) {
		String query = "INSERT INTO neuro(p_name,p_phone,p_age,p_gender,p_email,p_address) values(?,?,?,?,?,?)";
		try(Connection connection = Dbutil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
				
				preparedStatement.setString(1, neu.getName());
				preparedStatement.setString(2, neu.getPhone());
				preparedStatement.setString(3, neu.getAge());
				preparedStatement.setString(4, neu.getGender());
				preparedStatement.setString(5, neu.getEmail());
				preparedStatement.setString(6, neu.getAddress());
				
				
				int rows = preparedStatement.executeUpdate();
				
				return rows>0;
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
		
	}
}
