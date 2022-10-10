package RailwayPackage;

public class Passenger  {
	String name;
	int age;
	char gender;
	char bP;
	int pNR;
	String seatNumber;
	
	public Passenger(String name,int age,char gender,int pNR) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.pNR=pNR;
		seatNumber=" ";
	}
	void passengerDetails() {
		System.out.println("----------------------------");
		System.out.println("\nName  : " + name);
		System.out.println("Age     : " + age);
		System.out.println("gender  : " + gender);
		System.out.println("SeatNo. : " + seatNumber);
		System.out.println("pNR N0  : " + pNR + "\n");
		System.out.println("----------------------------");
	}
	public void setDetails(Passenger p2) {
		this.name=p2.name;
		this.age=p2.age;
		this.gender=p2.gender;
		this.pNR=p2.pNR;
		this.seatNumber=p2.seatNumber;
	}
}
