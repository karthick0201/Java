package vehicleRentalManage;

import java.util.Comparator; 
import java.util.Map;
import java.util.Map.Entry;


import vehiclePackage.AbstractVehicle;

public class ComparatorDemo implements Comparator<Map.Entry<String, AbstractVehicle>> {


	@Override
	public int compare(Entry<String, AbstractVehicle> o1, Entry<String, AbstractVehicle> o2) {

		AbstractVehicle c1 = o1.getValue();
		AbstractVehicle c2 = o2.getValue();
		int no=c1.getBrand_name().compareTo(c2.getBrand_name());
		if (no > 0)
			return +1;
		else if (no < 0)
			return -1;
		else
			return 0;
	}

}
