package vehiclePackage;

import vehiclePackage.Car.CarBuilder;

public class Bike extends AbstractVehicle {

	private String modelNo;
	private String description;
	private int pricePerDay;
	private String startDate;
	private String end_Date;

	public Bike(BikeBuilder bikeBuilder) {
		super(bikeBuilder.brand_name, bikeBuilder.vehicleNumber, bikeBuilder.fuel, bikeBuilder.transMission,
				bikeBuilder.ownerId);
		this.modelNo = bikeBuilder.modelNo;
		this.description = bikeBuilder.description;
		this.pricePerDay = bikeBuilder.pricePerDay;
		this.startDate = bikeBuilder.startDate;
		this.end_Date = bikeBuilder.endDate;

	}

	public void setStartDate(String s) { 
		this.startDate=s;
	}
	public void setEndDate(String s) { 
		this.end_Date=s;
	}
	// BikeBuilder
	public static class BikeBuilder {

		private String ownerId;
		private String brand_name;
		private String vehicleNumber;
		private String fuel; // diesal/petrol
		private String transMission;

		/******************************************/

		private String modelNo;
		private String description;

		// optional parameter
		private int pricePerDay;

		private String startDate;
		private String endDate;

		public BikeBuilder(String ownerId, String brand_name, String vehicleNumber, String fuel, // diesal/petrol
				String transMission, String modelNo, String description) {
			// super class data
			this.ownerId = ownerId;
			this.brand_name = brand_name;
			this.vehicleNumber = vehicleNumber;
			this.fuel = fuel;
			this.transMission = transMission;
			// Bike class data
			this.modelNo = modelNo;
			this.description = description;
		}

		public BikeBuilder setPricePerDay(int pricePerDay) {
			this.pricePerDay = pricePerDay;
			return this;
		}

		public BikeBuilder setStartDate(String startDate) {
			this.startDate = startDate;
			return this;
		}

		public BikeBuilder setEndDate(String endDate) {
			this.endDate = endDate;
			return this;
		}

		public Bike build() {
			return new Bike(this);
		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + " : " + super.getBrand_name() + " : " + super.getVehicleNumber() + " : " + super.getOwnerId()
				+ " : " + modelNo + " : " + // match-back/sadan/suv

				pricePerDay + " : " + description + " : " +

				startDate + " : " + end_Date;
	}

	@Override
	public void display() {
		System.out.println("---------------------------------");
		System.out.println("VehicleNo    : " + getVehicleNumber());
		System.out.println("Model No     : " + modelNo);
		System.out.println("description  : " + description);
		System.out.println("pricePerDay  : " + pricePerDay);
		System.out.println("startDate    : " + startDate);
		System.out.println("end_Date     : " + end_Date);
		System.out.println("BrandName     : " + getBrand_name());
		System.out.println("Fuel          : " + getFuel());
		System.out.println("TransMission  : " + getTransMission());
		System.out.println("---------------------------------");
		
	}
	
	
}
