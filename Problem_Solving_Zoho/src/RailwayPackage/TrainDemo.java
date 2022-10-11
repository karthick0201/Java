package RailwayPackage;

import java.util.*;

public class TrainDemo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("------------------------------------");
		System.out.println("\n TRAIN TICKET BOOKING\n");
		System.out.println("------------------------------------");



		/*VARIABLE DECLERARATION:   */
		TicketBooking ticketBooking=new TicketBooking(); 
		int end;
		int pNR;
		int serialNumber;


		do {
			System.out.println("\n==================================");
			System.out.println("1. Book Ticket\n2. Cancel Ticket\n3. Print Ticket\n4. Avaiable Ticket\n5. Exit ");
			System.out.println("===================================\n");
			System.out.print("Enter Your Option!!!  :  ");

			end=in.nextInt();

			switch(end) {
			case 1:
				System.out.println("\tTIcket Booking:");
				System.out.println("\t---------------");
				ticketBook(ticketBooking);
				break;
			case 2:
				System.out.println("Cancel Booking: \n------------------");
				System.out.println("Enter Serial Number to Cancel : ");
				serialNumber=in.nextInt();
				ticketCancel(ticketBooking,serialNumber);


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
			case 8:
				TicketBooking.admin();
				
				break;
				
			default:
				System.out.println("Wrong Option!!!\n\tYou Fool!!!");
				break;
			}
		}while(end!=5);



	}

	private static void ticketCancel(TicketBooking ticketBooking,int serialNumber) {

		if(ticketBooking.avaiableTicketCount==8) {   
			System.out.println("No Tickets Avaiable to Cancel!!!");
			return;
		}
		else{
			int n1=ticketBooking.topTicketCount;
			for(int i=0;i<n1;i++) {
				Passenger p=ticketBooking.bookedTicket[i];

				if(p.serialNumber==serialNumber) {

					for(int j=i;j<n1-1;j++) {
						ticketBooking.bookedTicket[j]=ticketBooking.bookedTicket[j+1];
						
					}
					ticketBooking.topTicketCount--; //minise 1 value
					ticketBooking.avaiableTicketCount++;
					
					if(p.bP=='U' || p.bP=='u') {
						ticketBooking.uBCount++;
						System.out.println(">>>>>>call Upper<<<<<<< ");
						
						if(TicketBooking.topRAC!=0) {
							/*Seat Number and Berth CHange 
							 * LINE NUMBER : 104,106,107
							 */
							String seatNum=ticketBooking.bookedTicket[ticketBooking.topTicketCount].seatNumber; 
							//System.out.println("Checking SeatNumber : (B)" + seatNum);
							
							ticketBooking.bookedTicket[ticketBooking.topTicketCount++]=ticketBooking.bookedRAC[0];
							//CHANGING BERTHPERFERENCE:
							//ticketBooking.bookedTicket[ticketBooking.topTicketCount-1].bP='U';
							//CHANGE SEAT NUMBER:
						//	String seatNum=ticketBooking.bookedTicket[ticketBooking.topTicketCount].seatNumber; //100 LINE NUMBER
							//System.out.println(ticketBooking.bookedTicket[ticketBooking.topTicketCount-1].seatNumber=seatNum);
							//System.out.println("Checking SeatNumber : (A)" + seatNum);
							//change berth();
							swapBerthId(seatNum,ticketBooking.topTicketCount-1,'U');  //105,108  ||  PASS  : 
							
							//same code
							ticketBooking.avaiableTicketCount--;
							//RAC SWAP
							if(ticketBooking.topRAC==1) {
								ticketBooking.topRAC--;
								//2 conditions
								ticketBooking.uBCount--;
								ticketBooking.rACCount++;
								System.out.println("CHeck top==1 : (if)");
							}
							else if(ticketBooking.topRAC>1) {
								for(int j=0;j<ticketBooking.topRAC-1;j++) {
									ticketBooking.bookedRAC[j]=ticketBooking.bookedRAC[j+1];
								}
								ticketBooking.topRAC--;
								ticketBooking.uBCount--;
								ticketBooking.rACCount++;
								System.out.println("CHeck top>1 : (else if)");
							}else {
								System.out.println("CHeck top==1! : (else)");
							}
							
							
							
							//waiting LIst CHeck:
							//same like RAC
						/*===================================================================*/
							if(TicketBooking.topWL!=0) {
								//SEAT NO AND BERTH PERFERNCE CANGE CODE:
								
								/*--------------
								 * ----------------
								 * --------------- */
								
								if(ticketBooking.topWL==1) {
									ticketBooking.topWL--;
									//----balancecode type
								}else if(true) {
									
								}
							}
						}
					}else if(p.bP=='M' || p.bP=='m') {
						
						ticketBooking.mBCount++;
						System.out.println(">>>>>>>call middle ");
						
						if(TicketBooking.topRAC!=0) {
							//seat change : 
							String seatNum=ticketBooking.bookedTicket[ticketBooking.topTicketCount].seatNumber; 
							ticketBooking.bookedTicket[ticketBooking.topTicketCount++]=ticketBooking.bookedRAC[0];
							swapBerthId(seatNum,ticketBooking.topTicketCount-1,'M');
							
							//ticketBooking.bookedTicket[ticketBooking.topTicketCount++]=ticketBooking.bookedRAC[0];
							ticketBooking.avaiableTicketCount--;
							//RAC SWAP
							if(ticketBooking.topRAC==1) {
								ticketBooking.topRAC--;
								//2 conditions
								ticketBooking.mBCount--; //up / mi
								ticketBooking.rACCount++;
								System.out.println("CHeck top==1 : (if)");
							}
							else if(ticketBooking.topRAC>1) {
								for(int j=0;j<ticketBooking.topRAC-1;j++) {
									ticketBooking.bookedRAC[j]=ticketBooking.bookedRAC[j+1];
								}
								ticketBooking.topRAC--;
								ticketBooking.mBCount--;
								ticketBooking.rACCount++;
								System.out.println("CHeck top>1 : (else if)");
							}else {
								System.out.println("CHeck top==1! : (else)");
							}
						}

					}else if(p.bP=='L' || p.bP=='l') {
						ticketBooking.lBCount++;
						System.out.println(">>>>>>>>call Lower<<<<<<<<");
						
						if(TicketBooking.topRAC!=0) {
							
							//seat change : 
							String seatNum=ticketBooking.bookedTicket[ticketBooking.topTicketCount].seatNumber; 
							ticketBooking.bookedTicket[ticketBooking.topTicketCount++]=ticketBooking.bookedRAC[0];
							swapBerthId(seatNum,ticketBooking.topTicketCount-1,'L');
							
							//ticketBooking.bookedTicket[ticketBooking.topTicketCount++]=ticketBooking.bookedRAC[0];
							
							ticketBooking.avaiableTicketCount--;
							//RAC SWAP
							if(ticketBooking.topRAC==1) {
								ticketBooking.topRAC--;
								//2 conditions
								ticketBooking.lBCount--;
								ticketBooking.rACCount++;
								System.out.println("CHeck top==1 : (if)");
							}
							else if(ticketBooking.topRAC>1) {
								for(int j=0;j<ticketBooking.topRAC-1;j++) {
									ticketBooking.bookedRAC[j]=ticketBooking.bookedRAC[j+1];
								}
								ticketBooking.topRAC--;
								ticketBooking.lBCount--;
								ticketBooking.rACCount++;
								System.out.println("CHeck top>1 : (else if)");
							}else {
								System.out.println("CHeck top==1! : (else)");
							}
							
						}
						
						
					}

//					ticketBooking.topTicketCount--; //minise 1 value
//					ticketBooking.avaiableTicketCount++;
				}
			}
			//================================================================
			//2. ARRAY -->2
			int n2=ticketBooking.topRAC;
			for(int i=0;i<n2;i++) {
				Passenger p=ticketBooking.bookedRAC[i]; 
				if(p.serialNumber==serialNumber) {
					for(int j=i;j<n2-1;j++) {
						ticketBooking.bookedRAC[j]=ticketBooking.bookedRAC[j+1];
					}
				
					ticketBooking.rACCount++; //ticket count + 1;
					ticketBooking.avaiableTicketCount++;
					ticketBooking.topRAC--; //minise 1 value
				}
			}
			//3.  ARRAY -->3
			int n3 = ticketBooking.topWL;
			for(int i=0;i<n3;i++) {
				Passenger p=ticketBooking.bookedWL[i]; //temp obj
				if(serialNumber==p.serialNumber) {
					for(int j=i;j<n3-1;j++) {
						ticketBooking.bookedWL[j]=ticketBooking.bookedWL[j+1];
					}
					ticketBooking.wLCount++; //ticket count + 1;
//					ticketBooking.avaiableTicketCount--;
					ticketBooking.topWL--; //minise 1 value
					
				}
			}
			System.out.println("Cancel Successfully...");
		}

	}

	private static void swapBerthId(String seatNum, int index, char bP) {
		//ticketBooking.bookedTicket[ticketBooking.topTicketCount-1].bP='U';
		TicketBooking.bookedTicket[index].bP=bP;
		// ticketBooking.bookedTicket[ticketBooking.topTicketCount-1].seatNumber=seatNum;
		TicketBooking.bookedTicket[index].seatNumber=seatNum;
		
		
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
			printBill(bookCount);
			System.out.println("Your PNR NUMBER : " + TicketBooking.pNRNumber);
			TicketBooking.pNRNumber++;

		}else {
			System.out.println(bookCount + " number of ticketes Not Avaiable!!!");
		}


	}

	private static void printBill(int bookCount) {
		int ticketPrice=1000;
		System.out.println("================================================");
		System.out.println("Ticket Price      : " + ticketPrice);
		System.out.println("Number of Tickets : "+ bookCount);
		System.out.println("TOTAL PRICE       : Rs. " + (bookCount*ticketPrice));
		System.out.println("================================================");
		
		
	}

}
