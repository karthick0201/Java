package RailwayPackage;

import java.util.*;

public class TrainDemo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("----------------------------------------");
		System.out.println("\n\tVAIGAI TRAIN TICKET BOOKING\n");
		System.out.println("----------------------------------------");
		
		
		
		/*VARIABLE DECLERARATION:   */
		TicketBooking ticketBooking=new TicketBooking(); 
		int end;
		int pNR;
	
		
		do {
			System.out.println("\n-----------------------------------------");
			System.out.println("1. Book Ticket\n2. Cancel Ticket\n3. Print Ticket\n4. Avaiable Ticket\n5. Exit ");
			System.out.println("-----------------------------------------\n");
			System.out.print("Enter Your Option!!!  :  ");
			end=in.nextInt();
			switch(end) {
			case 1:
				System.out.println("TIcket booking");
				ticketBook(ticketBooking);
				break;
			case 2:
				System.out.println("Cancel booking...");
				System.out.println("Enter PNR Number to Cancel : ");
				pNR=in.nextInt();
				ticketCancel(pNR,ticketBooking);	
				break;
			case 3:
				System.out.println("Print Ticket...");
				System.out.print("Enter Your PNR Number : ");
				pNR=in.nextInt();
				ticketBooking.PrintDetails(pNR);
				break;
			case 4:
				System.out.println("Avaiable Ticket...");
				ticketBooking.avaiableTicket();
				break;
			case 5:
				System.out.println("Thank You!!!!");
				break;
				default:
					System.out.println("Wrong Option!!!\n\tYou Fool!!!");
					break;
			}
		}while(end!=5);
		
		

	}

	private static void ticketCancel(int pNR, TicketBooking ticketBooking) {
		int n1=ticketBooking.topTicketCount;
		int n2=ticketBooking.topRAC;
		int n3=ticketBooking.topWL;
		//REMOVE CONDITION:
		  //1. ARRAY ->1:
		if(ticketBooking.avaiableTicketCount==8) {
			System.out.println("No Tickets Avaiable to Cancel!!!");
			return;
		}
		else{
			for(int i=0;i<n1;i++) {
			Passenger p=ticketBooking.bookedTicket[i]; //temp obj
			System.out.println(p.pNR);
			if(pNR==p.pNR) {
//				for(int j=i;j<n1-1;j++) {
//					Passenger p1=ticketBooking.bookedTicket[i];
//					Passenger p2=ticketBooking.bookedTicket[i+1];
//					//p.setDetails(p2);
//					p1.setDetails(p2);
//					System.out.println("checking..");
//					System.out.println(p1.bP);
//					System.out.println(p2.bP);
//				}
//				//SWAP CONCEPT:
				System.out.println("-------------------PRint All Detail(B)--------------------");
				for(int c=0;c<n1;c++) {
					Passenger cc=ticketBooking.bookedTicket[c];
					cc.passengerDetails();
				}
				System.out.println("-------------------PRint All Detail(B)--------------------");
				for(int j=i;j<n1-1;j++) {
					//Passenger p1=ticketBooking.bookedTicket[i];
					//Passenger p2=ticketBooking.bookedTicket[i+1];
					Passenger temp=ticketBooking.bookedTicket[j];
					ticketBooking.bookedTicket[j]=ticketBooking.bookedTicket[j+1];
					//ticketBooking.bookedTicket[j+1]=temp;
					//ticketBooking.bookedTicket[j].passengerDetails(); ////____________>>>>
				}
				//CHECKING CONDITION:
				//----------------------------------------------------------------------------
				
				//---------------------------------------------------------------------------
  				ticketBooking.bookedTicket[n1]=null;
				
//				//for minise value: count
				System.out.println(p.bP+"------------");	
				if(p.bP=='U' || p.bP=='u') {
					ticketBooking.uBCount++;
					System.out.println("call Upper ");//=================
				}else if(p.bP=='M' || p.bP=='m') {
					ticketBooking.mBCount++;
					System.out.println("call middle ");//===================
					
				}else if(p.bP=='L' || p.bP=='l') {
					ticketBooking.lBCount++;
					System.out.println("call Lower CHeck");//===================
				}
				
				ticketBooking.topTicketCount--; //minise 1 value
				ticketBooking.avaiableTicketCount++;
				
				System.out.println("-------------------PRint All Detail(A)--------------------");
				for(int c=0;c<ticketBooking.topTicketCount;c++) {
					Passenger cc=ticketBooking.bookedTicket[c];
					cc.passengerDetails();
				}
				System.out.println("-------------------PRint All Detail(A)--------------------");
				
			}
		}
		//2. ARRAY -->2
		for(int i=0;i<n2;i++) {
			Passenger p=ticketBooking.bookedRAC[i]; //temp obj
			Passenger p2=ticketBooking.bookedRAC[i+1];
			if(pNR==p.pNR) {
				for(int j=i;j<n2-1;j++) {
					p.setDetails(p2);
				}
				ticketBooking.rACCount++; //ticket count + 1;
				ticketBooking.avaiableTicketCount--;
				ticketBooking.topRAC--; //minise 1 value
				
			}
		}
		//3.  ARRAY -->3
		for(int i=0;i<n3;i++) {
			Passenger p=ticketBooking.bookedRAC[i]; //temp obj
			Passenger p2=ticketBooking.bookedRAC[i+1];
			if(pNR==p.pNR) {
				for(int j=i;j<n3-1;j++) {
					p.setDetails(p2);
				}
				ticketBooking.wLCount++; //ticket count + 1;
				//ticketBooking.avaiableTicketCount--;
				ticketBooking.topWL--; //minise 1 value
				
			}
		}
		System.out.println("Ticket Canceled Successful!!!");
		}
		
	}

	private static void ticketBook(TicketBooking ticketBooking) {
		Scanner in=new Scanner(System.in);
		Passenger passenger;
		//Variables:
		int bookCount; //HOW MANY TICKET YOU WANT TO BOOK:
	
		String name;
		char berthPerference; 
		int age; 
		char gender;
		int pNR;
		System.out.print("Enter How Many TIckets : ");
		bookCount=in.nextInt();
		if(TicketBooking.avaiableTicketCount>=bookCount) {
			pNR=TicketBooking.pNRNumber;
			while(bookCount>0) {
				System.out.print("Enter Name : ");
				name=in.next();
				System.out.print("Enter berthPerference(U,M,L) : ");
				berthPerference=in.next().charAt(0);
				System.out.print("Enter Age : ");
				age=in.nextInt();
				System.out.print("Enter gender (M/F) : ");
				gender=in.next().charAt(0);
				
				passenger=new Passenger(name,age,gender,pNR);
				ticketBooking.bookTickets(berthPerference,passenger);
				bookCount--;
			
			}
			System.out.println("Your PNR NUMBER : " + TicketBooking.pNRNumber);
			TicketBooking.pNRNumber++;
			
		}else {
			System.out.println(bookCount + " number of ticketes Not Avaiable!!!");
		}
		 
		
	}

}
