package console1;

import java.sql.*;

public class RegisterUser {

	
	public static void main(String[] args){
		
		String db_Url="jdbc:mysql://localhost:3306/";
		String id="root";
		String psw="root";
		String sql;
		//if Not Database Creation: 
		try {
			
			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample\", \"root\", \"root");
			Connection con=DriverManager.getConnection(db_Url,id,psw);
			Statement st=con.createStatement();
			sql="create database Register";
			st.executeUpdate(sql);
			System.out.println("Database Created!!!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//add table name!!!
		
		try {
			db_Url +="Register";
			Connection con=DriverManager.getConnection(db_Url,id,psw);
			Statement st=con.createStatement();
			sql="create table IF NOT EXISTS user_details(user_id integer(10) not null auto_increment,u_name varchar(25) not null,password Integer(10) not null,balance Integer(10),primary key(user_id))";
			st.executeUpdate(sql);
			System.out.println("TABLE SUCCESSFULLY CREATED!!!");
			System.out.println("Table Created!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
