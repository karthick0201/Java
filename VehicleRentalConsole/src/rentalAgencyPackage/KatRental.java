package rentalAgencyPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import bookingPackage.Booking;
import citizenPackage.CarOwner;
import citizenPackage.Customer;
import citizenPackage.Driver;
import vehiclePackage.AbstractVehicle;

public class KatRental extends AbstractKatRental {

	static {  
		vehicles = new HashMap<String, AbstractVehicle>();
		customers = new HashMap<String, Customer>();
		bookings = new HashMap<Integer, Booking>();
		drivers = new HashMap<String, Driver>();
		carOwners = new HashMap<String, CarOwner>();
		tempVehicles = new HashMap<Integer, AbstractVehicle>();
	}

	private static Map<String, AbstractVehicle> vehicles;
	private static Map<String, Customer> customers;
	private static Map<Integer, Booking> bookings;
	private static Map<String, Driver> drivers;
	private static Map<String, CarOwner> carOwners;
	private static Map<Integer, AbstractVehicle> tempVehicles;

	// CONSTRUCTOR:
	public KatRental() {
		
	}


//interface override methods
	@Override
	public void bookVehicle() {

	}

	// override methods from super class
	@Override
	public Map<String, AbstractVehicle> getVehicles() {
		return vehicles;
	}

	@Override
	public Map<String, Customer> getCustomers() {
		return customers;
	}

	@Override
	public Map<Integer, Booking> getBookings() {
		return bookings;
	}

	@Override
	public Map<String, Driver> getDrivers() {
		return drivers;
	}

	@Override
	public Map<String, CarOwner> getCarOwners() {
		return carOwners;
	}

	@Override
	public Map<Integer, AbstractVehicle> getTempVehicles() {
		return tempVehicles;
	}

	public boolean addCustomer() {
		return false;
	}

	@Override
	public boolean addVehicle(AbstractVehicle av) {
		vehicles.put(av.getVehicleNumber(), av);
		return true;
	}

	public static boolean authenticateAdmin(String userName, String password) {
		String c = AbstractKatRental.encryptPassword("admin");
		String encrypt = AbstractKatRental.encryptPassword(password);
		if (userName.equals("admin") && encrypt.equals(c)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean authenticateCustomer() {

		return false;
	}


	@Override
	public boolean addDriver(Driver d) {
		drivers.put(d.getUserName(),d);
		
		return true;
	}


	public void viewCustomers() {
		Set<String> s=customers.keySet();
		Iterator<String> i=s.iterator();
		while(i.hasNext()) {
			Customer cus=customers.get(i.next());
			cus.display();
		}
	}
	public void viewVehicles() {
		Set<String> s=vehicles.keySet();
		Iterator<String> i=s.iterator();
		while(i.hasNext()) {
			AbstractVehicle cus=vehicles.get(i.next());
			cus.display();
		}
	}


	public void viewCarOwnerDetails() {
		Set<String> s=carOwners.keySet();
		Iterator<String> i=s.iterator();
		while(i.hasNext()) {
			CarOwner cus=carOwners.get(i.next());
			cus.display();
		}
	}


	public void viewBookings() {
		
		Set<Integer> s=bookings.keySet();
		Iterator<Integer> i=s.iterator();
		while(i.hasNext()) {
			Booking cus=bookings.get(i.next());
			cus.viewBooking();
		}
	}
}
