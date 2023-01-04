package citizenPackage;

import java.util.List;

public class PrimeCustomer extends Customer{

	public PrimeCustomer(String name, String adharNo, String phoneNo, String dateOfBirth, String location,
			int customerId, String email, String drivingLicence, boolean subscription, String userName, String password,
			List<Integer> bookingIds) {
		super(name, adharNo, phoneNo, dateOfBirth, location, customerId, email, drivingLicence, subscription, userName,
				password, bookingIds);
		// TODO Auto-generated constructor stub
	}
	//special method override
}
