package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import vehiclePackage.AbstractVehicle;
import vehicleRentalManage.ConnectionDao;



public class VehicleDao {
	public static void addVehicle(AbstractVehicle vp) {
		
		ConnectionDao cd=new ConnectionDao();
		String query="INSERT INTO vehicle_rental.vehicle (car_name, car_num, car_model_no, car_type, car_seat_count, car_price_per_day, car_description, car_status, car_photo) values(?,?,?,?,?,?,?,?,?)";
		try (Connection con=cd.getConnection();
			PreparedStatement ps=con.prepareStatement(query);){
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
		

	public static void deleteVehicle(int id) {
		String query="DELETE from vehicle_rental.vehicle WHERE car_id=?";
		ConnectionDao cd=new ConnectionDao();
		try (
			Connection con=cd.getConnection();
			PreparedStatement ps=con.prepareStatement(query);){
			ps.setInt(1, id);
			int row=ps.executeUpdate();
			System.out.println("Row : " + row);
			System.out.println(id + " : Data Deleted Successfull!!!");
			
				
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(id + " : Data Deleted UnSuccessfull!!!");
			e.printStackTrace();
		}
		
	}
}
