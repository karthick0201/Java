package DAO;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.VehiclePojo;

public class VehicleDAO {
	public final static String photoPath="C:/Users/Administrator/eclipse-workspace/VehicleRental/image/";
	public static Connection initializeDatabase() throws SQLException, ClassNotFoundException{
		String dBDriver="com.mysql.cj.jdbc.Driver";
		String jdbcUrl="jdbc:mysql://localhost/vehicle_rental";
		String jdbcUsername = "root";
		String jdbcPassword = "root";
		Connection  con=DriverManager.getConnection(jdbcUrl,jdbcUsername,jdbcPassword);
		return con;
	}
	public static void addVehicle(VehiclePojo vp) {
		try {
			
			Connection con=initializeDatabase();
			String query="INSERT INTO vehicle_rental.vehicle (car_name, car_num, car_model_no, car_type, car_seat_count, car_price_per_day, car_description, car_status, car_photo) values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, vp.getCarName());
			ps.setString(2, vp.getCarNum());
			ps.setString(3, vp.getCarModelNo());
			ps.setString(4, vp.getCarType());
			ps.setInt(5, vp.getCarSeatCount());
			ps.setInt(6, vp.getCarPricePerDay());
			ps.setString(7, vp.getCarDescription());
			ps.setString(8, vp.getCarStatus());
			ps.setString(9, vp.getCarPhoto());
			System.out.println("****************DATABASE UPLOAD CHECK ");
			System.out.println(vp);
			System.out.println("**************************************");
			
			ps.executeUpdate();
			
			
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Car not updated in db prints from exception class");
		}
		
	}
	
	
	
	
	
}
