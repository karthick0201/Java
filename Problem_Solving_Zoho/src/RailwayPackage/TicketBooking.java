package RailwayPackage;

public class TicketBooking{
	//TICKET AVAIABLITY: --> UNCHANGED 
	final static int upperBerth=2;
	final static int middleBerth=2;
	final static int lowerBerth=2;
	final static int rAC=2;
	final static int wL=3;
	//TICKET COUNT
	static int uBCount=2; //2
	static int mBCount=2;//2
	static int lBCount=2;//2
	static int rACCount=2;//2
	static int wLCount=3; //2

	static int avaiableTicketCount=8;   //---> Total Count
	
	//ARRAY OF OBJECTS:
	static Passenger bookedTicket[]=new Passenger[upperBerth+middleBerth+lowerBerth];
	static Passenger bookedRAC[]=new Passenger[rAC];
	static Passenger bookedWL[]=new Passenger[wL];
	//TOTAL ARRAY COUNT:  --> n
	static int bookedTicketLength=bookedTicket.length; // ---> n 6
	static int bookedRACLength=bookedRAC.length; // -->  n 2
	static int bookedWLLength=bookedWL.length;  //-->   n  3
	
	//ARRAY COUNT:  -----> like TOP value:
	static int topTicketCount=0;
	static int topRAC=0;
	static int topWL=0;
	//PNR NUMBER GENERATE:
	static int pNRNumber=1;
	
	
	public void bookTickets(char bP, Passenger p) {
//		System.out.print("Checking   bookticket");
		if(p.age<=6) {
			System.out.println("hello");
			return;
		}
		if((uBCount>0 && (bP == 'U' || bP=='u')) || (mBCount>0 && (bP == 'M' || bP=='m')) || (lBCount>0 && (bP == 'L' || bP=='l'))) {
			
			if(uBCount>0 && (bP == 'U' || bP=='u')) {
				System.out.println("Upper Given!");
				//Add Object:
				p.seatNumber=topTicketCount+1+ "U";  //-->Seat Number
				bookedTicket[topTicketCount++]=p;
				p.bP=bP;  // ------------------------->> checking 
				//-- one 
				uBCount--;
				avaiableTicketCount--;
				
				
			}else if(mBCount>0 && (bP == 'M' || bP=='m')) {
				System.out.println("Middle Given");
				//Add Object:
				p.seatNumber=topTicketCount+1 + "M";  //-->Seat Number
				bookedTicket[topTicketCount++]=p;
				p.bP=bP;  // ------------------------->> checking
				//-- one 
				mBCount--;
				avaiableTicketCount--;
				
			}else if(lBCount>0 && (bP == 'L' || bP=='l')) {
				System.out.println("Lower Given");
				//Add Object:
				p.seatNumber=topTicketCount+1 + "L";  //-->Seat Number
				bookedTicket[topTicketCount++]=p;
				p.bP=bP;  // ------------------------->> checking
				//-- one 
				lBCount--;
				avaiableTicketCount--;
				
			}
		}else if(uBCount>0) { 
			System.out.println("Upper Given");
			//Add Object:
			p.seatNumber=topTicketCount+1 + "U";  //-->Seat Number
			bookedTicket[topTicketCount++]=p;
			p.bP=bP;  // ------------------------->> checking
			//-- one 
			uBCount--;
			avaiableTicketCount--;
		}else if(mBCount>0) { 
			System.out.println("Middle Given");
			//Add Object:
			p.seatNumber=topTicketCount+1 + "M";  //-->Seat Number
			bookedTicket[topTicketCount++]=p;
			p.bP=bP;  // ------------------------->> checking
			//-- one 
			mBCount--;
			avaiableTicketCount--;
		}else if(lBCount>0) {
			//Add Object:
			p.seatNumber=topTicketCount+1 + "L";  //-->Seat Number
			bookedTicket[topTicketCount++]=p;
			p.bP=bP;  // ------------------------->> checking
			//-- one 
			lBCount--;
			avaiableTicketCount--;
			System.out.println("Lower Given");
		}else if(rACCount>0) { 
			System.out.println("RAC Given");
			//Add Object:
			p.seatNumber=topRAC+1 + "R";  //-->Seat Number
			bookedRAC[topRAC++]=p;
			p.bP=bP;  // ------------------------->> checking
			//-- one 
			rACCount--;
			avaiableTicketCount--;
		}else if(wLCount>0) { 
			System.out.println("Waiting Given");
			p.bP=bP;  // ------------------------->> checking
			//Add Object:
			p.seatNumber=topWL+1 + "WL";  //-->Seat Number
			bookedRAC[topWL++]=p;
			//-- one 
			wLCount--;
		}

	}
	void PrintDetails(int pNR) {
		if(topTicketCount==0) {
			System.out.println("No Tickets Avaiable!!!");
			return;
		}
		int n=topTicketCount;
		for(int i=0;i<n;i++) {
			Passenger psg=bookedTicket[i];
			if(psg.pNR==pNR) {
				psg.passengerDetails();
			}
		}
		/*try{
			for(Passenger p : bookedTicket) {
				if(p.pNR == pNR ) {
					p.passengerDetails();
				}
			}
		}
		catch(Exception e) {
			System.out.println("");
		}*/
		
	}
	void avaiableTicket() {
		System.out.println("Avaiable Ticket Count : " + avaiableTicketCount);
		System.out.println("Upper  : "+ uBCount);
		System.out.println("Middle : "+ mBCount);
		System.out.println("Lower  : "+ lBCount);
		System.out.println("RAC    : "+ rACCount);
	}
}
