package citizenPackage;

public abstract class AbstractCitizen {

	private String name;
	private String adharNo;
	private String phoneNo;
	private String dateOfBirth;
	private String location;
	
	public AbstractCitizen(String name, String adharNo, String phoneNo, String dateOfBirth, String location) {
	
	this.name=name;
	this.adharNo=adharNo;
	this.phoneNo=phoneNo;
	this.dateOfBirth=dateOfBirth;
	this.location=location;
	
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	
	
}
