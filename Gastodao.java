package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hospital.util.Dbutil;

public class Gastodao {
	public static boolean addPatient(Gastro gas) {
		String query = "INSERT INTO gastro(p_name,p_phone,p_age,p_gender,p_email,p_address) values(?,?,?,?,?,?)";
		try(Connection connection = Dbutil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
				
				preparedStatement.setString(1, gas.getName());
				preparedStatement.setString(2, gas.getPhone());
				preparedStatement.setString(3, gas.getAge());
				preparedStatement.setString(4, gas.getGender());
				preparedStatement.setString(5, gas.getEmail());
				preparedStatement.setString(6, gas.getAddress());
				
				
				int rows = preparedStatement.executeUpdate();
				
				return rows>0;
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
		
	}
}
