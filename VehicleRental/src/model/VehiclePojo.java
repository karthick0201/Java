package model;

public class VehiclePojo {
	private int carId,carSeatCount,carPricePerDay;
	private String carName,carNum,carModelNo,carType,carDescription,carStatus,carPhoto;
	

	public VehiclePojo(String carName, String carNum, String carModelNo, String carType, int carSeatCount,
		int carPricePerDay, String carDescription, String carStatus, String carPhoto) {
	super();
	this.carName = carName;
	this.carNum = carNum;
	this.carModelNo = carModelNo;
	this.carType = carType;
	this.carSeatCount = carSeatCount;
	this.carPricePerDay = carPricePerDay;
	this.carDescription = carDescription;
	this.carStatus = carStatus;
	this.carPhoto = carPhoto;
}
	
	
	//GET AND SET METHODS
	public int getCarId() {
		return carId;
	}
	
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public int getCarSeatCount() {
		return carSeatCount;
	}
	public void setCarSeatCount(int carSeatCount) {
		this.carSeatCount = carSeatCount;
	}
	public int getCarPricePerDay() {
		return carPricePerDay;
	}
	public void setCarPricePerDay(int carPricePerDay) {
		this.carPricePerDay = carPricePerDay;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarNum() {
		return carNum;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	public String getCarModelNo() {
		return carModelNo;
	}
	public void setCarModelNo(String carModelNo) {
		this.carModelNo = carModelNo;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getCarDescription() {
		return carDescription;
	}
	public void setCarDescription(String carDescription) {
		this.carDescription = carDescription;
	}
	public String getCarStatus() {
		return carStatus;
	}
	public void setCarStatus(String carStatus) {
		this.carStatus = carStatus;
	}
	public String getCarPhoto() {
		return carPhoto;
	}
	public void setCarPhoto(String carPhoto) {
		this.carPhoto = carPhoto;
	}
	
	@Override
	public String toString() {
		return "VehiclePojo [carId=" + carId + ", carSeatCount=" + carSeatCount + ", carPricePerDay=" + carPricePerDay
				+ ", carName=" + carName + ", carNum=" + carNum + ", carModelNo=" + carModelNo + ", carType=" + carType
				+ ", carDescription=" + carDescription + ", carStatus=" + carStatus + ", carPhoto=" + carPhoto + "]";
	}
	
}
