package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hospital.util.Dbutil;

public class Anesthesiadao {
	public static boolean addPatient(Anesthesia an) {
		String query = "INSERT INTO anesthesia(p_name,p_phone,p_age,p_gender,p_email,p_address) values(?,?,?,?,?,?)";
		try(Connection connection = Dbutil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
				
				preparedStatement.setString(1, an.getName());
				preparedStatement.setString(2, an.getPhone());
				preparedStatement.setString(3, an.getAge());
				preparedStatement.setString(4, an.getGender());
				preparedStatement.setString(5, an.getEmail());
				preparedStatement.setString(6, an.getAddress());
				
				
				int rows = preparedStatement.executeUpdate();
				
				return rows>0;
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
		
	}
}
