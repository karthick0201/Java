package citizenPackagePojo;

import java.util.List;

public class PrimeCustomer extends Customer {

	public PrimeCustomer(String name, String adharNo, String phoneNo, String dateOfBirth, String location, String email,
			String drivingLicence, boolean subscription, String userName, String password) {
		super(name, adharNo, phoneNo, dateOfBirth, location, email, drivingLicence, subscription, userName, password);
	}
	// special method override
}
