package vehiclePackage;

import java.util.NoSuchElementException;
import java.util.Scanner;

import vehiclePackage.Bike.BikeBuilder;

public class Car extends AbstractVehicle {
	Scanner inn = new Scanner(System.in);
	private String segment; // match-back/sadan/suv
	private String modelNo;
	private int pricePerDay;
	private String seatCount;
	private String driverId;
	private String description;
	private String startDate;
	private String endDate;

	// Constructor
	public Car() {
		super();
//
//		try {
//			System.out.print("Enter Segment : ");
//			String s = inn.next();
//			this.segment = s;
//			System.out.print("Enter Model-No : ");
//			this.modelNo = inn.next();
//			System.out.print("Price Per Day : ");
//			this.pricePerDay = inn.nextInt();
//			System.out.println("ENter Description : ");
//			this.description = inn.next();
//
//		} catch (NoSuchElementException nse) {
//			System.out.println("No such elemt !!!");
		//}

	}
	public Car(String seatCount,String s, String modelNo, int pricePerDay, String description,String brand_name, String vehicleNumber, String fuel, String transMission, String ownerId) {
		super( brand_name,  vehicleNumber,  fuel,  transMission,  ownerId);
		this.seatCount=seatCount;
		this.segment = s;
		this.modelNo = modelNo;
		this.pricePerDay = pricePerDay;
		this.description = description;
		this.startDate="12 10 2011";
		this.endDate="13 10 2011";

	}
	public Car(CarBuilder carBuilder) {
		super(carBuilder.brand_name, carBuilder.vehicleNumber, carBuilder.fuel, carBuilder.transMission,
				carBuilder.ownerId);
		this.segment = carBuilder.segment;
		this.modelNo = carBuilder.modelNo;
		this.pricePerDay = carBuilder.pricePerDay;
		this.seatCount = carBuilder.seatCount;
		this.driverId = carBuilder.driverId;
		this.description = carBuilder.description;
		this.startDate = carBuilder.startDate;
		this.endDate = carBuilder.endDate;

	}



	// Builder Class
	public static class CarBuilder {

		private String brand_name;
		private String vehicleNumber;
		private String fuel; // diesal/petrol
		private String transMission;

		/******************************************/
		private String segment; // match-back/sadan/suv
		private String modelNo;
		private String seatCount;
		private String description;
		private String ownerId;
		// optional parameter
		private int pricePerDay;
		private String driverId;
		private String startDate;
		private String endDate;

		public CarBuilder(String brand_name, String vehicleNumber, String fuel, // diesal/petrol
				String transMission, String segment, String modelNo, String seatCount, String description,
				String ownerId) {
			// super class data

			this.brand_name = brand_name;
			this.vehicleNumber = vehicleNumber;
			this.fuel = fuel;
			this.transMission = transMission;
			// car class data

			this.segment = segment;
			this.modelNo = modelNo;
			this.seatCount = seatCount;
			this.description = description;
			this.ownerId = ownerId;
		}

		public CarBuilder setPricePerDay(int pricePerDay) {
			this.pricePerDay = pricePerDay;
			return this;
		}

		public CarBuilder setStartDate(String startDate) {
			this.startDate = startDate;
			return this;
		}

		public CarBuilder setEndDate(String endDate) {

			this.endDate = endDate;
			return this;
		}

		public CarBuilder setDriverId(String driverId) {

			this.driverId = driverId;
			return this;
		}

		public Car build() {
			return new Car(this);
		}

	}

	@Override
	public String toString() {

		return "" + " : " + super.getBrand_name() + " : " + super.getVehicleNumber() + " : "
				+ super.getOwnerId() + " : " + segment + " : " + // match-back/sadan/suv

				pricePerDay + " : " + seatCount + " : " + driverId + " : " +

				startDate + " : " + endDate;
	}
	@Override
	public void display() {
		System.out.println("---------------------------------");
		System.out.println("Model No     : " + modelNo);
		System.out.println("Seat Count   : " + seatCount);
		System.out.println("description  : " + description);
		System.out.println("pricePerDay  : " + pricePerDay);
		System.out.println("startDate    : " + startDate);
		System.out.println("end_Date     : " + endDate);
		System.out.println("BrandName     : " + getBrand_name());
		System.out.println("Fuel          : " + getFuel());
		System.out.println("VehicleNo     : " + getVehicleNumber());
		System.out.println("TransMission  : " + getTransMission());
		System.out.println("---------------------------------");
		
	}
}
