package bookingPackage;

import java.util.ArrayList;
import java.util.List;

import citizenPackagePojo.Customer;
import citizenPackagePojo.PrimeCustomer;
import vehiclePackage.AbstractVehicle;

public class Booking {
	
	private Customer c;
	private AbstractVehicle av;
	
	public Booking(Customer ac,AbstractVehicle av) {
		
	}
	private int bookingId;
	private String customerId;
	private String startDate;
	private String endDate;
	private int price;

	private String streetName;
	private String city;
	private String state;
	private String pincode;
	private List<String> veicleIds;
	
	
	public Booking() {
		veicleIds=new ArrayList<String>();
	}
	public List<String> getVeicleIds1(){
		return veicleIds;
	}
	
	
	
	//methods
	void book(Customer c) {

	}

	void book(PrimeCustomer pc) {

	}
	
	
	
	
	//get and set methods
	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public List<String> getVeicleIds() {
		return veicleIds;
	}

	public void setVeicleIds(List<String> veicleIds) {
		this.veicleIds = veicleIds;
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
 