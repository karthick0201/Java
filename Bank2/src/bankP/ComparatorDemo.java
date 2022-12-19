package bankP;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

import bank.customer.Customer;

public class ComparatorDemo implements Comparator<Map.Entry<String, Customer>> {


	@Override
	public int compare(Entry<String, Customer> o1, Entry<String, Customer> o2) {

		Customer c1 = o1.getValue();
		Customer c2 = o2.getValue();

		if (c1.getBalance() > c2.getBalance())
			return -1;
		else if (c1.getBalance() < c2.getBalance())
			return +1;
		else
			return 0;
	}

}
