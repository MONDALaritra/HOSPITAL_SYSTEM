package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hospital.util.Dbutil;

public class Allergydao {
	public static boolean addPatient(Allergy allergy) {
		String query = "INSERT INTO allergy(p_name,p_phone,p_age,p_gender,p_email,p_address) values(?,?,?,?,?,?)";
		try(Connection connection = Dbutil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
				
				preparedStatement.setString(1, allergy.getName());
				preparedStatement.setString(2, allergy.getPhone());
				preparedStatement.setString(3, allergy.getAge());
				preparedStatement.setString(4, allergy.getGender());
				preparedStatement.setString(5, allergy.getEmail());
				preparedStatement.setString(6, allergy.getAddress());
				
				
				int rows = preparedStatement.executeUpdate();
				
				return rows>0;
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
		
	}
}
