package Pdf_2;

import java.util.Scanner;

public class Number_Occurrences_8 {

	public static void main(String[] args) {
		/*
----------------------------------------------------------------------------------------------
8. Given an array of positive integers. The output should be the number of occurrences of each
number.

Example:
		Input: {2, 3, 2, 6, 1, 6, 2}
		Output:
		1 –> 1 
		2 –> 3
		3 –> 1
		6 –> 2
----------------------------------------------------------------------------------------------
		 * */
		Scanner in=new Scanner(System.in);
		//INPUT
		int n=in.nextInt();
		int A[] = new int[n];
		for(int i=0;i<n;i++) {
			A[i]=in.nextInt();
		}
		//ALGORITHM
		//1. FIND MAX:
		int max=A[0];
		for(int i=1;i<n;i++) {
			if(max<A[i]) {
				max=A[i];
			}
		}
		//2. Create New Array
		int B[] = new int[max+1];
		
		//3. Hashing Process:
		for(int i=0;i<n;i++) {
			B[A[i]]++;
		}
		//4. RESULT:
		for(int i=0;i<max+1;i++) {
			if(B[i]!=0) {
				System.out.println(i + " -> " + B[i]);
			}

}
	}
}

