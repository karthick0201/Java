package vehicleRentalManage;


import java.util.Scanner;

import bookingPackage.Booking;
import citizenPackagePojo.CarOwner;
import citizenPackagePojo.Customer;
import citizenPackagePojo.Driver;
import rentalAgencyPackage.AbstractKatRental;
import rentalAgencyPackage.KatRental;
import vehiclePackage.Bike;

import vehiclePackage.Car;

public class KatRentalManage {

	public static void main(String[] args) {
		
		
		KatRentalManage krm = new KatRentalManage();
		krm.preDefiniedData();
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
				krm.customerLogin();
				break;
			case 2:
				System.out.println("<--------ADMIN LOGIN-------->");
				krm.adminLogin();
				break;
			case 3:
				System.out.println("<--------Vehicle-Owner Login-------->");
				
				break;
			case 4://
				System.out.println("<--------Customer Register-------->");
				krm.registerCustomer();
				break;
			case 5://
				System.out.println("<--------New Car Owner-------->");
				krm.newCarOwnerRegister();
				break;

			case 6://
				System.out.println("<<---------Thank You---------->>");
				check = false;
				break;
			default:
				System.out.println("Wrong Option!!!");
				break;
			}

		}

	}

	private void preDefiniedData() {   
		//Car
		Car c1=new Car.CarBuilder("Audi", "tn02", "Petrol", "Auto", "SUv", "Audi Edition-2", "6", "white Car", "-1").setPricePerDay(5000).build();
		Car c2=new Car.CarBuilder("BMW", "tn05", "Diesal", "Manuel", "USUv", "Bmw Edition-2", "5", "Red Car", "-1").setPricePerDay(4000).build();
		
		//Bike
		Bike b1=new Bike.BikeBuilder("-1", "Honda", "b05", "petrol", "Manuel", "Honda E-2", "Good").setPricePerDay(1300).build();
		Bike b2=new Bike.BikeBuilder("-1", "Activa", "b08", "petrol", "Manuel", "Activa E-1", "Good").setPricePerDay(1000).build();
		//Car-owner:
		CarOwner co1=new CarOwner("Viki", "123", "123", "10-11-2001", "CHennai", "viki", "5819825d46159ca06b3c54b0a0651a3e", "v@123", "dLic04", "1000");
		Car c3=new Car.CarBuilder("BMW", "tn08", "Diesal", "Manuel", "USUv", "Bmw Edition-5", "8", "White Car", "viki").setPricePerDay(3000).build();
		co1.addVehicle(c3);
		
		//Customer:
		Customer cus1=new Customer("sneha", "48894", "10098", "22-09-2001", "Thenkasi", "s@123", "dLic12", false, "sneha", "e26bfda67f49ca1fc48f9b51003a5910");
		Customer cus2=new Customer("jagadesh", "48884", "3224", "19-12-2003", "covai", "j@123", "dLic18", true, "jagu", "d4f6169fc5fe71d0a1a76cbe6a274c6e");
		Customer cus3=new Customer("suriya", "48824", "28373", "28-02-2004", "theni", "su@123", "dLic122", false, "suriya", "413882e418d7a4e907f37c40de39899b");
		
		//DRIVER
		Driver d1=new Driver.DriverBuilder("rafi", "393838", "33838282", "09-08-1998", "Madurai", "dlic3049", "rafi", "139c4e89cdbedaf144d05ca54a12a57b", "r@123").build();
		Driver d2=new Driver.DriverBuilder("mani", "393832", "982744", "09-01-1999", "Madurai", "dlic30493", "mani", "07cd55c7b42715ec44c133a6a165e8d2", "ma@123").build();
		
		KatRental kr=new KatRental();
		//add vehicle
		kr.addVehicle(c1);
		kr.addVehicle(c2);
		kr.addVehicle(b1);
		kr.addVehicle(b2);
	//add customer
		kr.addCustomer(cus1);
		kr.addCustomer(cus2);
		kr.addCustomer(cus3);
		//add driver
		kr.addDriver(d1);
		kr.addDriver(d2);
		//add car-owner
		kr.addCarOwner(co1);
		
	}

	private void customerLogin() {
		Scanner in=new Scanner(System.in);
		KatRental kr = new KatRental();
		System.out.println("\nUser Name : ");
		String uname=in.next();
		System.out.println("Password    : ");
		String psw=in.next();
		if(kr.vaildateCustomer(uname,AbstractKatRental.encryptPassword(psw))) {
			System.out.println("Login SuccessFull!!!");
			customerProfile(uname);
		}else {
			System.out.println("Invaild!!!");
		}
		
	}

	private void customerProfile(String uname) {
		Scanner in=new Scanner(System.in);
		int choice;
		while(true) {
			System.out.println("<<----CUSTOMER PROFILE----->>");
			System.out.println("1. Book-Vehicle\n2. Fillter-Search\n3. My Bookings\n4. Logout");
			System.out.print("Enter Your Choice : ");
			choice=in.nextInt();
			switch(choice) {
			case 1:
				System.out.println("<<---Booking Vehicle Page--->");
				bookVehicle(uname);
				break;
			case 2:
				System.out.println("<<------Fillter Search-------->>");
				fillterSearch();
				break;
			case 3:
				System.out.println("<<-----MyBookings------->>");
				viewMyBookings(uname);
				break;
			case 4:
				System.out.println("<<---LogOut SUccessfull!!!---->>");
				return;
				
				default:
					System.out.println("Wrong Option!!!");
					break;
			}
		}
	}

	private void viewMyBookings(String uname) {
		KatRental kr=new KatRental();
		kr.viewCustomerBookings(uname);
		
	}

	private void fillterSearch() {
		Scanner in=new Scanner(System.in);
		int choice;
		while(true) {
			System.out.println("1. Brand Name Wise Search\n2. Seat Count\n3. Price Wise\n4. Back ");
			System.out.println("Enter Your Choice : ");
			choice=in.nextInt();
			switch(choice) {
			case 1:
				System.out.println("<<<----Price Wise Search----->>");
				priceWiseDisplay();
				break;
			case 2:
				System.out.println("<<<----Seat Count Order----->>");
				break;
			case 3:
				System.out.println("<<<----Date Order----->>");
				break;
			case 4 :
				System.out.println("GOing Back!!!");
				return;
				
				default:
					System.out.println("Wrong Option!!!");
					break;
			}
		}
		
	}

	private void priceWiseDisplay() {
		KatRental kr=new KatRental();
		kr.priceWiseDispaly();
		
	}

	private void bookVehicle(String cusId) {
		
		/* 1.  Collect Booking Details  :
		 * ------------------------------
		 * 		1.1-Vehicle COunt
		 * 		1.2-Get Booking_id
		 * 		1.3-customer_id
		 * 		1.4-start date
		 * 		1.5-end date(Avaiable Date)
		 * 		1.6-Price calculate
		 * 2. Process:
		 * -----------  
		 * 		2.1-Car Avaiable date Change
		 * 		2.2-Booking obj ah bookings add pannu
		 * 		2.3-customer Object la bookings id  add pannu
		 * 		2.4-car owner id --> add money to co wallet
		 *
		 * 
		 */
		
		
		Scanner in=new Scanner(System.in);
		int count;
		String vehicleNumber;
		KatRental kr=new KatRental();
		//1.2
		int bookingId=kr.getStaticBookingId();
		
		System.out.println("Enter Start Date(yyyy-mm-dd) : ");
		String startDate=in.next();
		System.out.println("Enter ENd Date(yyyy-mm-dd) : ");
		String endDate=in.next();
		
		//booking class object
		Booking b1=new Booking();
		b1.setBookingId(bookingId);
		b1.setCustomerId(cusId);
		b1.setStartDate(startDate);
		b1.setEndDate(endDate);
		
		
		//1.1
		System.out.print("Enter How Many Vehicle's You Want TO Book : ");
		count=in.nextInt();
		
		while(count>0) {
			System.out.println("<<-----Avaiable Vehicles------>");
			viewVehicle();
			System.out.println("<<----Book------>>");
			System.out.println("Enter Vehicle Number : ");
			vehicleNumber=in.next();
			
			
			//kr.bookVehicle(VehicleNumber);
			if(kr.vaildateDate(startDate,endDate,vehicleNumber)) {
				//kr.bookVehicle(cusId,b1);
				kr.bookVehicle(cusId,b1,vehicleNumber);
				
			}else {
				System.out.println("Vehicle Not Avaiable...");
				return;
			}
			count--;
		}
		kr.bookVehicle(cusId, b1);
		System.out.println("Booking successfull!!!");
		
	}

	private void newCarOwnerRegister() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name=in.next();
		System.out.println("Adhar No : ");
		String adharNo=in.next();
		System.out.println("Phone no : ");
		String phoneNo=in.next();
		System.out.println("Date of Birth : ");
		String dob=in.next();
		System.out.println("Location : ");
		String location=in.next();
		System.out.println("Enter UserName : ");
		String userName = in.next();
		System.out.println("Enter Password : ");
		String psw = in.next();
		System.out.println("Email : ");
		String email = in.next();
		System.out.println("Driving Licience : ");
		String drivingLicienceNo = in.next();
		System.out.println("Wallet Balance : ");
		String walletBalance = in.next();
		CarOwner co=new CarOwner(name,adharNo,phoneNo,dob,location,userName,psw,email,drivingLicienceNo,walletBalance);
		
		KatRental kr = new KatRental();
		kr.newCarOwnerRegister(co);
		System.out.println("Register SUccessfull!!");
	}

	private void registerCustomer() {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Name : ");
		String name = in.next();
		System.out.println("Aadhar no : ");
		String adharNo = in.next();
		System.out.println("Phone No : ");
		String phoneNo = in.next();
		System.out.println("DateOfBirth : ");
		String dob = in.next();
		System.out.println("Location : ");
		String location = in.next();
		System.out.println("ENter Email : ");
		String email = in.next();
		System.out.println("Driving License : ");
		String dLicense = in.next();
		System.out.println("Subscription : ");
		boolean subscription = in.nextBoolean();
		System.out.println("User Name : ");
		String uName = in.next();
		System.out.println("Password : ");
		String psw = in.next();

		Customer c = new Customer(name, adharNo, phoneNo, dob, location, email, dLicense, subscription, uName,
				AbstractKatRental.encryptPassword(psw));
		KatRental kr = new KatRental();
		kr.registerCustomer(c);

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
		KatRental kr = new KatRental();
		kr.viewBookings();

	}

	private void viewCarOwnerDetails() {
		KatRental kr = new KatRental();
		kr.viewCarOwnerDetails();
	}

	private void viewVehicle() { 
		KatRental kr = new KatRental();
		kr.viewVehicles();
	}
 
	private void viewCustomer() {
		KatRental kr = new KatRental();
		kr.viewCustomers();

	}

	private void addDriver() {
		KatRental kr = new KatRental();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = in.next();
		System.out.println("aadhar No : ");
		String adharNo = in.next();
		System.out.println("phoneNo : ");
		String phoneNo = in.next();
		System.out.println("dateOfBirth : ");
		String dateOfBirth = in.next();
		System.out.println("location : ");
		String location = in.next();
		System.out.println("drivingLicence : ");
		String drivingLicence = in.next();
		System.out.println("userName : ");
		String userName = in.next();
		System.out.println("password  : ");
		String password = in.next();
		System.out.println("Email : ");
		String email = in.next();
		Driver d = new Driver.DriverBuilder(name, adharNo, phoneNo, dateOfBirth, location, drivingLicence, userName,
				password, email).build();
		if (kr.addDriver(d)) {
			System.out.println("Driver Added Successfull!!!");
		} else {
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


