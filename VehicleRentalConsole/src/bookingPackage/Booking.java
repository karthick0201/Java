package bookingPackage;

import java.util.List;

import citizenPackage.Customer;
import citizenPackage.PrimeCustomer;

public class Booking {
	
	private int bookingId;
	private int customerId;
	private String startDate;
	private String endDate;
	private int price;

	private String streetName;
	private String city;
	private String state;
	private String pincode;

	List<Integer> veicleIds;

	void book(Customer c) {

	}

	void book(PrimeCustomer pc) {

	}
	
	public void viewBooking() {
		System.out.println("------------------------------");
		System.out.println("Booking Id : " + bookingId);
		System.out.println("Customer Id : " + customerId);
		System.out.println("StartDate : " + startDate);
		System.out.println("End Date : " + endDate);
		System.out.println("Price : " + price );
		System.out.println("StreetName : " + streetName);
		System.out.println("cITY : " + city);
		System.out.println("State : " + state);
		System.out.println("Pincode : " + pincode);
		System.out.println("-------------------------------");
	}

}
 