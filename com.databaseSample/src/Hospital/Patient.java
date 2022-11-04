package Hospital;

public class Patient {
	//STATIC VARIABLES:
	static int PATIENT_ID=DbOperations.getPatient_Id()+1;
	//INSTANCE VARIABLES:
	int patient_id;
	String name;
	String phoneNo;
	String inTime;
	String outTime;
	int timeTaken;
	//NEW PATIENT CREATION CONSTRUCTOR:
	Patient(String name,String inTime,String phoneNo){
		this.patient_id=PATIENT_ID++;
		this.name=name;
		this.inTime=inTime;
		this.phoneNo=phoneNo;
		timeTaken=0;
		outTime="";
	}
	
	//EXISTING USER COSNTRUCTOR:
	public Patient(int patient_id, String name, String phoneNo, String inTime) {
		this.patient_id = PATIENT_ID;
		this.name = name;
		this.phoneNo = phoneNo;
		this.inTime = inTime;
		this.outTime = "";
		this.timeTaken =0;
	}
	public void display() {
		System.out.println("---------------------------");
		System.out.println("Patient Id 	: " + patient_id);
		System.out.println("Name 		: " + name);
		System.out.println("Phone No 	: " + phoneNo);
		System.out.println("In time 	: " + inTime);
		System.out.println("Out Time 	: " + outTime);
		System.out.println("Time Taken 	: " + timeTaken);
		System.out.println("---------------------------");
	}
	

}
