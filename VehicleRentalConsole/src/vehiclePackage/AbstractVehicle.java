package vehiclePackage;

import java.util.Scanner;

public abstract class AbstractVehicle {

	
	private String brand_name;
	private String vehicleNumber;
	private String fuel; // diesal/petrol
	private String transMission;// automative / manuel
	private String ownerId;

	public AbstractVehicle() {
		
	}

	// constructor
	public AbstractVehicle(

			String brand_name, String vehicleNumber, String fuel, String transMission, String ownerId) {

		this.brand_name = brand_name;
		this.vehicleNumber = vehicleNumber;
		this.fuel = fuel;
		this.transMission = transMission;
		this.ownerId = ownerId;
	}

	// GET AND SET METHODS
	
	public String getOwnerId() {
		return ownerId;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getTransMission() {
		return transMission;
	}

	public void setTransMission(String transMission) {
		this.transMission = transMission;
	}
	
	public abstract void display();

}
