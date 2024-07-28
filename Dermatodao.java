package com.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hospital.util.Dbutil;

public class Dermatodao {
	public static boolean addPatient(Dermato da) {
		String query = "INSERT INTO dermato(p_name,p_phone,p_age,p_gender,p_email,p_address) values(?,?,?,?,?,?)";
		try(Connection connection = Dbutil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
				
				preparedStatement.setString(1, da.getName());
				preparedStatement.setString(2, da.getPhone());
				preparedStatement.setString(3, da.getAge());
				preparedStatement.setString(4, da.getGender());
				preparedStatement.setString(5, da.getEmail());
				preparedStatement.setString(6, da.getAddress());
				
				
				int rows = preparedStatement.executeUpdate();
				
				return rows>0;
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
		
	}
}
