package RailwayPackage;

public class Passenger  {
	String name;
	int age;
	char gender;
	char bP;
	int pNR;
	String seatNumber;
	int serialNumber;
	static int SERIALNUMBER=1;
	
	public Passenger(String name,int age,char gender,int pNR) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.pNR=pNR;
		seatNumber="";
		serialNumber=SERIALNUMBER++;
	}
	void passengerDetails() {
		System.out.println("----------------------------");
		System.out.println("\nName  : " + name);
		System.out.println("Age     : " + age);
		System.out.println("gender  : " + gender);
		System.out.println("pNR N0  : " + pNR);
		System.out.println("berthP  : " + bP);
		System.out.println("serialNumber  : " + serialNumber + "\n");
		
		System.out.println("----------------------------\n");
		//System.out.println("SeatNo. : " + seatNumber);
	}
//	public void setDetails(Passenger p2) {
//		this.name=p2.name;
//		this.age=p2.age;
//		this.gender=p2.gender;
//		this.pNR=p2.pNR;
//		this.seatNumber=p2.seatNumber;
//	}
}
