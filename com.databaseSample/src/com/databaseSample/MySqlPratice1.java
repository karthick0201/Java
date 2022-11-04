package com.databaseSample;

import java.sql.*;

public class MySqlPratice1 {

	public static void main(String[] args) {
		try {
//			// 1. LOAD DRIVERS
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			// 2. establish connection
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost3306/sample", "root", "root");
//			// 3.create Statement
//			Statement st = con.createStatement();
//			// 4. Execute query:
//			ResultSet rs = st.executeQuery("select * from employee");
			// Load Driver
			//Class.forName("com.mysql.cj.jdbc.Driver");
			// Establish Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sample", "root", "root");
			// Create Statement
			Statement statement = con.createStatement();
			// Execute Query:
			ResultSet rs = statement.executeQuery("select * from student");
			// PROCESS THE REQUEST
			while (rs.next()) {
				System.out.println("Id : " + rs.getInt(1) + "\tName : " + rs.getString(2));
			}
			rs.close();
			statement.close();

		} catch ( SQLException e) {
			e.printStackTrace();
			System.out.println("Catch Block!!!");
		}

	}

}
