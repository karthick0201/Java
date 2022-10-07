package Pdf_2;

import java.util.Scanner;

public class PalindromeNotSplChar_1 {

	public static void main(String[] args) {
		
/*
----------------------------------------------------------------------------------------------
1. Given a String with or without special characters find if it is Palindrome or Not.. No splitting of
array must be done or No additional spaces must be used for storing the array..
		
		Eg :  RACE CAR
		Eg :  I DID, DID I ?
		
----------------------------------------------------------------------------------------------
		 * */
		
		Scanner in=new Scanner(System.in);
		//INPUT
		String sen = in.nextLine();
		 
		char[] A = sen.toCharArray();
		int n=A.length;
		
		//ALGORITHM
		int flag=0;
		for(int i=0,j=n-1;i<j;i++,j--) {
			while(!(A[i]>='a' && A[i]<='z' || A[i]>='A' && A[i]<='Z')) {
				i++;
			}
			while(!(A[j]>='a' && A[j]<='z' || A[j]>='A' && A[j]<='Z')) {
				j--;
			}
			if(i<j) {
				if(A[i]!=A[j]) {
					flag++;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}


	}

}
