package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hospital.util.Dbutil;

public class Oncodao {
	public static boolean addPatient(Onco on) {
		String query = "INSERT INTO onco(p_name,p_phone,p_age,p_gender,p_email,p_address) values(?,?,?,?,?,?)";
		try(Connection connection = Dbutil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
				
				preparedStatement.setString(1, on.getName());
				preparedStatement.setString(2, on.getPhone());
				preparedStatement.setString(3, on.getAge());
				preparedStatement.setString(4, on.getGender());
				preparedStatement.setString(5, on.getEmail());
				preparedStatement.setString(6, on.getAddress());
				
				
				int rows = preparedStatement.executeUpdate();
				
				return rows>0;
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
		
	}
}
