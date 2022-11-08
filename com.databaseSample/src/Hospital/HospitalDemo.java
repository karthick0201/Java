package Hospital;

import java.sql.*;
import java.util.*;

public class HospitalDemo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("\n\tKKH HOSIPITAL\n\t-------------");
		boolean check=true;
		int choice;
		while(check) {
			System.out.println("\t1. Entry\n\t2. Records\n\t3. Exit\n\t--------------");
			System.out.print("Enter Your CHoice : ");
			choice=in.nextInt();
			switch(choice) {
			case 1:
				Patient p=null;
				 p=patientChecking();
				//TIME ADDING
				int timeTaken=hospitalTimeCalculate(p); 
				//ADDING TIME TO USER OBJECT AND SAY SORRY MESSAGE
				p.timeTaken=timeTaken;
				//SET OUT TIME:
				p.calculateOutTime(timeTaken,p.inTime);
				//ADD OBJECT TO DATABASE:
				DbOperations.addDataIntoDB(p);
				p.display();
				break;
			case 2:
				
				System.out.println("\t\t     Patient Details");
				System.out.println("------------------------------------------------------------------------");
				DbOperations.printDBData();
				break;
			case 3:
				System.out.println("Thank You!!!");
				check=false;
				break;
				default:
					System.out.println("Wrong Option!!!");
			}
		}

	}



	private static Patient patientChecking() {
		Scanner in = new Scanner(System.in);
		System.out.println("\tWelcome");
		System.out.print("Enter Name : ");
		String name=in.next();
		System.out.print("Enter Phone No. : ");
		String phoneNo=in.next();
		System.out.println("Enter In Time(\"19:20\"): ");
		String time=in.next();
		//EXISTING PATIENT OBJECT CREATION:
		Patient p = null;
		if(DbOperations.existingPatient(name,phoneNo)) {
			p=DbOperations.existingPatient(name,phoneNo,time);
		}else {
			//NEW PATIENT CREATION:
			System.out.println("<<<***New Custoemer***>>>");
			p=DbOperations.existingPatient(name, phoneNo, time);
		}
		return p;
	}

	private static int hospitalTimeCalculate(Patient p) {
		int minutes=0;
		//MEDICAL PROFESSIONALS: -- 5MINS EACH
		final int medicalProfessionals=10; //2.
		/*-----------------------------------------------------------*/
		//MEET DOCTOR TOOK TIME BETWEEN 2 TO 20 MINS   
		//(int)(Math.random()*(max-min+1)+min);   ---> format
		int min=2;
        int max=20;
        int doctorTime=(int)(Math.random()*(max-min+1)+min);  //----> below code randomly generate we given numbers
        //System.out.println("Doctor Time : " + doctorTime);
        /*-----------------------------------------------------------*/
        int pharmacy = 5;
        
        minutes=medicalProfessionals+doctorTime+pharmacy;
//        System.out.println("Total Minitues : " + minutes);
        p.timeTaken=minutes;
     
        
        
        /****************************************
        		TIME CALCULATION PRINT
        *****************************************/
        System.out.println("******************************************");
        System.out.println("Medical Professionals : " + medicalProfessionals);
        System.out.println("Doctor Time           : " + doctorTime);
        System.out.println("Pharmacy              : " + pharmacy);
        System.out.println("Total Time            : " + minutes);
        
        
        /****************************************/
        
        
        /*----------------------------
         * Calculate Waiting Time:
         * above 10Mins -->calculate waiting time
         * doctorTime-MaxTime+aboveTime
         * ans : waiting time
         * 
         * ----------------------------*/
        int aboveTime=10;
        int waitingTime=0;
        
        //checking condition for minise value set zero
   
        if(doctorTime>aboveTime) {
        	waitingTime=doctorTime-max+aboveTime;
        	System.out.println("Waiting Time          : " +waitingTime);
        	System.out.println("<*****SorrY FoR LatE*****>");
        }else {
        	System.out.println("Waiting Time          : " +waitingTime);
        }
        System.out.println("******************************************");
        return minutes;
		
		
	}

}
