package rentalAgencyPackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import bookingPackage.Booking;
import citizenPackagePojo.CarOwner;
import citizenPackagePojo.Customer;
import citizenPackagePojo.Driver;
import vehiclePackage.AbstractVehicle;
import vehiclePackage.Bike;
import vehiclePackage.Car;

public class KatRental extends AbstractKatRental {

//	static {    
//		vehicles = new HashMap<String, AbstractVehicle>();
//		customers = new HashMap<String, Customer>();
//		bookings = new HashMap<Integer, Booking>();
//		drivers = new HashMap<String, Driver>();
//		carOwners = new HashMap<String, CarOwner>();
//		tempVehicles = new HashMap<Integer, AbstractVehicle>();
//	}
	static {
		KatRental chennaiBranch = new KatRental("Chennai1");

		KatRental maduraiBranch = new KatRental("Madurai1");

		KatRental.branches.put(chennaiBranch.getBranchName(), chennaiBranch);

		KatRental.branches.put(maduraiBranch.getBranchName(), maduraiBranch);

	}
	private String branchName;
	
	private static Map<String, KatRental> branches = new HashMap<String, KatRental>();
	private Map<String, AbstractVehicle> vehicles;
	private Map<String, Customer> customers;
	private Map<Integer, Booking> bookings;
	private Map<String, Driver> drivers;
	private Map<String, CarOwner> carOwners;
	private Map<Integer, AbstractVehicle> tempVehicles;
	
	public final static String adminVehicleId = "-1";

	private static int staticBookingId = 31;

	public KatRental(String branchName) {
		this.branchName = branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchName() {
		return branchName;
	}

	public int getStaticBookingId() {
		return staticBookingId++;
	}

	// CONSTRUCTOR:
//	public KatRental() {
//
//	}

//interface override methods
	@Override
	public void bookVehicle(String cusId, Booking booking) {
		bookings.put(booking.getBookingId(), booking);
		Customer c = customers.get(cusId);
		c.getBookingIds().add(booking.getBookingId());
		System.out.println("Booking Added Successfull!!");
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

	public boolean addCustomer(Customer c) {
		customers.put(c.getUserName(), c);
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
		drivers.put(d.getUserName(), d);

		return true;
	}

	public void viewCustomers() {
		Set<String> s = customers.keySet();
		Iterator<String> i = s.iterator();
		while (i.hasNext()) {
			Customer cus = customers.get(i.next());
			cus.display();
		}
	}

	public void viewVehicles() {
		Set<String> s = vehicles.keySet();
		Iterator<String> i = s.iterator();
		while (i.hasNext()) {
			AbstractVehicle v = vehicles.get(i.next());
			v.display();
		}
	}

	public void viewCarOwnerDetails() {
		Set<String> s = carOwners.keySet();
		Iterator<String> i = s.iterator();
		while (i.hasNext()) {
			CarOwner cus = carOwners.get(i.next());
			cus.display();
		}
	}

	public void viewBookings() {

		Set<Integer> s = bookings.keySet();
		Iterator<Integer> i = s.iterator();
		while (i.hasNext()) {
			Booking cus = bookings.get(i.next());
			cus.viewBooking();
		}
	}

	public void registerCustomer(Customer c) {
		customers.put(c.getUserName(), c);
		System.out.println("Registered Successfull!!!");

	}

	public void newCarOwnerRegister(CarOwner co) {
		carOwners.put(co.getUserName(), co);

	}

	public boolean vaildateCustomer(String uname, String psw) {
		if (customers.containsKey(uname)) {
			Customer c = customers.get(uname);
			if (c.getPassword().equals(psw)) {
				return true;
			} else {
				return false;
			}
		} else {
			System.out.println("Invaild!!");
			return false;
		}

	}

	public void addCarOwner(CarOwner co) {
		carOwners.put(co.getUserName(), co);
	}

	public boolean vaildateDate(String startDate, String endDate, String vehicleNumber) {
		AbstractVehicle av = vehicles.get(vehicleNumber);
		// check date list is empty or not
		if (av.isEmptyVehicleDates()) {
			return true;
		}

		/******* Date Calculation *************/
		// get last date from list of dates
		String vehicleAvaiableDate = av.getLastDate();

		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
			Date date1 = simpleDateFormat.parse(startDate);
			Date date2 = simpleDateFormat.parse(endDate);
			Date date3 = simpleDateFormat.parse(vehicleAvaiableDate);

			if (date1.after(date3)) {
				return true;
			}
			return false;

		} catch (ParseException e) {

			e.printStackTrace();
		}

		return false;
	}

	public void bookVehicle(String cusId, Booking b1, String vehicleNumber) {
		// booking class --> vehicle id add
		b1.getVeicleIds().add(vehicleNumber);
		// vehicle id-->avaiable date and vehice date add
		AbstractVehicle av = getVehicles().get(vehicleNumber);
		// p1
		av.getVehicleDates().add(b1.getEndDate());

		Car c;
		Bike b;
		// p2 and p3
		if (av instanceof Car) {
			c = (Car) av;
			c.setStartDate(b1.getStartDate());
			c.setEndDate(b1.getEndDate());

		}
		if (av instanceof Bike) {
			b = (Bike) av;
			b.setStartDate(b1.getStartDate());
			b.setEndDate(b1.getEndDate());

		}

	}

	public void priceWiseDispaly() {

		Set<Map.Entry<String, AbstractVehicle>> s = vehicles.entrySet();
		List<Map.Entry<String, AbstractVehicle>> list = new ArrayList<>(s);

		// WAY -1: --> FUNCTIONAL INTERFACE
		// ComparatorDemo cd=new ComparatorDemo();
		/*
		 * Collections.sort(list, new Comparator<Entry<String, Customer>>() {
		 * 
		 * @Override public int compare(Map.Entry<String, Customer> o1,
		 * Map.Entry<String, Customer> o2) {
		 * 
		 * if (o1.getValue().getBalance() > o2.getValue().getBalance()) return -1; else
		 * if (o1.getValue().getBalance() < o2.getValue().getBalance()) return +1; else
		 * return 0; } });
		 */
		// WAY -2 IMPLEMNT COMPARATOR IN custom CLASS
		vehicleRentalManage.ComparatorDemo cd = new vehicleRentalManage.ComparatorDemo();
		Collections.sort(list, cd);
		// ITERATION PROCESS
		Iterator<Map.Entry<String, AbstractVehicle>> i = list.iterator();
		while (i.hasNext()) {
			Map.Entry<String, AbstractVehicle> me = i.next();
			AbstractVehicle av = me.getValue();
			av.display();
		}

	}

	public void viewCustomerBookings(String uname) {
		Customer c = customers.get(uname);
		List<Integer> bookingIds = c.getBookingIds();

//		Set<Map.Entry<Integer, Booking>> s=bookings.entrySet();
//		Iterator<Map.Entry<Integer, Booking>> i=s.iterator();
//		
		Iterator<Integer> b = bookingIds.iterator();
		while (b.hasNext()) {
			int id = b.next();
			Booking booking = bookings.get(id);
			booking.viewBooking();
		}

	}
}
