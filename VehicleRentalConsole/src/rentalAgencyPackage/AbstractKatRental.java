package rentalAgencyPackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import bookingPackage.Booking;
import citizenPackagePojo.CarOwner;
import citizenPackagePojo.Customer;
import citizenPackagePojo.Driver;
import vehiclePackage.AbstractVehicle;

public abstract class AbstractKatRental implements InterfaceRental {
	
	private static int vehicleIdStatic;
	private static int	ownerIdstatic;
	
	
	
	final public static String encryptPassword(String p) {    
		/*Id : 1*/
		 return p;
	}
	
	// vehicleId,abstractVehicle
	public abstract Map<String, AbstractVehicle> getVehicles();

	// username,customer
	public abstract Map<String, Customer> getCustomers();

	// bookingid,booking
	public abstract Map<Integer, Booking> getBookings();

	// username,Driver
	public abstract Map<String, Driver> getDrivers();

	// usrname,carOwner
	public abstract Map<String, CarOwner> getCarOwners();

	// VehicleId,AstractVehicle
	public abstract Map<Integer, AbstractVehicle> getTempVehicles();

	public abstract boolean addVehicle(AbstractVehicle v);
	public abstract boolean addDriver(Driver d);
	
	public abstract boolean authenticateCustomer();
	
}
