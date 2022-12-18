package Basic.RS;

import java.util.Scanner;

public class A1 {

	private String phoneNum;

	public A1() {
	}
	
	public void setPhoneNum() {
		System.out.println("Please enter the phone number ");
		Scanner scan = new Scanner(System.in);
		this.phoneNum = scan.next();
	}


//	public void setPhoneNum(long phoneNum) {
//		this.phoneNum = phoneNum;
//	}

	public String getPhoneNum() {
		return this.phoneNum;
	}


	public void changePhoneNum() {
		String phn = this.phoneNum;
		String s = "";
		for(int i = 1; i<=4; i++) {
			char lastDigit = phn.charAt(phn.length()-i);
			s = lastDigit + s;
			
		}
		s = "******" + s;

		System.out.println("Please enter the complete number ending with " + s);
		Scanner scan = new Scanner(System.in);
		String phone = scan.next();

		if(phone.equals(this.phoneNum)) {
			System.out.println("Great, Please enter the new number ");
			this.phoneNum = scan.next();
			System.out.println("Hurray!!!");
		}
		else {
			System.out.println("Please enter the Correct number ending with "+ s);
		}

	}
}