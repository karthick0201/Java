package citizenPackage;

import java.util.List;
import java.util.Map;

import bookingPackage.Booking;

public class Customer extends AbstractCitizen {
	private int customerId;
	private String email;
	private String drivingLicence;
	private boolean subscription;
	private String userName;
	private String password;
	private List<Integer> bookingIds;

	public Customer(String name, String adharNo, String phoneNo, String dateOfBirth, String location, int customerId,
			String email, String drivingLicence, boolean subscription, String userName, String password,
			List<Integer> bookingIds) {
		super(name, adharNo, phoneNo, dateOfBirth, location);
		this.customerId = customerId;
		this.email = email;
		this.drivingLicence = drivingLicence;
		this.subscription = subscription;
		this.userName = userName;
		this.password = password;
		this.bookingIds = bookingIds;
	}
	public void display() {
		System.out.println("--------------------------------------");
		System.out.println("Customer Id    : " + customerId);
		System.out.println("email          : " + email);
		System.out.println("drivingLicence : " + drivingLicence);
		System.out.println("subscription   : " + subscription);
		System.out.println("userName       : " + userName);
		System.out.println("password       : " + password);
		System.out.println("Booing ids : " + bookingIds);
		System.out.println("---------------------------------------");
		
		
	}
}
