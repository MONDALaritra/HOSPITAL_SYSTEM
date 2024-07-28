package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hospital.util.Dbutil;

public class Psychodao {
	public static boolean addPatient(Psycho ps) {
		String query = "INSERT INTO psycho(p_name,p_phone,p_age,p_gender,p_email,p_address) values(?,?,?,?,?,?)";
		try(Connection connection = Dbutil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
				
				preparedStatement.setString(1, ps.getName());
				preparedStatement.setString(2, ps.getPhone());
				preparedStatement.setString(3, ps.getAge());
				preparedStatement.setString(4, ps.getGender());
				preparedStatement.setString(5, ps.getEmail());
				preparedStatement.setString(6, ps.getAddress());
				
				
				int rows = preparedStatement.executeUpdate();
				
				return rows>0;
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
		
	}
}
