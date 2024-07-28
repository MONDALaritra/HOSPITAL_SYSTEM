package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hospital.util.Dbutil;

public class Plasticdao {
	public static boolean addPatient(Plastic pl) {
		String query = "INSERT INTO plastic(p_name,p_phone,p_age,p_gender,p_email,p_address) values(?,?,?,?,?,?)";
		try(Connection connection = Dbutil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
				
				preparedStatement.setString(1, pl.getName());
				preparedStatement.setString(2, pl.getPhone());
				preparedStatement.setString(3, pl.getAge());
				preparedStatement.setString(4, pl.getGender());
				preparedStatement.setString(5, pl.getEmail());
				preparedStatement.setString(6, pl.getAddress());
				
				
				int rows = preparedStatement.executeUpdate();
				
				return rows>0;
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
		
	}
}
