package MethodsProblems_4;

import java.util.Scanner;

public class TwinPrimeNumber_6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//int n = 100;
		System.out.println("ENter Number : ");
		int n=in.nextInt();
		findTwinPrimeNumber(n);
	
	}

	private static void findTwinPrimeNumber(int n) {
		for(int i=2;i<n;i++) {
			boolean result = findPrimeNumber(i);
			if(result) {
				int c = i+2;
				boolean result1 = findPrimeNumber(c);
//				System.out.println(c+" "+result1);
				if(result1) {
					System.out.println("("+i+","+c+")");
				}
			}
		}
	}
	private static boolean findPrimeNumber(int n) {
		boolean check = true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				check = false;
				break;
			}
		}
		return check;
	}
}
