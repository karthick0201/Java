package incubationAbstract;

public class AbstractDemo {
    public static void main(String[] args) {
		Ibaco ice=new Vanila(new Choco());
		Ibaco cho=new Choco(new Vanila());
	}
}
abstract class Ibaco{
	
}
abstract class Nuts extends Ibaco{
	
}
abstract class IceCream extends Ibaco{
	
}
class Choco extends Nuts{
	Ibaco i;
	public Choco() {
		
	}
    public Choco(Ibaco i) {
		this.i=i;
	}
}
class Vanila extends IceCream{
	Ibaco i;
	public Vanila() {
	}
	public Vanila(Ibaco i) {
		this.i=i;
	}
}
