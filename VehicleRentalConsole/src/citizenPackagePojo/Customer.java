package citizenPackagePojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import bookingPackage.Booking;

public class Customer extends AbstractCitizen {
	
	private String email;
	private String drivingLicence;
	private boolean subscription;
	private String userName;
	private String password;
	private List<Integer> bookingIds;

	public Customer(String name, String adharNo, String phoneNo, String dateOfBirth, String location,
			String email, String drivingLicence, boolean subscription, String userName, String password) {
		super(name, adharNo, phoneNo, dateOfBirth, location);
		
		this.email = email;
		this.drivingLicence = drivingLicence;
		this.subscription = subscription;
		this.userName = userName;
		this.password = password;
		
		bookingIds = new ArrayList<Integer>();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDrivingLicence() {
		return drivingLicence;
	}
	public void setDrivingLicence(String drivingLicence) {
		this.drivingLicence = drivingLicence;
	}
	public boolean isSubscription() {
		return subscription;
	}
	public void setSubscription(boolean subscription) {
		this.subscription = subscription;
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
	public List<Integer> getBookingIds() {
		return bookingIds;
	}
	public void setBookingIds(List<Integer> bookingIds) {
		this.bookingIds = bookingIds;
	}
	public void display() {
		System.out.println("--------------------------------------");
		System.out.println("email          : " + email);
		System.out.println("drivingLicence : " + drivingLicence);
		System.out.println("subscription   : " + subscription);
		System.out.println("userName       : " + userName);
		System.out.println("password       : " + password);
		System.out.println("Booing ids     : " + bookingIds);
		System.out.println("---------------------------------------");
		
		
	}
}
