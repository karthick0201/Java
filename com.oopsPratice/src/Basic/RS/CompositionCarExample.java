package Basic.RS;

//GOOD EXAMPLE I THINK
/***********COMPOSITION--> PART OF OR WHOLE OF********
bathroom --> without bathroom its not bathroom
Bank --> Without money its not bank --> not functioning
		Customer is a assocation... communicate between objects
		Employee is a aggrication... --> without employee we requirt another 
		
***************************************************************88*/


public class CompositionCarExample {

	public static void main(String[] args) {
		Petrol jioPetrol=new Petrol("jioPetrol");
		Tyire tyire=new Tyire("MRF");
		Engine engine=new Engine("2L",jioPetrol);
		Car audi=new Car("Audi",engine,tyire);
		Car bmw=new Car("Bmw");
		bmw.run();
		audi.run();
	}
	
}
class Car{
	String carName;
	Engine e;
	Tyire t;
	Car(String carName){
		this.carName=carName;
	}
	Car(String carName,Engine e,Tyire t){
		this.carName=carName;
		this.e=e;
		this.t=t;
	}
	
	void run() {
		if(e==null && t==null) {
			System.out.println("car not moving");
			return;
		}
		System.out.println("Car is moving");
	}
}
class Engine{
	String enginetype;
	Petrol p;
	public Engine(String enginetype,Petrol p) {
		this.enginetype=enginetype;
		this.p=p;
	}
}
class Tyire{
	String brand;
	public Tyire(String b) {
		brand=b;
	}
}
class Petrol{
	String petrolName;
	public Petrol(String p) {
		petrolName=p;
	}
}
