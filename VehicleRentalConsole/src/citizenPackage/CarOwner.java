package citizenPackage;

import java.util.List;

import vehiclePackage.Car;

public class CarOwner extends AbstractCitizen {
	public CarOwner(String name, String adharNo, String phoneNo, String dateOfBirth, String location) {
		super(name, adharNo, phoneNo, dateOfBirth, location);
		// TODO Auto-generated constructor stub
	}
	private String userName;
	private String password;
	private String email;
	private String drivingLicienceNo;
	private String WalletBalance;
	private List<Car> cars;
	
	
	public void display() {
		System.out.println("NAME : " + super.getName());
		System.out.println("Aadhaar No : " + super.getAdharNo());
		System.out.println("pHONE no : " + super.getPhoneNo());
		System.out.println("dob : " + super.getDateOfBirth() );
		System.out.println( "Location : " + super.getLocation());
		System.out.println("userName : " + userName);
		System.out.println("Password : " + password);
		System.out.println("Email : " + email);
		System.out.println("Driving Licience : " + drivingLicienceNo);
		System.out.println("Wallet Balance : " + WalletBalance);
		System.out.println("Cars : " + cars);
		
	}
}
