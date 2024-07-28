package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hospital.util.Dbutil;

public class Eyedao {
	public static boolean addPatient(Eye eye) {
		String query = "INSERT INTO eye(p_name,p_phone,p_age,p_gender,p_email,p_address) values(?,?,?,?,?,?)";
		try(Connection connection = Dbutil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
				
				preparedStatement.setString(1, eye.getName());
				preparedStatement.setString(2, eye.getPhone());
				preparedStatement.setString(3, eye.getAge());
				preparedStatement.setString(4, eye.getGender());
				preparedStatement.setString(5, eye.getEmail());
				preparedStatement.setString(6, eye.getAddress());
				
				
				int rows = preparedStatement.executeUpdate();
				
				return rows>0;
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
		
	}
}
