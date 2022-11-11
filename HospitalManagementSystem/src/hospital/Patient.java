package hospital;

public class Patient {
	int patient_id;  //
	String name; //
	String phoneNo; //
	String inTime; //
	String outTime;
	int doctorTime; //
	int timeTaken; 
	int waitingTime;
	/*CONSTRUCTORS*/
//	public Patient(String name, String phoneNo, String inTime, int doctorTime2) {
//		this.name=name;
//		this.phoneNo=phoneNo;
//		this.inTime=inTime;
//		this.doctorTime=doctorTime2;
//	}
	public Patient(String name, String phoneNo) {
		this.name=name;
		this.phoneNo=phoneNo;
	}
	public Patient(int p_id, String inTime, int doctorTime, int waitingTime,String outtime) {
		this.patient_id = p_id;
		this.inTime = inTime;
		this.doctorTime = doctorTime;
		this.waitingTime = waitingTime;
		this.outTime = outtime;
	}
	/*GET AND SET METHODS*/
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	public int getTimeTaken() {
		return timeTaken;
	}
	public void setTimeTaken(int timeTaken) {
		this.timeTaken = timeTaken;
	}
	public int getWaitingTime() {
		return waitingTime;
	}
	public void setWaitingTime(int waitingTime) {
		this.waitingTime = waitingTime;
	}
	
}
