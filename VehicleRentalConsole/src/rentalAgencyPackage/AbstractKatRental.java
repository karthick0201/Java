package rentalAgencyPackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import bookingPackage.Booking;
import citizenPackage.CarOwner;
import citizenPackage.Customer;
import citizenPackage.Driver;
import vehiclePackage.AbstractVehicle;

public abstract class AbstractKatRental implements InterfaceRental {
	
	private static int vehicleIdStatic;
	private static int	ownerIdstatic;
	
	
	
	final public static String encryptPassword(String p) {   
		
		 String password =p;  
	        String encryptedpassword = null;  
	        try   
	        {  
	            /* MessageDigest instance for MD5. */  
	            MessageDigest m = MessageDigest.getInstance("MD5");  
	              
	            /* Add plain-text password bytes to digest using MD5 update() method. */  
	            m.update(password.getBytes());  
	              
	            /* Convert the hash value into bytes */   
	            byte[] bytes = m.digest();  
	              
	            /* The bytes array has bytes in decimal form. Converting it into hexadecimal format. */  
	            StringBuilder s = new StringBuilder();  
	            for(int i=0; i< bytes.length ;i++)  
	            {  
	                s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));  
	            }  
	              
	            /* Complete hashed password in hexadecimal format */  
	            encryptedpassword = s.toString();  
	        }   
	        catch (NoSuchAlgorithmException e)   
	        {  
	            e.printStackTrace();  
	        }  
	          
//	        /* Display the unencrypted and encrypted passwords. */  
//	        System.out.println("Plain-text password: " + password);  
//	        System.out.println("Encrypted password using MD5: " + encryptedpassword);  
	
	
		
		
		//String encrypt=password;
		
		
		
		
		return encryptedpassword;
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
