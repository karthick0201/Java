package model;

public class CustomerPojo {
	
	private int cus_id; //Primary Key
	private String cusName;
	private String contactNo;
	private String cusType;
	private String emailId;
	private String userName; //Unique key
	private String password;
	
	public CustomerPojo(String cusName, String contactNo, String cusType, String emailId, String userName,
			String password) {
		this.cusName = cusName;
		this.contactNo = contactNo;
		this.cusType = cusType;
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
	}
	
	public int getCus_id() {
		return cus_id;
	}
	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getCusType() {
		return cusType;
	}
	public void setCusType(String cusType) {
		this.cusType = cusType;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
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
	@Override
	public String toString() {
		return "CustomerPojo [cus_id=" + cus_id + ", cusName=" + cusName + ", contactNo=" + contactNo + ", cusType="
				+ cusType + ", emailId=" + emailId + ", userName=" + userName + ", password=" + password + "]";
	}
	
}
