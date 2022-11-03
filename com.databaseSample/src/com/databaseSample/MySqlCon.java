package com.databaseSample;

import java.sql.*;


public class MySqlCon {
	public static void main(String[] args) {

		try {
			//String URL = "jdbc:mysql://localhost3306/sample";
			//String idPsw = "root";
			// Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Establish Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "root");
			// Create Statement
			Statement statement = con.createStatement();
			// Execute Query:
			ResultSet rS = statement.executeQuery("select * from student");
			// Process the Request:

			while (rS.next()) {
				System.out.println("Id    : "+rS.getInt(1) +"\nName : "+rS.getString(2));
			}
			rS.close();			
			
			statement.close();
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}
}

//import java.sql.*;
//
//class MysqlCon {
//	public static void main(String args[]) {
//		try {
//	//		Class.forName("com.mysql.jdbc.Driver"); 
//			Class.forName("com.mysql.cj.jdbc.Driver"); 
//
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "root");
////here sonoo is the database name, root is the username and root is the password
//			Statement stmt = con.createStatement();
//
//			ResultSet rs = stmt.executeQuery("select * from emp");
//
//			while (rs.next())
//				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//
//			con.close();
//
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//
//	}
//}
