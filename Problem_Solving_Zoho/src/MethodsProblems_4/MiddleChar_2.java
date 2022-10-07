package MethodsProblems_4;

import java.util.Scanner;

public class MiddleChar_2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String : ");
		String sen=in.next();
		
		findMiddleChar(sen);

	}

	private static void findMiddleChar(String sen) {
	
		char A[] = sen.toCharArray();
		int n=A.length;
		
		if(n%2==1) {
			System.out.println(A[n/2]);
		}
		else {
			System.out.println(A[(n/2)-1] + " , " + A[(n/2)]);
		}
		
	}

}
