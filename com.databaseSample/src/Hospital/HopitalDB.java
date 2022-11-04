package Hospital;

import java.sql.*;

public class HopitalDB {

	public static void main(String[] args) {

		String dB_Url = "jdbc:mysql://localhost/";
		String id = "root";
		String sql;
		String password = "root";
		try {
			Connection con = DriverManager.getConnection(dB_Url,id,password);
			Statement st=con.createStatement();
			sql="create database hospital;";
			st.executeUpdate(sql);
			System.out.println("Database Created!!!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		dB_Url += "hospital";
		
		try {
			Connection con = DriverManager.getConnection(dB_Url, id, password);
			Statement st=con.createStatement();
			sql="CREATE TABLE IF NOT EXISTS patient_details(p_id int primary key,p_name varchar(20),in_time varchar(30),out_time varchar(30),time_taken int,phoneNO varchar(12) unique)";
			st.executeUpdate(sql);
			System.out.println("Table SuccessFully Created!!!");
			
			
			st.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		

	}

}
