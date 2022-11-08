package Hospital;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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
		//System.out.println("patient id (constructor) : " + this.PATIENT_ID);
		this.patient_id=PATIENT_ID++;
		this.name=name;
		this.inTime=inTime;
		this.phoneNo=phoneNo;
		timeTaken=0;
		outTime="";
	}
	
	//EXISTING USER COSNTRUCTOR:
	public Patient(int patient_id, String name, String phoneNo, String inTime) {
		//System.out.println("patient id (constructor-2) : " + patient_id);
		this.patient_id = patient_id;
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

	public void calculateOutTime(int timeTaken, String inTime) {
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
	    LocalTime lt = LocalTime.parse(inTime);
	    String time=df.format(lt.plusMinutes(timeTaken));
	    this.outTime=time;
	    //System.out.println(time + "outTime set from calculateoutTime method in patient class");	    
		
	}
	

}
