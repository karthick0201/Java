package RailwayPackage;

public class TicketBooking{
	//TICKET AVAIABLITY: --> UNCHANGED 
	final static int upperBerth=1;
	final static int middleBerth=1;
	final static int lowerBerth=1;
	final static int rAC=1;
	final static int wL=1;
	//TICKET COUNT
	static int uBCount=1; //2
	static int mBCount=1;//2
	static int lBCount=1;//2
	static int rACCount=1;//2
	static int wLCount=1; //2
	static final int n=(upperBerth +middleBerth + lowerBerth + rAC + wL);  
	static int avaiableTicketCount=(upperBerth +middleBerth + lowerBerth + rAC + wL);   //---> Total Count
	
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
	
	
/*---------------------------------------------NEW VARIABLES------------------------------------------------
String upperTicket[]= {"1U","2U"};
String middleTicket[]= {"3M","4M"};
String lowerTicket[]= {"5L","6L"};
String rACTicket[]= {"7RAC","8RAC"};
String wLTicket[]= {"9WL","10WL"};
//LENGTH ARRAY
int upperTicketN=2;
int middleTicketN=2;
int lowerTicketN=2;
int rACTicketN=2;
int wLTicketN=2;
---------------------------------------------NEW VARIABLES------------------------------------------------*/
	
	
	public void bookTickets(char bP, Passenger p) {  
//		System.out.print("Checking   bookticket");
		if(p.age<=6) {
			System.out.println("Age 6 Perso");
			p.seatNumber="-";
			bookedTicket[topTicketCount++]=p;
			p.bP='-';  // ------------------------->> checking
			//-- one 
			//lBCount--;
			avaiableTicketCount--;
			
			return;
		}
		//else if(p.age > 60 && TicketBook.aLB > 0)
		
		
		if(p.age > 60 && TicketBooking.lBCount > 0) {
			System.out.println("<<<<<<Age :60 Lower Given!!!>>>>>");
			
			
			
			p.seatNumber=topTicketCount+1 + "L";  //-->Seat Number
			bookedTicket[topTicketCount++]=p;
			p.bP='L';  // ------------------------->> checking
			//-- one 
			lBCount--;
			avaiableTicketCount--;
		}else if((uBCount>0 && (bP == 'U' || bP=='u')) || (mBCount>0 && (bP == 'M' || bP=='m')) || (lBCount>0 && (bP == 'L' || bP=='l'))) {
			
			if(uBCount>0 && (bP == 'U' || bP=='u')) {
				System.out.println(">>>>>>>>PREFERED Upper Given<<<<<<<<<");
				//Add Object:
				p.seatNumber=topTicketCount+1+ "U";  //-->Seat Number
				bookedTicket[topTicketCount++]=p;
				p.bP='U';  // ------------------------->> checking 
				//-- one 
				uBCount--;
				avaiableTicketCount--;
				
				
			}else if(mBCount>0 && (bP == 'M' || bP=='m')) {
				System.out.println(">>>>>>>PREFERED Middle Given<<<<<<<<<<");
				//Add Object:
				p.seatNumber=topTicketCount+1 + "M";  //-->Seat Number
				bookedTicket[topTicketCount++]=p;
				p.bP='M';  // ------------------------->> checking
				//-- one 
				mBCount--;
				avaiableTicketCount--;
				
			}else if(lBCount>0 && (bP == 'L' || bP=='l')) {
				System.out.println(">>>>>>>PREFERED Lower Given<<<<<<<<<");
				//Add Object:
				p.seatNumber=topTicketCount+1 + "L";  //-->Seat Number
				bookedTicket[topTicketCount++]=p;
				p.bP='L';  // ------------------------->> checking
				//-- one 
				lBCount--;
				avaiableTicketCount--;
				
			}
		}else if(uBCount>0) { 
			System.out.println(">>>>>>>Upper Given<<<<<<<<<");
			//Add Object:
			p.seatNumber=topTicketCount+1 + "U";  //-->Seat Number
			bookedTicket[topTicketCount++]=p;
			p.bP='U';  // ------------------------->> checking
			//-- one 
			uBCount--;
			avaiableTicketCount--;
		}else if(mBCount>0) { 
			System.out.println(">>>>>>>Middle Given<<<<<<<<<");
			//Add Object:
			p.seatNumber=topTicketCount+1 + "M";  //-->Seat Number
			bookedTicket[topTicketCount++]=p;
			p.bP='M';  // ------------------------->> checking
			//-- one 
			mBCount--;
			avaiableTicketCount--;
		}else if(lBCount>0) {
			//Add Object:
			p.seatNumber=topTicketCount+1 + "L";  //-->Seat Number
			bookedTicket[topTicketCount++]=p;
			p.bP='L';  // ------------------------->> checking
			//-- one 
			lBCount--;
			avaiableTicketCount--;
			System.out.println(">>>>>>>Lower Given<<<<<<<<<");
		}else if(rACCount>0) { 
			System.out.println(">>>>>>>RAC Given<<<<<<<<<");
			//Add Object:
			p.seatNumber=topRAC+1 + "R";  //-->Seat Number
			bookedRAC[topRAC++]=p;
			p.bP='R';  // ------------------------->> checking
			//-- one 
			rACCount--;
			avaiableTicketCount--;
		}else if(wLCount>0) { 
			System.out.println(">>>>>>>Waiting Given<<<<<<<<<");
			p.bP='W';  // ------------------------->> checking
			//Add Object:
			p.seatNumber=topWL+1 + "WL";  //-->Seat Number
			bookedWL[topWL++]=p;
			//-- one 
			wLCount--;
			avaiableTicketCount--;
		}

	}
	void PrintDetails(int pNR) { 
		if(topTicketCount==0) {
			System.out.println(">>>No Tickets Avaiable!!!<<<");
			return;
		}
		int n1=topTicketCount;
		for(int i=0;i<n1;i++) {
			Passenger psg=bookedTicket[i];
			if(psg.pNR==pNR) {
				psg.passengerDetails();
			}
		}
		
		/*==================RAC DETAILS PRINT====================================*/
		int n2=topRAC;
		for(int i=0;i<n2;i++) {
			Passenger psg=bookedRAC[i];
			if(psg.pNR==pNR) {
				psg.passengerDetails();
			}
		}
		/*====================================================================*/
		/*==================WAITING LIST DETAILS PRINT====================================*/
		int n3=topWL;
		for(int i=0;i<n3;i++) {
			Passenger psg=bookedWL[i];
			if(psg.pNR==pNR) {
				psg.passengerDetails();
			}
		}
		/*====================================================================*/
		
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
	static void admin() {
		if(topTicketCount==0) {
			System.out.println(">>>No Tickets Avaiable!!!<<<");
			return;
		}
		int n1=topTicketCount;
		System.out.println("----------U-M-L TICKET---------------");
		System.out.println("U_M_L Array Print : ");
		System.out.println("Top Ticket Count : "+ topTicketCount);
		System.out.println("Total Count : "+ (upperBerth+middleBerth+lowerBerth));
		for(int i=0;i<n1;i++) {
			Passenger psg=bookedTicket[i];
			
				psg.passengerDetails();
			
		}
		System.out.println("----------------------------------");
		
		/*==================RAC DETAILS PRINT====================================*/
		System.out.println("----------RAC ARRAY----------------");
		System.out.println("RAC Array Print : ");
		System.out.println("TOP RAC Ticket Count : "+ topRAC);
		System.out.println("Total Count : "+ rAC);
		int n2=topRAC;
		for(int i=0;i<n2;i++) {
			Passenger psg=bookedRAC[i];
			
				psg.passengerDetails();
			
		}
		System.out.println("----------------------------------");
		/*====================================================================*/
		/*==================WAITING LIST DETAILS PRINT====================================*/
		System.out.println("--------WAITING LIST ARRAY-----------");
		System.out.println("WL Array Print : ");
		System.out.println("TOP WL Ticket Count : "+ topWL);
		System.out.println("Total Count : "+ wL);
		int n3=topWL;
		for(int i=0;i<n3;i++) {
			Passenger psg=bookedWL[i];
			
				psg.passengerDetails();
		}
		System.out.println("----------------------------------");
	}
	void avaiableTicket() { 
		System.out.println("Avaiable Ticket Count : " + avaiableTicketCount);
		System.out.println("Upper  : "+ uBCount);
		System.out.println("Middle : "+ mBCount);
		System.out.println("Lower  : "+ lBCount);
		System.out.println("RAC    : "+ rACCount);
		System.out.println("WL     : "+ wLCount);
	}
}
