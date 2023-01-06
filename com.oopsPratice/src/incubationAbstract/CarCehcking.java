package incubationAbstract;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class CarCehcking {
	public static void main(String[] args) {

		
		String name="karthick";
		System.out.println(name);
		System.out.println(encryptPassword(name));
		
		System.out.println(encryptPassword("karthick"));
		
		
		
		
		
		
		List<Vehicle> vehicles= new ArrayList<Vehicle>();
		Car audi=new Car("audi", "suv");
		Car bmw=new Car("bmw", "suv");
		
		Bike b1=new Bike("honda", "red");
		Bike b2=new Bike("jawa", "black");
		
		vehicles.add(audi);
		vehicles.add(bmw);
		vehicles.add(b1);
		vehicles.add(b2);
		System.out.println(vehicles);
		
		
	}

	private static String encryptPassword(String password) {
		String encryptedpassword=null;
		
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
		
		return encryptedpassword;
	}
}

abstract class Vehicle {
	String name;

	public Vehicle(String name) {
		this.name = name;
	}
	public Vehicle() {
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" +name;
	}
	
}

class Car extends Vehicle {
	String type;

	public Car(String name, String c) {
		super(name);
		this.type = c;

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+ name +" : " + type;
	}

}

class Bike extends Vehicle {
	String color;

	public Bike(String name,String color) {
		super(name);
		this.color = color;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+name +" : " + color;
	}
}