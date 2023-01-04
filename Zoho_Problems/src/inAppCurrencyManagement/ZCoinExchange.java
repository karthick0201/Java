package inAppCurrencyManagement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ZCoinExchange {
	Scanner in=new Scanner(System.in);
	static int ZID = 31;
	static Map<String, User> users = new HashMap<String, User>();
	static Map<String, User> bendingStatus = new HashMap<String, User>();

	public static boolean authenticateAdmin(String email, String password) {
		if (email.equals("admin") && password.equals("admin")) {
			return true;
		}
		return false;
	}

	public boolean vaildateUser(String email, String password) {
//		Set<Map.Entry<String,User>> s=users.entrySet();
//		
//		Iterator<Map.Entry<String, User>> i=s.iterator();
//		while(i.hasNext()) {
//			Map.Entry<String, User> me=i.next();
//			if(email.equals())
//		}
//		//for null check
		try {
			if (users.isEmpty()) {
				return false;
			}

			User u = (User) users.get(email);
			if (u.getEmail().equals(email) && u.getPassword().equals(password)) {
				return true;
			}
			return false;
		}catch(NullPointerException n) {
			System.out.println("No-User Found!!! \n If you Register... \nWait for Admin Approvel!!!");
			return false;
		}
		
	}

	public void display1() {
		Set<Map.Entry<String, User>> s = users.entrySet();

		Iterator<Map.Entry<String, User>> i = s.iterator();
		while (i.hasNext()) {
			Map.Entry<String, User> me = i.next();
			User u = me.getValue();
			u.display();
		}
	}

	public void display2() {
		Set<Map.Entry<String, User>> s = bendingStatus.entrySet();

		Iterator<Map.Entry<String, User>> i = s.iterator();
		while (i.hasNext()) {
			Map.Entry<String, User> me = i.next();
			User u = me.getValue();
			u.display();
		}
	}

	public void requestSession() {
		
		System.out.println("<--New Registers Benging-->");
		display2();
		boolean check=true;
		String key;
		System.out.println("1. add User\n2. Remove\n3. Back");
		int choice=in.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter Email To add User : ");
			key=in.next();
			
			User u=(User)ZCoinExchange.bendingStatus.get(key);
			//set zid
			setZID(u);
			//add to users map
			ZCoinExchange.users.put(u.getEmail(), u);
			//remove to bending map
			ZCoinExchange.bendingStatus.remove(u.getEmail());
			System.out.println("Accecpted ");
			return;
			
			
		case 3:
			return;
		case 2:
			System.out.println("Enter Email To Remove User : ");
			key=in.next();
			
			User u2=(User)ZCoinExchange.bendingStatus.get(key);
			ZCoinExchange.bendingStatus.remove(u2.getEmail());
			System.out.println("Removed!!! ");
			return;
			default:
				System.out.println("wrong option!!!");
				
		}
		
		
	}

	private void setZID(User u) {
		u.setzId(String.valueOf(ZCoinExchange.ZID++));
		
	}

}
