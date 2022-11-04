package Hospital;

import java.sql.*;
import java.util.*;

public class HospitalDemo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("\tRKM HOSIPITAL\n\t---------------");
		boolean check=true;
		int choice;
		while(check) {
			System.out.println("1. Entry\n2. Records\n3. Exit");
			System.out.print("Enter Your CHoice : ");
			choice=in.nextInt();
			switch(choice) {
			case 1:
				System.out.println("<<<<<Entry>>>>>");
				Patient p=patientChecking();
				//TIME ADDING
				hospitalTimeCalculate(p); //---> return calculate value minute and write sorry comment 
				p.display();
				
				break;
			case 2:
				System.out.println("Case 2");
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
		Scanner inn=new Scanner(System.in);
		System.out.println("\tWelcome");
		System.out.print("Enter Name : ");
		String name=in.next();
		System.out.print("Enter Phone No. : ");
		String phoneNo=in.next();
		System.out.println("Enter In Time(\"19:00:00\"): ");
		String time=in.next();
		//EXISTING PATIENT OBJECT CREATION:
		Patient p = null;
		if(DbOperations.existingPatient(name,phoneNo)) {
			p=DbOperations.existingPatient(name,phoneNo,time);
			System.out.println("Printing from patientCHecking in HospitalDemo Class");
			
		}else {
			//IF NOT NEW PATIENT CREATION:
			System.out.println("New Custoemer!!!!");
			p=DbOperations.existingPatient(name, phoneNo, time);
		}
		return p;
	}

	private static void hospitalTimeCalculate(Patient p) {
		int minutes=0;
		//MEDICAL PROFESSIONALS: -- 5MINS EACH
		final int medicalProfessionals=10; //2.
		/*-----------------------------------------------------------*/
		//MEET DOCTOR TOOK TIME BETWEEN 2 TO 20 MINS   
		//(int)(Math.random()*(max-min+1)+min);   ---> format
		int min=2;
        int max=20;
        int doctorTime=(int)(Math.random()*(max-min+1)+min);  //----> below code randomly generate we given numbers
        System.out.println("Random nUmber : " + doctorTime);
        /*-----------------------------------------------------------*/
        int pharmacy = 5;
        
        minutes=medicalProfessionals+doctorTime+pharmacy;
        System.out.println("Total Minitues : " + minutes);
        p.timeTaken=minutes;
        System.out.println("Works done!!! form HospitalDemo class");
		
		
	}

}
