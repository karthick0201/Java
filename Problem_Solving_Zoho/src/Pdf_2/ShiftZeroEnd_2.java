package Pdf_2;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftZeroEnd_2 {

	public static void main(String[] args) {
		
		/*
----------------------------------------------------------------------------------------------
2. Given an array of integers of size n. Convert the array in such a way that if next valid number is
same as current number, double its value and replace the next number with 0. After the
modification, rearrange the array such that all 0’s are shifted to the end.


Input  : arr[] = {2, 2, 0, 4, 0, 8}      
Output : 4 4 8 0 0 0
 
Input  : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}  
Output : 4 2 12 8 0 0 0 0 0 0
----------------------------------------------------------------------------------------------
		 * */
		
		//INPUT:
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		int A[] = new int[n];
		for(int i=0;i<n;i++) {
			A[i]=in.nextInt();
		}
		
		//ALGORITHM:
		//int k=1;
		for(int i=0;i<n-1;i++) {	
			//if(A[i]==A[k] && A[i]!=0 && A[k]!=0) {
			if(A[i]==A[i+1]) {
				A[i] = 2*A[i];
				A[i+1]=0;
			}
		//	k++;
		}
		System.out.println(Arrays.toString(A));
		int j=0;
		for(int i=0;i<n;i++) {
		 if(A[i]!=0) {
			int temp=A[i];
			A[i] = A[j];
			A[j]=temp;			
			j++;
//				System.out.println(A[n-1];	
			}
		}
		System.out.println(Arrays.toString(A));
	}


}


