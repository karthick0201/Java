package DAO;

import java.sql.*;

import model.CustomerPojo;


public class CustomerDAO {
	
	protected static Connection initializeDatabase() throws SQLException, ClassNotFoundException{
		String dBDriver="com.mysql.cj.jdbc.Driver";
		String jdbcUrl="jdbc:mysql://localhost/vehicle_rental";
		String jdbcUsername = "root";
		String jdbcPassword = "root";
		Connection  con=DriverManager.getConnection(jdbcUrl,jdbcUsername,jdbcPassword);
		return con;
	}

	public static void addCustomer(CustomerPojo c) {
		
		try {
			Connection con=initializeDatabase();
			String sql="INSERT into vehicle_rental.customer(cus_name,contact_no,cus_type,cus_email,cus_uname,cus_password) values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, c.getCusName());
			ps.setString(2, c.getContactNo());
			ps.setString(3, c.getCusType());
			ps.setString(4, c.getEmailId());
			ps.setString(5, c.getUserName());
			ps.setString(6, c.getPassword());
			
			ps.executeUpdate();
			System.out.println("Record Entered SUccessfull!!!!");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Record Not ENtereddd!!!");
			e.printStackTrace();
		}
		
	}
	public static boolean isVaildLogin(String uname,String psw) {
		String isVaildQuery="select * from vehicle_rental.customer WHERE cus_uname=? AND cus_password=?;";
		try {
			Connection con=initializeDatabase();
			PreparedStatement ps=con.prepareStatement(isVaildQuery);
			ps.setString(1, uname);
			ps.setString(2, psw);
			ResultSet rs=ps.executeQuery();
			//IF CONDITION CHECK
			if(rs.next()) {
				return true;
			}else {
				return false;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}
}
