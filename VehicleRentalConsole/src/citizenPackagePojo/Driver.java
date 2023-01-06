package citizenPackagePojo;

import rentalAgencyPackage.AbstractKatRental;

public class Driver extends AbstractCitizen {
	private String drivingLicence;
	private String userName;
	private String password;
	private String email;
	private String avaiableDate;

	public String getDrivingLicence() {
		return drivingLicence;
	}
	public void setDrivingLicence(String drivingLicence) {
		this.drivingLicence = drivingLicence;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAvaiableDate() {
		return avaiableDate;
	}
	public void setAvaiableDate(String avaiableDate) {
		this.avaiableDate = avaiableDate;
	}
	
	public Driver(DriverBuilder driverBuilder) { 
		super(driverBuilder.name, driverBuilder.adharNo, driverBuilder.phoneNo, driverBuilder.dateOfBirth, driverBuilder.location);
		this.drivingLicence=driverBuilder.drivingLicence;
		this.userName=driverBuilder.userName;
		this.password=AbstractKatRental.encryptPassword(driverBuilder.password);
		this.email=driverBuilder.email;
		this.avaiableDate=driverBuilder.avaiableDate;
	}
	public static class DriverBuilder {

		private String name;
		private String adharNo;
		private String phoneNo;
		private String dateOfBirth;
		private String location;

		private String drivingLicence;
		private String userName;
		private String password;
		private String email;
		private String avaiableDate;

		/******************************************/

		// optional parameter

		public DriverBuilder(String name, String adharNo, String phoneNo, String dateOfBirth, String location,
				String drivingLicence, String userName, String password, String email) {
			this.name=name;
			this.adharNo=adharNo;
			this.phoneNo=phoneNo;
			this.dateOfBirth=dateOfBirth;
			this.location=location;
			
			this.drivingLicence = drivingLicence;
			this.userName = userName;
			this.password = password;
			this.email = email;
			

		}
		public DriverBuilder setAvaiableDate(String avaiableDate) {
			this.avaiableDate = avaiableDate;
			return this;
		}
		public Driver build() {
			return new Driver(this);
		}

	}

}
