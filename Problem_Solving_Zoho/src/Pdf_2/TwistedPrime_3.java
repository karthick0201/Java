package Pdf_2;

import java.util.Scanner;

public class TwistedPrime_3 {

	public static void main(String[] args) {

/*
----------------------------------------------------------------------------------------------
3. A number is said to be twisted prime if it is a prime number and reverse of the number is also a
prime number.

	Input  : 97 
	Output : Twisted Prime Number
 
Explanation: 97 is a prime number and 
              its reverse 79 is also a prime number.
----------------------------------------------------------------------------------------------
		 * */
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		
		int number=in.nextInt();
		//CHECK - NUMBER IS PRIME OR NOT 
		boolean c1=isPrime(number);
		//REVERSE THE NUMBER
		int reverse=reverseNumber(number);
		
		boolean c2=isPrime(reverse);
		//CHECKING:
		if(c1==true && c2==true) {
			System.out.println("Twisted Prime Number");
		}
		else {
			System.out.println("Not Twisted Prime Number");
		}

	}

	private static int reverseNumber(int number) {
		int n=0;
		while(number>0) {
			int t=number%10;
			n=(n*10) + t;
			number=number/10;
		}
		return 0;
	}

	private static boolean isPrime(int number) {
		int flag=0;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				flag++;
				break;
			}
		}
		if(flag==0) {
			return true;
		}
		else {
			return false;			
		}
	}

}
