package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hospital.util.Dbutil;

public class Kidneydao {
	public static boolean addPatient(Kidney kidney) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO kidney(p_name,p_age,p_phone,p_email,p_address,p_gender) values(?,?,?,?,?,?)";
		try(Connection connection = Dbutil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
				
				preparedStatement.setString(1, kidney.getName());
				preparedStatement.setString(2, kidney.getAge());
				preparedStatement.setString(3, kidney.getPhone());
				preparedStatement.setString(4, kidney.getEmail());
				preparedStatement.setString(5, kidney.getAddress());
				preparedStatement.setString(6, kidney.getGender());
				
				int rows = preparedStatement.executeUpdate();
				
				return rows>0;
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
	}
}
