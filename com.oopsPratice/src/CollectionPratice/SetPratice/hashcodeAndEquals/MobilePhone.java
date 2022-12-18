package CollectionPratice.SetPratice.hashcodeAndEquals;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class MobilePhone {
	public static void main(String[] args) {
		SmartPhone iphoneX=new SmartPhone("apple", 78000, 4);
		SmartPhone samsung=new SmartPhone("samsung", 46000, 6);
		SmartPhone redmi=new SmartPhone("redmi", 18000, 12);
		SmartPhone realme=new SmartPhone("realme", 19000, 8);
		SmartPhone lenovo=new SmartPhone("lenovo", 32000, 6);
			
		Set<SmartPhone> mobiles = new LinkedHashSet<SmartPhone>();
		mobiles.add(iphoneX);
		mobiles.add(samsung);
		mobiles.add(redmi);
		mobiles.add(realme);
		mobiles.add(lenovo);
		//add same name
		mobiles.add(new SmartPhone("lenovo", 32000, 6));
		
		//ITERATION:
		Iterator<SmartPhone> i=mobiles.iterator();
		while(i.hasNext()) {
			SmartPhone s=(SmartPhone)i.next();
			s.display();
			System.out.println(s.hashCode());
		}
		
		
		
		
	}
}

class SmartPhone {
	private String brand;
	private int price;
	private int ram;

	public SmartPhone(String brand, int price, int ram) {
		this.brand = brand;
		this.ram = ram;
		this.price = price;

	}
	@Override
	public int hashCode() {
		
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		
		SmartPhone sp=(SmartPhone)obj;
		if(this.brand.equals(sp.brand)) {
			return true;
		}
		return false;
	}
	void display() {
		System.out.println("---------------------");
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Ram   : " + ram);
		System.out.println("---------------------");
	}
}
