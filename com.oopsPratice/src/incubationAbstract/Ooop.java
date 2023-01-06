package incubationAbstract;

public class Ooop {
	public static void main(String[] args) {
		IncubationBatcg no_25 = new Kadhar1();
	}
}

abstract class IncubationBatcg {
	public abstract void Learning();
}

abstract class General extends IncubationBatcg {
	public final void Level1() {
		System.out.println("level 1");
	}

	public final void level2() {
		System.out.println("level 2");
	}

	public final void level3() {
		System.out.println("level 3");
	}

	public abstract void technical();
}

abstract class CRM extends IncubationBatcg {

}

class Karthik extends CRM {
	@Override
	public void Learning() {

	}

}

class Kadhar1 extends General {
	@Override
	public void Learning() {
		System.out.println("level 1");

	}

	@Override
	public void technical() {
		System.out.println("java");
	}
}

class Aadhil extends General {
	@Override
	public void Learning() {
		System.out.println("level 2");

	}

	@Override
	public void technical() {
		System.out.println("java");

	}
}
