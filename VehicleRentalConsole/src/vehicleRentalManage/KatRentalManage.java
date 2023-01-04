package vehicleRentalManage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import citizenPackage.Driver;
import rentalAgencyPackage.KatRental;
import vehiclePackage.Bike;
import vehiclePackage.Bike.BikeBuilder;
import vehiclePackage.Car;

public class KatRentalManage {

	public static void main(String[] args) {
		KatRentalManage krm = new KatRentalManage();
		Scanner in = new Scanner(System.in);

		boolean check = true;
		int choice;

		while (check) {
			System.out.println("--------------------------------------");
			System.out.println("\tKAT-VEHICLE RENTAL AGENCY");
			System.out.println("--------------------------------------");

			System.out.println(
					"1. Customer Login\n2. Admin Login\n3. Vehicle-Owner Login\n4. New Customer\n5. New Veh-Owner\n6. Exit");
			System.out.println("-------------------------");
			System.out.print("Enter Your CHoice : ");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("<--------Customer Login-------->");
				break;
			case 2:
				System.out.println("<--------ADMIN LOGIN-------->");
				krm.adminLogin();
				break;
			case 3:
				System.out.println("<--------Admin Login-------->");

				break;
			case 4:
				System.out.println("<--------Car Owner Login-------->");
				break;
			case 5:
				System.out.println("<--------New Car Owner-------->");
				break;

			case 6:
				System.out.println("<<---------Thank You---------->>");
				check = false;
				break;
			default:
				System.out.println("Wrong Option!!!");
				break;
			}

		}

		in.close();
	}

	private void adminLogin() {
		Scanner in = new Scanner(System.in);
		System.out.print("USER NAME : ");
		String userName = in.next();
		System.out.print("Password : ");
		String password = in.next();
		if (KatRental.authenticateAdmin(userName, password)) {
			System.out.println("\n\tWELCOME!!!\n");
			adminPage();
		} else {
			System.out.println("\tInvaild!!!");
			return;
		}

	}

	private void adminPage() {
		Scanner in = new Scanner(System.in);
		System.out.println("<-----ADMIN PROFILE------>");
		boolean check = true;
		int choice;
		while (check) {
			System.out.println(
					"1. Add Vehicle\n2. Add Driver\n3. Bending Vehicle\n4. View Customers\n5. Vehicle Details\n6. Owner Details\n7. Booking Details\n8. Logout");
			System.out.print("Enter Your Choice : ");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("<-----Add Vehicle----->");
				addVehicle();

				break;
			case 2:
				System.out.println("<------Add Driver------>");
				addDriver();
				break;
			case 3:
				System.out.println("<------Bending Vehicle------>");
				break;
			case 4:
				System.out.println("<------View Customers------>");
				viewCustomer();
				break;
			case 5:
				System.out.println("<------Vehicle Details------>");
				viewVehicle();
				break;
			case 6:
				System.out.println("<------Car Owner Details------>");
				viewCarOwnerDetails();
				break;
			case 7:
				System.out.println("<--------BOOKING DETAILS--------->");
				viewBookings();
				break;
			case 8:
				System.out.println("Logout Successfull!!!");
				return;
			default:
				System.out.println("Wrong Option!!!");
				break;
			}
		}

	}

	private void viewBookings() {
		KatRental kr=new KatRental();
		kr.viewBookings();	
		
	}

	private void viewCarOwnerDetails() {
		KatRental kr=new KatRental();
		kr.viewCarOwnerDetails();	
	}

	private void viewVehicle() {
		KatRental kr=new KatRental();
		kr.viewVehicles();		
	}

	private void viewCustomer() {
		KatRental kr=new KatRental();
		kr.viewCustomers();
		
	}

	private void addDriver() {
		KatRental kr=new KatRental();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name=in.next();
		System.out.println("aadhar No : ");
		String adharNo=in.next();
		System.out.println("phoneNo : ");
		String phoneNo=in.next();
		System.out.println("dateOfBirth : ");
		String dateOfBirth=in.next();
		System.out.println("location : ");
		String location=in.next();
		System.out.println("drivingLicence : ");
		String drivingLicence=in.next();
		System.out.println("userName : ");
		String userName=in.next();
		System.out.println("password  : ");
		String password=in.next();
		System.out.println("Email : ");
		String email=in.next();
		Driver d=new Driver.DriverBuilder(name, adharNo, phoneNo, dateOfBirth, location, drivingLicence, userName, password, email).build();
		if(kr.addDriver(d)) {
			System.out.println("Driver Added Successfull!!!");
		}else {
			System.out.println("Driver Not added!!!");
		}
	}

	private void addVehicle() {
		Scanner in = new Scanner(System.in);
		Scanner inn = new Scanner(System.in);
		int choice;
		while (true) {
			System.out.println("1. Car\n2. Bike\n3. Back To Admin Page");
			choice = in.nextInt();
			KatRental kr = new KatRental();
			switch (choice) {
			case 1:
				System.out.println("\t<<------>>");
				System.out.println("Enter Brand Name : ");
				String brand_name = in.next();
				System.out.println("Vehicle No : ");
				String vehicleNumber = in.next();
				System.out.println("Fuel : ");
				String fuel = in.next();
				System.out.println("TransMission : ");
				String transMission = in.next();
				System.out.println("Owner Id : ");
				String ownerId = in.next();
				System.out.print("Enter Segment : ");
				String s = in.next();

				System.out.print("Enter Model-No : ");
				String modelNo = in.next();

				System.out.println("Seat Count : ");
				String seatCount = in.next();
				System.out.println("ENter Description : ");
				String description = in.next();
				System.out.print("Price Per Day : ");
				int pricePerDay = inn.nextInt();
				Car c = new Car(seatCount, s, modelNo, pricePerDay, description, brand_name, vehicleNumber, fuel,
						transMission, ownerId);
				// Car c=new Car.CarBuilder(brand_name, vehicleNumber, fuel, transMission,
				// segment, modelNo, seatCount, description, ownerId)
				System.out.println(c);

				kr.addVehicle(c);
				System.out.println("Vechile Added Successfull!!!");
				break;
			case 2:
				System.out.println("\t<<------>>");
				System.out.println("Enter Brand Name : ");
				brand_name = in.next();
				System.out.println("Vehicle No : ");
				vehicleNumber = in.next();
				System.out.println("Fuel : ");
				fuel = in.next();
				System.out.println("TransMission : ");
				transMission = in.next();
				System.out.println("Owner Id : ");
				ownerId = in.next();

				System.out.print("Enter Model-No : ");
				modelNo = in.next();

				System.out.println("ENter Description : ");
				description = in.next();
				System.out.print("Price Per Day : ");
				pricePerDay = inn.nextInt();
				Bike b = new Bike.BikeBuilder("-1", brand_name, vehicleNumber, fuel, transMission, modelNo, description)
						.setPricePerDay(pricePerDay).build();
				System.out.println(b);
				kr.addVehicle(b);
				System.out.println("Vechile Added Successfull!!!");
				break;
			case 3:
				System.out.println("Going Back!!!");
				return;
			}

		}
	}

}

//public void mysqlcodesample() { 
///*
// * // List<AbstractVehicle> vehiels = new ArrayList<AbstractVehicle>();
// * 
// * // vehiels.add(c); 
// System.out.println(c.getBrand_name()); 
//ConnectionDao cd = new ConnectionDao(); 
//String sql = "SELECT * FROM kat_rental.vehicle";
//try
// * (Connection con = cd.getConnection(); PreparedStatement ps =
// * con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) { ; while
// * (rs.next()) { System.out.println(rs.getInt(1));
// * System.out.println(rs.getString(2)); } } catch (ClassNotFoundException |
// * SQLException e) { // TODO Auto-generated catch block
// * 
// * e.printStackTrace(); }
// */
//
//}
