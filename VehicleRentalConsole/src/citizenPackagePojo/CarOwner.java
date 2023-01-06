package citizenPackagePojo;

import java.util.ArrayList;
import java.util.List;

import vehiclePackage.Car;

public class CarOwner extends AbstractCitizen {
	
	private String userName;
	private String password;
	private String email;
	private String drivingLicienceNo;
	private String WalletBalance;
	private List<Car> cars;
	
	public CarOwner(String name, String adharNo, String phoneNo, String dateOfBirth, String location,String userName,String password,String email,String drivingLicienceNo,String WalletBalance) {
		super(name, adharNo, phoneNo, dateOfBirth, location);
		this.userName=userName;
		this.password=password;
		this.email=email;
		this.drivingLicienceNo=drivingLicienceNo;
		this.WalletBalance= WalletBalance;
		cars=new ArrayList<Car>();
		
	}
	public void addVehicle(Car c) {
		cars.add(c);
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDrivingLicienceNo() {
		return drivingLicienceNo;
	}

	public void setDrivingLicienceNo(String drivingLicienceNo) {
		this.drivingLicienceNo = drivingLicienceNo;
	}

	public String getWalletBalance() {
		return WalletBalance;
	}

	public void setWalletBalance(String walletBalance) {
		WalletBalance = walletBalance;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public void display() {
		System.out.println("NAME     : " + super.getName());
		System.out.println("Aadhaar  : " + super.getAdharNo());
		System.out.println("pHONE no : " + super.getPhoneNo());
		System.out.println("dob      : " + super.getDateOfBirth() );
		System.out.println("Location : " + super.getLocation());
		System.out.println("userName : " + userName);
		System.out.println("Password : " + password);
		System.out.println("Email    : " + email);
		System.out.println("D-Licience : " + drivingLicienceNo);
		System.out.println("Wallet Balance : " + WalletBalance);
		System.out.println("Cars     : " + cars);
		
	}
}
