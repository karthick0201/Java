package com.abstractPratice.tnstcAbstract;

public class TnstcDemo {

	public static void main(String[] args) {

		Karthick karthick = new Karthick(new Vijay());

	}

}

abstract class Tnstc {

	public final void ticketPrice() {

	}

	public final void ticket() {

	}

}

abstract class DistictTnstc extends Tnstc {

	public final void decideBus() {

	}

	public final void busTripCountPerDay() {

	}

	public final void busTravelTime() {

	}

}

abstract class Contactor extends DistictTnstc {

	public abstract void getMondey();

	public abstract void giveTicketToPassenger();
}

abstract class Driver extends DistictTnstc {
	public abstract void driveVehicle();
}

class Karthick extends Driver {

	DistictTnstc d;

	public Karthick(DistictTnstc d) {
		this.d = d;
	}

	public Karthick() {
	}

	@Override
	public void driveVehicle() {

	}

}

class Vijay extends Contactor {
	DistictTnstc d;

	public Vijay(DistictTnstc d) {
		this.d = d;
	}

	public Vijay() {
	}

	@Override
	public void getMondey() {

	}

	@Override
	public void giveTicketToPassenger() {

	}

}
