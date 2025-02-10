package com.rays.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTransactionHandling {
	public static void main(String[] args) {

		String DB_url = "jdbc:mysql://localhost:3306/advance_java";
		String username = "root";
		String password = "root";
		Connection connection = null;
		try {
			 connection = DriverManager.getConnection(DB_url, username, password);

			connection.setAutoCommit(false);

			Statement statement = connection.createStatement();

			statement.executeUpdate("INSERT INTO emp (id, name) VALUES (12,'shiv' )");

			connection.commit();
			System.out.println("success");
		} catch (Exception e) {
			
			try {
			connection.rollback();
			System.out.println("rollback" + e.getMessage());
	
		}catch (SQLException e1) {
		
		}
		}
	}


}
