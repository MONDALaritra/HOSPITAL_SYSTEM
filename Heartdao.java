package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hospital.util.Dbutil;

public class Heartdao {
	public static boolean addPatient(Heart heart) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO heart(p_name,p_age,p_phone,p_email,p_address,p_gender) values(?,?,?,?,?,?)";
		try(Connection connection = Dbutil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
				
				preparedStatement.setString(1, heart.getName());
				preparedStatement.setString(2, heart.getAge());
				preparedStatement.setString(3, heart.getPhone());
				preparedStatement.setString(4, heart.getEmail());
				preparedStatement.setString(5, heart.getAddress());
				preparedStatement.setString(6, heart.getGender());
				
				int rows = preparedStatement.executeUpdate();
				
				return rows>0;
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
	}
}
